package ua.hillel.lozovii.homeworks.hw4;

import java.util.Scanner;

public class ParallelepipedVolume {
    public static void main(String[] args) {

        //  V = a * b * c

        String errMsg1 = "Invalid value";
        String errMsg2 = ". Please, try again.";
        double a;
        double b;
        double c;

        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter side sizes of parallelepiped (digits):\nSide \"a\" = ");
        if (sc.hasNextDouble()) {
            a = sc.nextDouble();
        } else {
            System.out.println(errMsg1 + " \"a\"" + errMsg2);
            return;
        }

        System.out.print("Side \"b\" = ");
        if (sc.hasNextDouble()) {
            b = sc.nextDouble();
        } else {
            System.out.println(errMsg1 + " \"b\"" + errMsg2);
            return;
        }

        System.out.print("Side \"c\" = ");
        if (sc.hasNextDouble()) {
            c = sc.nextDouble();
        } else {
            System.out.println(errMsg1 + " \"c\"" + errMsg2);
            return;
        }

        System.out.println("\nEntered sides:\na = " + a + "; b = " + b + "; c = " + c);
        double volume = (double) Math.round(a * b * c * 100) / 100;
//        System.out.println("Volume of parallelepiped is " + Volume);
        System.out.println("Об'єм паралелепіпеда = " + volume);
        double length = (a + b + c) * 4.0;
        System.out.println("Сума довжин всіх ребер = " + length);
    }
}
