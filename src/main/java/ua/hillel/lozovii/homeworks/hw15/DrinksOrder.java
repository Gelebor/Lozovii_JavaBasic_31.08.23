package ua.hillel.lozovii.homeworks.hw15;

import java.util.Scanner;

enum DrinksMachine {
    COFFEE, TEA, LEMONADE, MOJITO, SODA, COCA_COLA
}

class Drinks {
    public static final double COFFEE_PRICE = 2.0;
    public static final double TEA_PRICE = 1.5;
    public static final double LEMONADE_PRICE = 2.5;
    public static final double MOJITO_PRICE = 3.0;
    public static final double SODA_PRICE = 1.0;
    public static final double COCA_COLA_PRICE = 2.0;
}

public class DrinksOrder {
    static double totalCost = 0.0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Оберіть напій (coffee, tea, lemonade, mojito, soda, coca_cola) або 'exit' для завершення замовлення: ");
            String choice = sc.next();
            double drinkPrice = 0.0;


            if (choice.toUpperCase().equalsIgnoreCase("exit")) {
                break;
            }

            try {
                DrinksMachine selectedDrink = DrinksMachine.valueOf(choice.toUpperCase());

                switch (selectedDrink) {
                    case COFFEE:
                        drinkPrice = Drinks.COFFEE_PRICE;
                        makeCoffee();
                        break;
                    case TEA:
                        drinkPrice = Drinks.TEA_PRICE;
                        makeTea();
                        break;
                    case LEMONADE:
                        drinkPrice = Drinks.LEMONADE_PRICE;
                        makeLemonade();
                        break;
                    case MOJITO:
                        drinkPrice = Drinks.MOJITO_PRICE;
                        makeMojito();
                        break;
                    case SODA:
                        drinkPrice = Drinks.SODA_PRICE;
                        makeSoda();
                        break;
                    case COCA_COLA:
                        drinkPrice = Drinks.COCA_COLA_PRICE;
                        makeCocaCola();
                        break;
                    default:
                        System.out.println("Напій не знайдено.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Напій введено невірно!");
            }

            totalCost += drinkPrice;
        }

        System.out.println("Загальна вартість: " + totalCost + " грн.");
    }

    private static void makeCoffee() {
        System.out.println("Готуємо каву...");
    }

    private static void makeTea() {
        System.out.println("Готуємо чай...");
    }

    private static void makeLemonade() {
        System.out.println("Готуємо лимонад...");
    }

    private static void makeMojito() {
        System.out.println("Готуємо мохіто...");
    }

    private static void makeSoda() {
        System.out.println("Готуємо соду...");
    }

    private static void makeCocaCola() {
        System.out.println("Готуємо Coca-Cola...");
    }
}
