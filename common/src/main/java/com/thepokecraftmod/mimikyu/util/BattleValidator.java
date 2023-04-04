package com.thepokecraftmod.mimikyu.util;

import com.thepokecraftmod.mimikyu.action.Turn;
import com.thepokecraftmod.mimikyu.Battle;

public interface BattleValidator {

    BattleValidator NONE = (battle, currentTurn) -> {};

    void validateTurn(Battle battle, Turn thisTurn);
}
