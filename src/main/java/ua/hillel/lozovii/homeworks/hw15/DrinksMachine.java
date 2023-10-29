package ua.hillel.lozovii.homeworks.hw15;

public enum DrinksMachine {
    COFEE("Кава"),
    TEA("Чай"),
    LEMONADE("Лимонад"),
    MOJITO("Мохіто"),
    MINERAL("Мінеральна вода"),
    COCA_COLA("Кока-Кола");

    private final String name;

    DrinksMachine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
