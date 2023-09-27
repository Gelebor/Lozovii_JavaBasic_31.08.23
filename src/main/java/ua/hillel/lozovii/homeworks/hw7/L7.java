package ua.hillel.lozovii.homeworks.hw7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class L7 {
    public static void main(String[] args) {
//        int[] array1 = new int[5];
//
//        array1[0] = 1;
//        array1[1] = 2;
//        array1[2] = 3;
//        array1[3] = 4;
//        array1[4] = 5;

//        System.out.println(array1[4]);
//        System.out.println(array1);     //HEX, address

//        System.out.println(array1.length);

//        for (int i = 0; i < array1.length; i++) {
//            System.out.println(array1[i]);
//        }

//        int[] arr2 = new int[1];
//        System.out.println(arr2[2]);    //ArrayIndexOutOfBoundsException


//        int[] arr3 = {1, 2, 3, 4, 5};   //input values
//        int[] arr4 = new int[]{1, 2, 3, 4, 5};
//        int arr5[] = {1, 2, 3, 4, 5};


//        String[] arr6 = new String[10];
//        for (int i = 0; i < arr6.length; i++) {
//            System.out.println(arr6[i]);            //10 0
//        }


//        int[] arr = new int[10];      //100-109
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i + 100;
//            System.out.println(arr[i]);
//        }


//        int[] arr = {1, 2, 3, 4, 5};
//
//        for (int value : arr) {
//            System.out.println(value);
//        }
//        check all value in array


//        int[] arr = {1, 2, 3, 4, 5};
//
//        System.out.println(Arrays.toString(arr));


//        ===========================
//   створити масив на 10 елементів та заповнити його випадковими цифрами від 0 до 10
//   вивести на екран в один рядок усі цифри, розділивши їх комою, але у
//   останнього символу не виводити кому

//        int[] numbers = new int[10];
//
//        for (int i = 0; i < numbers.length; i++) {
////            int randomNumber = (int) (Math.random() * 11);
//            numbers[i] = (int) (Math.random() * 11);
//        }
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (i == numbers.length - 1) {
//                System.out.print(numbers[i]);
//            } else {
//                System.out.print(numbers[i] + ", ");
//            }
//        }



/*
     У вбивстві Кеннеді є 10 підозрюваних. Для кожного підозрюваного
     встановлено ймовірність того, що він був убивцею. Всі ці ймовірності
     записані як масив чисел. Написати функцію, яка і визначить
     номер підозрюваного, якого треба ув'язнити.
*/
//        int[] people = {11, 44, 98, 44, 22, 33, 55, 22, 90, 6};
//
//        int indexMaxValue = 0;
//        int maxValue = people[0];
//        for (int i = 1; i < people.length; i++) {
//            if (people[i] > maxValue) {
//                maxValue = people[i];
//                indexMaxValue = i;
//            }
//        }
//
//        System.out.println("max value = " + maxValue + ", index: " + indexMaxValue);



/*
     У вашій баскетбольній команді 10 людей. Очки гравців основного
     складу записані в парні комірки масиву, а запасних гравців - у
     непарні. Написати функцію, яка знайде наскільки більше балів
     заробив основний склад щодо запасних гравців.
*/

//        int[] team = new int[10];
//
//        for (int i = 0; i < team.length; i++) {
////            int randomNumber = (int) (Math.random() * 11);
////            team[i] = randomNumber;
//            team[i] = (int) (Math.random() * 11);
//        }
//
//        System.out.println(Arrays.toString(team));
//
//        int sumTeamMain = 0;
//        int sumTeamReserve = 0;
//
//        for (int i = 0; i < team.length; i++) {
//            if (i % 2 == 0) {
//                sumTeamMain += team[i];
//            } else {
//                sumTeamReserve += team[i];
//            }
//        }
//
//        System.out.println("team main = " + sumTeamMain);
//        System.out.println("team reserve = " + sumTeamReserve);
//
//        if (sumTeamMain > sumTeamReserve) {
//            System.out.println("Team main won!");
//        } else if (sumTeamReserve > sumTeamMain) {
//            System.out.println("Team reserve won!");
//        } else {
//            System.out.println("Draw!");
//        }
//        ===========================
    }
}
