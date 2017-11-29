package com.springinaction.general;

import java.util.Random;

public class RandomSongProvider {
    public String provideSong() {
        switch (new Random().nextInt(4)) {
            case 0:
                return "That Old Black Magic";
            case 1:
                return "Every Little Thing She Does is Magic";
            case 2:
                return "Magic Carpet Ride";
            case 3:
                return "Jingle Bells";
            case 4:
                return "Greensleeves";
            default: return "";
        }
    }
}
