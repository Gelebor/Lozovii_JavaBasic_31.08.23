package ua.hillel.lozovii.homeworks.hw13.hw.musicStyles;

public class PopMusic extends MusicStyles {
    private final String musicBandName;

    public PopMusic(String musicBandName) {
        super();
        this.musicBandName = musicBandName;
    }

    public void style() {
        System.out.println("It's a Pop music style.");
    }

    public void getMusicBandName() {
        System.out.println(musicBandName);
    }

    @Override
    public void playMusic() {
        System.out.println(this.musicBandName + " (Pop) music playing...");
    }
}
