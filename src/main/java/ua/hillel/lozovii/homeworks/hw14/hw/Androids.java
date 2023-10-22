package ua.hillel.lozovii.homeworks.hw14.hw;

public class Androids implements Smartphones, LinuxOS {
    private final String name;

    public Androids(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
