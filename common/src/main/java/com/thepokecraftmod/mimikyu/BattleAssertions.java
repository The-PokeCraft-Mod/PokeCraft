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

package com.thepokecraftmod.mimikyu;

/**
 * Make sure everything is acting how it should
 */
public class BattleAssertions {

    public static void assertTrue(boolean isTrue) {
        if (!isTrue) {
            var whereItHappened = new Throwable().getStackTrace()[1];
            var message = "Battle Assertion Failed in " + whereItHappened.getClassName() + "\n" + "Method " + whereItHappened.getMethodName() + " On Line " + whereItHappened.getLineNumber();

            if (Mimikyu.THROW_INSTEAD_OF_ERROR) throw new RuntimeException(message);
            else Mimikyu.LOGGER.error(message);
        }
    }
}
