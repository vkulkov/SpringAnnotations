package com.springinaction.annotations.inject;

import com.springinaction.general.Instrument;

public class Guitar implements Instrument {
    @Override
    public void play() {
        System.out.println("STRUM STRUM STRUM");
    }
}
