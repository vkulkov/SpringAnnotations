package com.springinaction.annotations.configuration;

import com.springinaction.general.Instrument;
import com.springinaction.general.Performer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringIdolConfig {

    @Bean
    public Performer duke() {
        return new Juggler();
    }

    @Bean
    public Performer kenny() {
        Instrumentalist kenny = new Instrumentalist();
        kenny.setSong("Jingle Bells");
        kenny.setInstrument(saxophone());
        return kenny;
    }

    @Bean
    public Instrument saxophone() {
        return new Saxophone();
    }
}
