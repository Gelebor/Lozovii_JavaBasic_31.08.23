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
        PopMusic team1Pop = new PopMusic("The Beatles");
        RockMusic team2Rock = new RockMusic("AC/DC");
        ClassicMusic team3Classic = new ClassicMusic("Mozart");

        team1Pop.playMusic();
        team2Rock.playMusic();
        team3Classic.playMusic();

        team1Pop.style();
        team2Rock.style();
        team3Classic.style();

        team1Pop.getMusicBandName();
        team2Rock.getMusicBandName();
        team3Classic.getMusicBandName();
    }
}
