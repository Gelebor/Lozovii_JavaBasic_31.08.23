package ua.hillel.lozovii.homeworks.hw13.hw.musicStyles;

public class RockMusic extends MusicStyles {
    private final String musicBandName;

    public RockMusic(String musicBandName) {
        super();
        this.musicBandName = musicBandName;
    }

    public void style() {
        System.out.println("It's a Rock music style.");
    }

    public void getMusicBandName() {
        System.out.println(musicBandName);
    }

    @Override
    public void playMusic() {
        System.out.println(this.musicBandName + " (Rock) music playing...");
    }
}
