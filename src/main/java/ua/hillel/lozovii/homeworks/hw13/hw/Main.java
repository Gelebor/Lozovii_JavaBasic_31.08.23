package ua.hillel.lozovii.homeworks.hw13.hw;

import ua.hillel.lozovii.homeworks.hw13.hw.musicStyles.ClassicMusic;
import ua.hillel.lozovii.homeworks.hw13.hw.musicStyles.MusicStyles;
import ua.hillel.lozovii.homeworks.hw13.hw.musicStyles.PopMusic;
import ua.hillel.lozovii.homeworks.hw13.hw.musicStyles.RockMusic;

public class Main {
    public static void main(String[] args) {
        MusicStyles[] bands = {
                new PopMusic("The Beatles"),
                new RockMusic("AC/DC"),
                new ClassicMusic("Mozart")
        };

        for (MusicStyles band : bands) {
            System.out.println(" ");
            band.playMusic();
//            band.style();
//            band.getMusicBandName();
        }
    }
}
