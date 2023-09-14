package ua.hillel.lozovii.homeworks.hw4;

public class l4 {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 2;
//
//        System.out.println(a + b);
//        System.out.println(a - b);
//        System.out.println(a * b);
//        System.out.println(a / b);

//        System.out.println(10 / 3);     //convert to int
//        System.out.println(10.0 / 3);   //convert to double
//        System.out.println(10D / 3);    //10 like double "D"

//        int a = 10;
//        int b = 3;
//
//        System.out.println(a % b);      //like MOD

//        System.out.println(10 % 1);
//        System.out.println(10 % 2);
//        System.out.println(10 % 3);
//        System.out.println(10 % 4);
//        System.out.println(10 % 5);
//        System.out.println(10 % 6);
//        System.out.println(10 % 7);
//        System.out.println(10 % 8);
//        System.out.println(10 % 9);
//        System.out.println(10 % 10);

//        int a = 10;
//        int b = 3;
//
//        System.out.println(a);
//        a = a +10;
//        System.out.println(a);
//        a += 10 + 5;
//        System.out.println(a);
//        a -= 5;
//        System.out.println(a);
//        a *= 5;
//        System.out.println(a);
//        a /= 5;
//        System.out.println(a);
//        a %= 5;
//        System.out.println(a);

//        int a = 5;
//        int b = 2;
//
//        a = a +1;
//        a += 1;
//        a++;        //increment postfix. +1 every time
//        System.out.println(a);
//        a--;
//        System.out.println(a);
//
//        System.out.println(a);
//        System.out.println(a++);    //in postfix 1.write value. 2.mathematics operation
//        System.out.println(a);
//        System.out.println(++a);    //in prefix 1.mathematics operation. 2.write value

//        int result = --a + a++ - b++ + ++b;
//        System.out.println("result = " + result);
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);

//      Count salary of 3 employees with 5% tax for 10 years. Make average salary.
        int a = 700;
        int b = 2000;
        int c = 3500;

        int countMonYears = 10 * 12;    //for 10 years

        int sal1 = a * countMonYears;
        int sal2 = b * countMonYears;
        int sal3 = c * countMonYears;

        System.out.println(sal1);
        System.out.println(sal2);
        System.out.println(sal3);

        double tax = 0.05;
        double salCoef = 1 - tax;

        int sal1WithoutTax = (int) (sal1 * salCoef);
        int sal2WithoutTax = (int) (sal2 * salCoef);
        int sal3WithoutTax = (int) (sal3 * salCoef);

        System.out.println(sal1WithoutTax);
        System.out.println(sal2WithoutTax);
        System.out.println(sal3WithoutTax);

        int sumSal = sal1WithoutTax + sal2WithoutTax + sal3WithoutTax;
        int avrSal = sumSal / 3;
        System.out.println("Average salary = " + avrSal);


    }
}
