package com.springinaction.annotations.configuration;

import com.springinaction.general.Instrument;

public class Saxophone implements Instrument {
    @Override
    public void play() {
        System.out.println("TOOT TOOT TOOT");
    }
}
