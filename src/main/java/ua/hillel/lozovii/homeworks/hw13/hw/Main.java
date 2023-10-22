package ua.hillel.lozovii.homeworks.hw13.hw;

import ua.hillel.lozovii.homeworks.hw13.hw.musicStyles.ClassicMusic;
import ua.hillel.lozovii.homeworks.hw13.hw.musicStyles.MusicStyles;
import ua.hillel.lozovii.homeworks.hw13.hw.musicStyles.PopMusic;
import ua.hillel.lozovii.homeworks.hw13.hw.musicStyles.RockMusic;

public class Main {
//    Зробіть клас MusicStyles, який міститиме метод playMusic()
//    Зробіть його спадкоємців: PopMusic, RockMusic і ClassicMusic.
//    Спадкоємці повинні реалізовувати метод playMusic().
//    У мейн-класі створіть музичні гурти для кожного стилю
//    За допомогою методу for each викличте у всіх спадкоємців MusicStyles метод playMusic()

    public static void main(String[] args) {
        MusicStyles[] bands = {
                new PopMusic("The Beatles"),
                new RockMusic("AC/DC"),
                new ClassicMusic("Mozart")
        };

        for (MusicStyles band : bands) {
            System.out.println(" ");
            band.playMusic();
            band.style();
            band.getMusicBandName();
        }
    }
}
