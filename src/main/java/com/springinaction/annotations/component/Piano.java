package com.springinaction.annotations.component;

import com.springinaction.general.Instrument;

@SkipIt
public class Piano implements Instrument {
    @Override
    public void play() {
        System.out.println("PLINK PLINK PLINK");
    }
}
