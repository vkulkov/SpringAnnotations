package com.springinaction.autowiring;

public class Piano implements Instrument {
    @Override
    public void play() {
        System.out.println("PLINK PLINK PLINK");
    }
}
