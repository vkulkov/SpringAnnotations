package com.springinaction.annotations.autowired;

import com.springinaction.general.Instrument;
import com.springinaction.general.Performer;
import com.springinaction.general.RandomSongProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Instrumentalist implements Performer {
    private String song;
    private Instrument instrument;

    public String getSong() {
        return song;
    }

    @Value("#{provider.provideSong()}")
    public void setSong(String song) {
        this.song = song;
    }

    @Autowired
    @StringedInstrument
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public void perform() {
        System.out.print("Playing " + song + ": ");
        instrument.play();
    }
}
