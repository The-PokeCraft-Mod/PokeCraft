package com.thepokecraftmod.mimikyu.state.states;

import com.thepokecraftmod.mimikyu.field.FieldProperties;
import com.thepokecraftmod.mimikyu.field.Weather;
import com.thepokecraftmod.mimikyu.state.SimpleStateChange;

public class WeatherStateChange extends SimpleStateChange<FieldProperties, Weather> {

    public WeatherStateChange(FieldProperties target, Weather value) {
        super(Type.WEATHER, target, value);
    }

    @Override
    public void handle() {
        target.weather = value;
    }
}
