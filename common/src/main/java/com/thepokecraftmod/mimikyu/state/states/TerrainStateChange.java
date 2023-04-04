package com.thepokecraftmod.mimikyu.state.states;

import com.thepokecraftmod.mimikyu.field.FieldProperties;
import com.thepokecraftmod.mimikyu.field.Terrain;
import com.thepokecraftmod.mimikyu.state.SimpleStateChange;

public class TerrainStateChange extends SimpleStateChange<FieldProperties, Terrain> {

    public TerrainStateChange(FieldProperties target, Terrain value) {
        super(Type.TERRAIN, target, value);
    }

    @Override
    public void handle() {
        target.terrain = value;
    }
}
