package com.springinaction.annotations.inject;

import com.springinaction.general.Instrument;
import com.springinaction.general.Performer;

import javax.inject.Inject;
import javax.inject.Named;

public class Instrumentalist implements Performer {
    private String song;
    private Instrument instrument;

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    @Inject
    @Named("saxophone")
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public void perform() {
        System.out.print("Playing " + song + ": ");
        instrument.play();
    }
}
