package ua.hillel.lozovii.homeworks.hw9;

import java.util.Scanner;

public class Transpose_HW_v2 {
    public static void main(String[] args) {
        System.out.println("Please, input number of rows and columns.\n");

        int m = inputNum("Rows = ", "Warning! Please, input number of rows (by digits and >1).");
        int n = inputNum("Columns = ", "Warning! Please, input number of columns (by digits and >1).");

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

    static int inputNum(String firstMsg, String errMsg) {
        Scanner sc = new Scanner(System.in);
        int inputNum = 0;
        int flNum = 0;
        while (flNum == 0) {
            System.out.print(firstMsg);
            if (sc.hasNextInt()) {
                inputNum = sc.nextInt();

                if (inputNum < 1) {
                    System.out.println(errMsg);
                    sc.nextLine();
                    continue;
                }
                sc.nextLine();
                ++flNum;
            } else {
                System.out.println(errMsg);
                sc.nextLine();
            }
        }
        return inputNum;
    }
}