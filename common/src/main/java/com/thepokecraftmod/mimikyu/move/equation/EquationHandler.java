/*
 * Copyright (C) 2023 ThePokeCraftMod
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package com.thepokecraftmod.mimikyu.move.equation;

import com.thepokecraftmod.mimikyu.Mimikyu;
import com.thepokecraftmod.mimikyu.util.MoveContext;
import com.thepokecraftmod.mimikyu.move.MoveEquationConstant;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.function.BiFunction;

public class EquationHandler {
    private static final Map<Character, BiFunction<String, String, String>> OPERATIONS = new LinkedHashMap<>();
    private static final Map<Integer, List<Character>> OPERATION_TIERS = new LinkedHashMap<>();
    public final List<MoveEquationConstant<?>> constants = new ArrayList<>();

    public EquationHandler add(MoveEquationConstant<?> constant) {
        this.constants.add(constant);
        return this;
    }

    public EquationResult tryParse(MoveContext.Context ctx, String equation) {
        try {
            return new EquationResult(true, null, parseSubEquation(ctx, equation));
        } catch (Exception e) {
            if(Mimikyu.THROW_INSTEAD_OF_ERROR) throw new RuntimeException(e);
            return new EquationResult(false, e.getMessage(), null);
        }
    }

    public EquationResult tryParse(MoveContext.Context ctx, ResourceLocation equation) {
        return tryParse(ctx, equation.toString());
    }

    public String tryParseOrThrow(MoveContext.Context ctx, String equation) {
        var result = tryParse(ctx, equation);
        if (!result.wasSuccessful()) throw new RuntimeException("Failed to Parse Equation. " + result.errorString());
        return result.value();
    }

    public String tryParseOrThrow(MoveContext.Context ctx, ResourceLocation equation) {
        return tryParseOrThrow(ctx, equation.toString());
    }

    private String parseSubEquation(MoveContext.Context ctx, String equation) {
        var hasBrackets = equation.contains("(");
        equation = equation.replace(" ", "");

        var identifierIndex = equation.indexOf(":");
        if (identifierIndex != -1) {
            var leftSide = getLastLeftSideOperation(equation.substring(0, identifierIndex));
            var operationSide = getFirstRightSideOperation(equation.substring(identifierIndex + 1));

            var left = leftSide.length == 2 ? leftSide[1] : leftSide[0];
            var right = operationSide[0];
            var result = getConstant(ctx, new ResourceLocation(left, right));

            var preLeft = leftSide.length == 2 ? leftSide[0] : "";
            var postRight = operationSide.length == 2 ? operationSide[1] : "";
            return parseSubEquation(ctx, preLeft + result + postRight);
        }

        if (hasBrackets) {
            var openingBracketIndex = equation.indexOf("(");
            var closingBracketIndex = equation.lastIndexOf(")");

            equation = equation.substring(0, openingBracketIndex) + parseSubEquation(ctx, equation.substring(openingBracketIndex + 1, closingBracketIndex)) + equation.substring(closingBracketIndex + 1);
        }

        for (var tier : OPERATION_TIERS.values()) {
            SortedMap<Integer, Character> closestIndexMap = new TreeMap<>();

            for (var operation : tier) {
                var index = equation.indexOf(operation);
                closestIndexMap.put(index == -1 ? Integer.MAX_VALUE : index, operation);
            }

            var index = closestIndexMap.firstKey();
            var operation = closestIndexMap.get(index);

            if (index != -1 && index != Integer.MAX_VALUE) {
                var leftSide = getLastLeftSideOperation(equation.substring(0, index));
                var operationSide = getFirstRightSideOperation(equation.substring(index + 1));

                var left = leftSide.length == 2 ? leftSide[1] : leftSide[0];
                var right = operationSide[0];

                if(!left.equals("")) {
                    var result = OPERATIONS.get(operation).apply(left, right);

                    var preLeft = leftSide.length == 2 ? leftSide[0] : "";
                    var postRight = operationSide.length == 2 ? operationSide[1] : "";
                    return parseSubEquation(ctx, preLeft + result + postRight);
                }
            }
        }

        return equation;
    }

    public String getConstant(@Nullable MoveContext.Context ctx, ResourceLocation id) {
        for (MoveEquationConstant<?> constant : constants) {
            if (constant.canSupply().supply(ctx, id))
                return String.valueOf(constant.supplier().supply(ctx));
        }

        throw new RuntimeException(id + " is not provided.");
    }

    private String[] getLastLeftSideOperation(String substring) {
        List<Integer> sortedFurthestIndex = OPERATIONS.keySet().stream().map(substring::lastIndexOf).filter(integer -> integer != -1).sorted().toList();
        if (sortedFurthestIndex.isEmpty()) return new String[]{substring};
        return new String[]{substring.substring(0, sortedFurthestIndex.get(sortedFurthestIndex.size() - 1) + 1), substring.substring(sortedFurthestIndex.get(sortedFurthestIndex.size() - 1) + 1)};
    }

    private String[] getFirstRightSideOperation(String substring) {
        List<Integer> sortedClosestIndex = OPERATIONS.keySet().stream().map(substring::indexOf).filter(integer -> integer != -1).sorted().toList();
        if (sortedClosestIndex.isEmpty()) return new String[]{substring};
        return new String[]{substring.substring(0, sortedClosestIndex.get(0)), substring.substring(sortedClosestIndex.get(0))};
    }

    static {
        OPERATIONS.put('^', (left, right) -> String.valueOf(Math.pow(Double.parseDouble(left), Double.parseDouble(right))));
        OPERATIONS.put('%', (left, right) -> String.valueOf(Double.parseDouble(left) % Double.parseDouble(right)));
        OPERATIONS.put('*', (left, right) -> String.valueOf(Double.parseDouble(left) * Double.parseDouble(right)));
        OPERATIONS.put('/', (left, right) -> String.valueOf(Double.parseDouble(left) / Double.parseDouble(right)));
        OPERATIONS.put('+', (left, right) -> String.valueOf(Double.parseDouble(left) + Double.parseDouble(right)));
        OPERATIONS.put('-', (left, right) -> String.valueOf(Double.parseDouble(left) - Double.parseDouble(right)));
        OPERATIONS.put('(', (left, right) -> {throw new RuntimeException("This can't be reached");});
        OPERATIONS.put(')', (left, right) -> {throw new RuntimeException("This can't be reached");});

        OPERATION_TIERS.put(0, List.of('^', '%'));
        OPERATION_TIERS.put(1, List.of('*', '/'));
        OPERATION_TIERS.put(2, List.of('+', '-'));
    }
}
