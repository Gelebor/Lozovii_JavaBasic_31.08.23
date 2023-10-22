package ua.hillel.lozovii.homeworks.hw14.hw;

public class IPhones implements Smartphones, IOS {
    private final String name;

    public IPhones(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
