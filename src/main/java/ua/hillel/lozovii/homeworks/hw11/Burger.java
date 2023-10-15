package ua.hillel.lozovii.homeworks.hw11;

public class Burger {
    final boolean bun;
    final boolean meat;
    final boolean cheese;
    final boolean greens;
    final boolean mayonnaise;
    final boolean doubleMeat;

    Burger(boolean bun, boolean meat, boolean cheese, boolean greens, boolean mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;

        this.mayonnaise = mayonnaise;
        this.doubleMeat = false;

        System.out.println("\nСклад: булочка, м'ясо, сир, зелень, майонез.");
    }

    Burger(boolean bun, boolean meat, boolean cheese, boolean greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;

        this.mayonnaise = false;
        this.doubleMeat = false;

        System.out.println("\nСклад: булочка, м'ясо, сир, зелень.");
    }

    Burger(boolean bun, boolean meat, boolean cheese, boolean greens, boolean mayonnaise, boolean doubleMeat) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;

        this.mayonnaise = mayonnaise;
        this.doubleMeat = doubleMeat;

        System.out.println("\nСклад: булочка, м'ясо (х2), сир, зелень, майонез.");
    }

    String burgerInfo() {
        if (doubleMeat == true) {
            return "Ви обрали бургер із подвійним м'ясом.";
        } else if (mayonnaise == false) {
            return "Ви обрали дієтичний бургер (без майонезу).";
        } else {
            return "Ви обрали звичайний бургер (усі компоненти).";
        }
    }
}
