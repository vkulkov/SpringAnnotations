package com.springinaction.annotations.component;

import com.springinaction.general.Instrument;
import org.springframework.stereotype.Component;

@Component
public class Guitar implements Instrument {
    @Override
    public void play() {
        System.out.println("STRUM STRUM STRUM");
    }
}
