package ua.hillel.lozovii.homeworks.hw9;

import java.util.Scanner;

public class Transpose_HW {
    public static void main(String[] args) {
        int m = 0;
        int n = 0;
        String errMsg1 = "Warning! Please, input number of rows (by digits and >1).";
        String errMsg2 = "Warning! Please, input number of columns (by digits and >1).";

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, input number of rows and columns.\n");
        int flNum = 0;
        while (flNum == 0) {
            System.out.print("Rows = ");
            if (sc.hasNextInt()) {
                m = sc.nextInt();

                if (m < 1) {
                    System.out.println(errMsg1);
                    sc.nextLine();
                    continue;
                }
                sc.nextLine();
                ++flNum;
            } else {
                System.out.println(errMsg1);
                sc.nextLine();
            }
        }

        flNum = 0;
        while (flNum == 0) {
            System.out.print("Columns = ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();

                if (n < 1) {
                    System.out.println(errMsg2);
                    sc.nextLine();
                    continue;
                }
                sc.nextLine();
                ++flNum;
            } else {
                System.out.println(errMsg2);
                sc.nextLine();
            }
        }

        int[][] preTr = new int[m][n];
        int[][] postTr = new int[n][m];

        System.out.println("\nPre-transposed matrix:");
        for (int i = 0; i < preTr.length; i++) {
            for (int i1 = 0; i1 < preTr[i].length; i1++) {
                preTr[i][i1] = (int) (Math.random() * 1001);
                System.out.print(preTr[i][i1] + "\t\t");
            }
            System.out.println();
        }

        System.out.println("\nPost-transposed matrix:");
        for (int i = 0; i < postTr.length; i++) {
            for (int i1 = 0; i1 < postTr[i].length; i1++) {
                postTr[i][i1] = preTr[i1][i];
                System.out.print(postTr[i][i1] + "\t\t");
            }
            System.out.println();
        }
    }
}