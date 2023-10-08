package ua.hillel.lozovii.homeworks.hw10;

import java.util.Scanner;

public class Person {
    public static void main(String[] args) {

        String errMsg = "\nВи не ввели значення! Будь ласка, повторіть спробу.";
        String[] form = {"Введіть ім'я: ", "Введіть прізвище: ", "Введіть назву місто: ", "Введіть номер телефону: "};
        String[] formInput = new String[form.length];

        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);

            for (int i1 = 0; i1 < form.length; i1++) {
                int flNum = 0;
                while (flNum == 0) {
                    System.out.print(form[i1]);
                    formInput[i1] = sc.nextLine().trim();

                    if (formInput[i1].isEmpty()) {
                        System.out.println(errMsg);
                    } else {
                        ++flNum;
                    }
                }
            }

            System.out.println(personInfo(formInput[0], formInput[1], formInput[2], formInput[3]));
        }
    }

    static String personInfo(String nameM, String surNameM, String cityM, String phNumberM) {
        return "\nЗателефонувати громадянину " + nameM + " " + surNameM + " із міста " + cityM + " можна за номером " + phNumberM + ".\n";
    }
}
