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

package com.thepokecraftmod.mimikyu.action;

import com.thepokecraftmod.mimikyu.action.actions.ActionTarget;
import com.thepokecraftmod.mimikyu.action.actions.TargetingAction;
import com.thepokecraftmod.mimikyu.participant.Participant;
import com.thepokecraftmod.mimikyu.Battle;
import com.thepokecraftmod.mimikyu.move.MoveCommand;
import com.thepokecraftmod.mimikyu.move.MoveInstance;
import net.minecraft.client.resources.language.I18n;
import org.jetbrains.annotations.Nullable;

public class MoveAction extends TargetingAction {

    public final MoveInstance moveInstance;
    private final String translationString;

    public MoveAction(MoveInstance moveInstance, Participant<?> sender, ActionTarget target, String translationString) {
        super(SortPosition.MOVES, sender, target, null);
        this.moveInstance = moveInstance;
        this.translationString = translationString;
    }

    @Override
    public ActionResult execute(Battle battle, @Nullable String defaultEffect) {
        var result = new ActionResult(this);
        var moveName = I18n.get(translationString);
        result.setHeading(I18n.get("pokemod.battle.use_move", sender.getName(), moveName));
        var ctx = new MoveCommand.ExecutionContext(battle, battle.getCurrentTurn(), result, moveInstance, sender, target);
        for (var command : moveInstance.data.commands()) command.command().execute(ctx, command.args());
        return result;
    }
}
