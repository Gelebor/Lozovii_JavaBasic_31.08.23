package ua.hillel.lozovii.homeworks.hw11;

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        System.out.println("Please enter integer number from 0 to 10");
        while (true) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number >= 0 && number <= 10) {
                    break;
                } else {
                    System.out.println("Please enter number from 0 to 10");
//                    scanner.nextLine();
                }
            } else {
                System.out.println("Wrong data! Try again!");
//                scanner.nextLine();
            }
            scanner.nextLine();
        }

        System.out.println(number);
    }
}
