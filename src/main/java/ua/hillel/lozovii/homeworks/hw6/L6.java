package ua.hillel.lozovii.homeworks.hw6;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class L6 {
    public static void main(String[] args) {
//        for (ітератор;умова виходу із циклу;блок зміни ітератора)
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Print " + i);
//        }
//        int i = 0;
//        for (; i <= 5; i++) {
//            System.out.println("Print " + i);
//        }

//        infinity
//        int i = 0;
//        for (; i <= 5; ) {
//            System.out.println("Print " + i);
//        }
//        int i = 10;
//        for (; ; ) {
//            System.out.println("inf");
//        }

//        BREAK - обривання циклу
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//            if (i == 5) {
//                break;
//            }
//        }

//        CONTINUE - обриває поточну ітерацію і повертається в шапку цикла
//        for (int i = 0; i < 10; i++) {
//            if (i == 5 || i == 7) {
//                continue;
//            }
//            System.out.println(i);
//        }

//        break + continue
//        for (int i = 0; ; i++) {
//            if (i == 3) {
//                continue;
//            }
//            if (i == 7) {
//                break;
//            }
//            System.out.println(i);
//        }

        //===================================================
//        fori - fast FOR
//        for (int i = 0; i < ; i++) {
//
//        }
        //===================================================

//        loop in loop
//        int counter = 0;
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                counter++;
//                System.out.println("i=" + i);
//                System.out.println("j=" + j);
//                System.out.println("counter=" + counter);
//            }
//        }

//        many iterators
//        for (int i = 0, j = 10; i < 10 && j > 5; i++, j--) {
//            System.out.println("i=" + i);
//            System.out.println("j=" + j);
//            System.out.println();
//        }

        //========================================
//        for (byte i = 0; i < 128; i++) {
//            System.out.println(i);
//        }
        //========================================
//        after 127 - i++=128 - byte 128=byte -127
        //========================================

        //========================================
//        виведення парних чисел
//        for (int i = 0; i <= 20; i += 2) {
//            System.out.println(i);
//        }

//        for (int i = 0; i <= 20; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
        //========================================

        //========================================
//        числа Фібоначі
//        int num1 = 1;
//        int num2 = 1;
//        int sum = 0;
//
//        System.out.print(num1 + " " + num2 + " ");
//
//        for (int i = 0; i < 10; i++) {
//            sum = num1 + num2;
//            System.out.print(sum + " ");
//            num1 = num2;
//            num2 = sum;
//    }
        //========================================

//        WHILE
//        int i = 0;
//        while (i < 10) {
//            System.out.println(i);
//            i++;
//        }
//        ============ check and run

//        int j = 0;
//        do {
//            System.out.println(j);
//        } while (j == 1);
//        ============ run and check

//        int i = 0;
//        while (i < 10) {
//            if (i == 5) {
//                continue;   //infinity
//            }
//            if (i == 7) {
//                break;
//            }
//            System.out.println(i);
//            i++;
//        }

//        int i = 0;
//        while (i < 10) {
//            i++;            //fix infinity
//            if (i == 5) {
//                continue;
//            }
//            if (i == 7) {
//                break;
//            }
//            System.out.println(i);
//        }

        //========================================
//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("enter int");
//
//            if (sc.hasNextInt()) {
//                int userValue = sc.nextInt();
//                System.out.println("user value= " + userValue);
//                break;
//            } else {
//                System.out.println("Err! Try again");
//                sc.nextLine();      //clear buffer
//            }
//        }
        //========================================

        //========================================
//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("enter int");
//
//            if (sc.hasNextInt()) {
//                int userValue = sc.nextInt();
//                if (userValue >= 10 && userValue <= 20) {
//                    System.out.println("user value= " + userValue);
//                    break;
//                } else {
//                    System.out.println("Err! 10-20");
//                }
//            } else {
//                System.out.println("Err! Try again");
//            }
//            sc.nextLine();      //or here clear buffer
//        }
        //========================================

        //========================================
//        бомба зі зворотним відліком 10-1 із WHILE
//        якщо випаде число 85-100 - бомба не взірветься

//        int i = 10;
//        while (i >= 0) {
//            int rand = (int) (Math.random() * 101);
//            System.out.println("rand=" + rand);
//
//            if (rand >= 85 && rand <= 100) {
//                System.out.println("not boom =(");
//                break;
//            }
//
//            System.out.println(i);
//
//            if (i == 0) {
//                System.out.println("BOOM!");
//            }
//            i--;
//        }
        //========================================
    }
}
