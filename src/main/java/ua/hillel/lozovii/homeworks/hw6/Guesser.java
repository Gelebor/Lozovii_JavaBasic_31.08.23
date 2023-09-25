package ua.hillel.lozovii.homeworks.hw6;

import java.util.Scanner;

public class Guesser {
    public static void main(String[] args) {

        int secretNum = (int) (Math.random() * 11);
        String errMsg1 = "\nWarning! Please input number from 0 to 10.";
        String errMsg2 = "\nWarning! Please input number >= 3.";
        Scanner sc = new Scanner(System.in);
        int attempts = 0;
        int inputNum = 0;
        int tryNum = 0;

        System.out.println("\nTry to guess the number from 0 to 10.");
        while (attempts < 3) {
            System.out.print("Number of attempts = ");
            if (sc.hasNextInt()) {
                attempts = sc.nextInt();

                if (attempts <= 3) {
                    System.out.println(errMsg2);
                    sc.nextLine();
                    continue;
                }
                sc.nextLine();
            } else {
                System.out.println(errMsg2);
                sc.nextLine();
            }
        }

        for (int i = attempts; i > 0; i--) {
            int flNum = 0;
            while (flNum == 0) {
                System.out.print("Please, enter your number = ");
                if (sc.hasNextInt()) {
                    inputNum = sc.nextInt();

                    if (inputNum < 0 || inputNum > 10) {
                        System.out.println(errMsg1);
                        sc.nextLine();
                        continue;
                    }
                    sc.nextLine();
                    ++flNum;
                    ++tryNum;
                } else {
                    System.out.println(errMsg1);
                    sc.nextLine();
                }
            }

            if (secretNum == inputNum) {
                System.out.println("Congratulations! You guessed the number \"" + secretNum + "\" in " + tryNum + " out of " + attempts + " tries!");
                break;
            } else if ((attempts - tryNum) > 1) {
                if (secretNum > inputNum) {
                    System.out.println("\nYour number is less than the guessed number. Try again! " + (attempts - tryNum) + " attempts left.");
                } else if (secretNum < inputNum) {
                    System.out.println("\nYour number is greater than the guessed number. Try again! " + (attempts - tryNum) + " attempts left.");
                }
            } else if ((attempts - tryNum) == 1) {
                if (secretNum > inputNum) {
                    System.out.println("\nYour number is less than the guessed number. Try again! " + (attempts - tryNum) + " attempt left.");
                } else if (secretNum < inputNum) {
                    System.out.println("\nYour number is greater than the guessed number. Try again! " + (attempts - tryNum) + " attempt left.");
                }
            } else {
                System.out.println("Sorry, you didn't guess the number... Do you want to try again?");
            }
        }

    }
}
