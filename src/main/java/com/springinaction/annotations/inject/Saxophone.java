package com.springinaction.annotations.inject;

import com.springinaction.general.Instrument;

import javax.inject.Named;

@Named("saxophone")
public class Saxophone implements Instrument {
    @Override
    public void play() {
        System.out.println("TOOT TOOT TOOT");
    }
}
