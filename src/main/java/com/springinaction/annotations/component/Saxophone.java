package com.springinaction.annotations.component;

import com.springinaction.general.Instrument;

@SkipIt
public class Saxophone implements Instrument {
    @Override
    public void play() {
        System.out.println("TOOT TOOT TOOT");
    }
}
