package com.springinaction.annotations.configuration;

import com.springinaction.general.Instrument;
import com.springinaction.general.Performer;

public class Instrumentalist implements Performer {
    private String song;
    private Instrument instrument;

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public void perform() {
        System.out.print("Playing " + song + ": ");
        instrument.play();
    }
}
