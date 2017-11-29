package com.springinaction.annotations.autowired;

import com.springinaction.general.Instrument;

@StringedInstrument
public class Guitar implements Instrument {
    @Override
    public void play() {
        System.out.println("STRUM STRUM STRUM");
    }
}
