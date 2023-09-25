package ua.hillel.lozovii.homeworks.hw6;

import java.util.Scanner;

public class DraftGuesser {
    public static void main(String[] args) {
//        Зробити гру, в якій потрібно відгадати ціле число, яке "загадав" комп'ютер у діапазоні від 0 до 10
//        Користувач повинен мати можливість вгадувати в кілька спроб (мінімум 3).


        int secretNum = (int) (Math.random() * 11);
        String errMsg1 = "Warning! Please input number from 0 to 10.";
        String errMsg2 = "Warning! Please input number > 0.";
        Scanner sc = new Scanner(System.in);
        int attempts = 0;

        System.out.println("\nTry to guess the number from 0 to 10.");
        while (attempts < 1) {
            System.out.print("Number of attempts = ");
            if (sc.hasNextInt()) {
                attempts = sc.nextInt();

                if (attempts <= 0) {
                    System.out.println(errMsg2);
                    sc.nextLine();
                    continue;
                }
                System.out.println("attempts=" + attempts);
                sc.nextLine();
            } else {
                System.out.println(errMsg2);
                sc.nextLine();
            }
        }


        for (int i = attempts; i > 0; i--) {
            if (sc.hasNextInt()) {
                System.out.print("Your number = ");
                int inputNum = sc.nextInt();

                if (inputNum < 0 || inputNum > 10) {
                    System.out.println(errMsg1);
                    continue;
                }
                sc.nextLine();
                System.out.print("Your number = " + inputNum);
            } else {
                System.out.println(errMsg1);
                sc.nextLine();
                continue;
            }
        }


    }
}
