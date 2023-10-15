package ua.hillel.lozovii.homeworks.hw11;

public class BurgerMain {
    public static void main(String[] args) {
        Burger basic = new Burger(true, true, true, true, true);
        System.out.println(basic);

        Burger diet = new Burger(true, true, true, true);
        System.out.println(diet);

        Burger x2Meat = new Burger(true, true, true, true, true, true);
        System.out.println(x2Meat);
    }
}
