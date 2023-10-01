package ua.hillel.lozovii.homeworks.hw8;

import java.util.Arrays;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        int lotterySize = 7;
        String errMsg1 = "Warning! Please, input number between [0 and 9].";

        int[] lottery = new int[lotterySize];
        int[] userNumbers = new int[lotterySize];
        int[] winIndex = new int[lotterySize];

        for (int i = 0; i < lottery.length; i++) {
            lottery[i] = (int) (Math.random() * 10);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, input " + lottery.length + " lottery numbers.\n");
        int tempLen = 0;
        while (tempLen < userNumbers.length) {
            int flNum = 0;
            while (flNum == 0) {
                System.out.print("Number " + (tempLen + 1) + " = ");
                if (sc.hasNextInt()) {
                    int tempInput = sc.nextInt();

                    if (tempInput < 0 || tempInput > 9) {
                        System.out.println(errMsg1);
                        sc.nextLine();
                    } else {
                        userNumbers[tempLen] = tempInput;
                        sc.nextLine();
                        ++flNum;
                        ++tempLen;
                    }
                } else {
                    System.out.println(errMsg1);
                    sc.nextLine();
                }
            }
        }

//        int userIteration = 0;
        for (int j = 0; j < userNumbers.length - 1; j++) {
            int whileExit = 0;
            for (int i = 0; i < userNumbers.length - 1 - j; i++) {
                if (userNumbers[i] > userNumbers[i + 1]) {
                    int tempCheck = userNumbers[i + 1];
                    userNumbers[i + 1] = userNumbers[i];
                    userNumbers[i] = tempCheck;

//                    ++userIteration;
//                    System.out.println("Step " + userIteration + " : " + Arrays.toString(userNumbers));
//                    Check the sorting
                } else {
                    ++whileExit;
                }
            }
            if (whileExit == userNumbers.length - 1) {
                break;
            }
        }
        System.out.println("\nYour numbers:    " + Arrays.toString(userNumbers));

//        int lotteryIteration = 0;
        for (int j = 0; j < lottery.length - 1; j++) {
            int whileExit = 0;
            for (int i = 0; i < lottery.length - 1 - j; i++) {
                if (lottery[i] > lottery[i + 1]) {
                    int tempCheck = lottery[i + 1];
                    lottery[i + 1] = lottery[i];
                    lottery[i] = tempCheck;

//                    ++lotteryIteration;
//                    System.out.println("Step " + lotteryIteration + " : " + Arrays.toString(lottery));
//                    Check the sorting
                } else {
                    ++whileExit;
                }
            }
            if (whileExit == lottery.length - 1) {
                break;
            }
        }
        System.out.println("Lottery numbers: " + Arrays.toString(lottery));

        int matches = 0;
        for (int i = 0; i < lottery.length; i++) {
            if (lottery[i] == userNumbers[i]) {
                winIndex[matches] = i + 1;
                ++matches;
            }
        }

        System.out.println("\nNumber of matches = " + matches + ".");
        if (matches == 1) {
            System.out.print("On position: " + winIndex[0]);
        } else if (matches != 0) {
            System.out.print("On positions: ");
            for (int i = 0; i < matches; i++) {
                if (i == matches - 1) {
                    System.out.print(winIndex[i] + ".");
                } else {
                    System.out.print(winIndex[i] + ", ");
                }
            }
        }
    }
}
