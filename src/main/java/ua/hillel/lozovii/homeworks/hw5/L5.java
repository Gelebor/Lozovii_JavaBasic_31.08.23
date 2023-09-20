package ua.hillel.lozovii.homeworks.hw5;

import java.util.Scanner;

public class L5 {
    public static void main(String[] args) {

//        >       //more
//        >=      //more + include
//        <       //less
//        <=      //less + include
//        ==      //equal
//        !=      //not equal

//        int a = 5;
//        int b = 10;

//        System.out.println(a > b);
//        System.out.println(a >= b);
//        System.out.println(a < b);
//        System.out.println(a <= b);
//        System.out.println(a == b);
//        System.out.println(a != b);
//
//        System.out.println(!true);
//        System.out.println(!false);

//        boolean res = a != b;
//        System.out.println(res);

//        String str1 = "Hello";      //str1 == str2 because "Hello" in similar data cell
//        String str2 = "Hello";
//        String str3 = new String("Hello");  //create in new data cell
//
//        System.out.println(str1 == str2);
//        System.out.println(str1 == str3);   //not equal data cells
//
//        System.out.println(str1.equals(str2));
//        System.out.println(str1.equals(str3));  //check values in data cells

        //=======================
//if use || (or) and at least 1 condition is "true" - then out "true"
//if use && (and) and at least 1 condition is "false" - then out "false"
// conditions reading from left to right

//        System.out.println(a < b && b > a || b == a);
        // true && true || false - true || false - true
        //=======================

//        int a = 5;
//        int b = 10;
//        int c = 15;

//        System.out.println(a > b || b < c);             // || - or
//        System.out.println(a > b || b > c);             // if 1 "false" - then False
//        System.out.println(a > b || b > c || c > a);    // if all "true" - then True
//
//        System.out.println(a < b && b < c && true || false);    // && - and
//        // if && and first condition = false - then Java don't calculate other condition =false in final
//
//        int xx = 5;
//        System.out.println(xx > 3 && xx++ == 6);        // false because xx++ = 6 after 5

//        if (a < b) {
//            System.out.println("a < b");
//        } else if (a > b) {
//            System.out.println("a > b");
//        } else {
//            System.out.println("a = b");
//        }

//        if (a <= b) {
//            System.out.println("a <= b");
//
//            if (a == b) {
//                System.out.println("a = b");
//            } else {
//                System.out.println("a < b");
//            }
//        } else {
//            System.out.println("a > b");
//        }
//
//        // for debaging code - use 3 or less "if in if". less than right line

//        if (5 > 4) {
//            System.out.println("yes");
//        } else {
//            if (7 == 7) {
//                System.out.println("7 = 7");
//            } else {
//                System.out.println("7 != 7");
//            }
//        }
//
//        // тернарна умова
//
//        System.out.println((5 > 6) ? "yes" : (7 == 7) ? "7 = 7" : "7 != 7");     // if = ?, else = :
//
//
//        if (a > b)
//            System.out.println("1");    // Java use first operation after "if" without {}
//        System.out.println("2");
//        System.out.println("3");

//        int a = 3;
//
//        switch (a) {
//            case 1: {
//                System.out.println("1");
//                break;      // drop from switch-case
//            }
//            case 2: {
//                System.out.println("2");
//                break;
//            }
//            case 3: {
//                System.out.println("3");
////                break;
//            }
//            case 4: {
//                System.out.println("4");
//                break;
//            }
//            case 5: {
//                System.out.println("5");
//                break;
//            }
//            default: {
//                System.out.println("default");
//                break;
//            }
//        }
//        // if don't have "break" then run next line. use "break"!
//        // can use "default" for default result
//        // "default" can be in any place in "switch" body but runs AFTER all cases

//        String str = "QwE";
//
//        switch (str) {
//            case "QWe": {
//                System.out.println(1);
//                break;
//            }
//            case "QwE": {
//                System.out.println(2);
//                break;
//            }
//            case "qWE": {
//                System.out.println(3);
//                break;
//            }
//            case "QWE": {
//                System.out.println(4);
//                break;
//            }
//        }

        Scanner sc = new Scanner(System.in);   // System.in - input

//        String str1 = sc.next();               // use next text after SPACE
//        System.out.println("str = " + str1);
//
//        String str2 = sc.next();               // use next test from previous buffer
//        String str3 = sc.next();               // if text are end then INPUT again
//        String str4 = sc.next();
//        String str5 = sc.next();
//
//        System.out.println("str2 = " + str2);
//        System.out.println("str3 = " + str3);
//        System.out.println("str4 = " + str4);
//        System.out.println("str5 = " + str5);

//        String str = sc.nextLine();             // input all text with spaces. in the end - /n
//        System.out.println("str = " + str);

        //============================================
        int number = sc.nextInt();
        System.out.println("number = " + number);
        sc.nextLine();                            // clear buffer, because scanner read "/n" and output next operation

        String str = sc.nextLine();
        System.out.println("str = " + str);
        //============================================

//        System.out.println("Please enter number: ");
//        int number = 0;
//
//        if (sc.hasNextInt()) {
//            number = sc.nextInt();
//            System.out.println("number = " + number);
//        } else {
//            System.out.println("Wrong data");
//            System.exit(0);                     // safe completing program
//        }
    }
}
