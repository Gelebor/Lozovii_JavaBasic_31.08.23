package ua.hillel.lozovii.homeworks.hw4;

import java.util.Scanner;

public class sandbox_ParallelepipedVolumeV2 {
    public static void main(String[] args) {

        //  V = a * b * c

//        String errMsg = "Invalid value";
        double a;
        double b;
        double c;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Please, enter side sizes of parallelepiped (digits):\nSide \"a\" = ");
            a = sc.nextDouble();
            System.out.print("Side \"b\" = ");
            b = sc.nextDouble();
            System.out.print("Side \"c\" = ");
            c = sc.nextDouble();
        }
        while (sc.hasNextDouble());


        System.out.println("\nEntered sides:\na = " + a + "; b = " + b + "; c = " + c);
        double Volume = (double) Math.round(a * b * c * 100) / 100;
        System.out.println("Volume of parallelepiped is " + Volume);
    }
}