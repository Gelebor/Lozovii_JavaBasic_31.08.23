package ua.hillel.lozovii.homeworks.hw13.hw.musicStyles;

public class ClassicMusic extends MusicStyles {
    private final String musicBandName;

    public ClassicMusic(String musicBandName) {
        super();
        this.musicBandName = musicBandName;
    }

    public void style() {
        System.out.println("It's a Classic music style.");
    }

    public void getMusicBandName() {
        System.out.println(musicBandName);
    }

    @Override
    public void playMusic() {
        System.out.println(this.musicBandName + " (Classic) music playing...");
    }
}
