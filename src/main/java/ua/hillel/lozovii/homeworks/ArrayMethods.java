package ua.hillel.lozovii.homeworks;

public class ArrayMethods {
    //    Додайте метод, який буде рахувати середнє арифметичне елементів масиву.
    //    Зробіть метод, який прийматиме на вхід двомірну матрицю (двовимірний масив) у та перевіряти чи є вона квадратною
    //    В тестовому класі створіть тестову матрицю та передайте її в метод тестованого класу

//    public static void main(String[] args) {
//        int[][] arr1 = new int[][]{
//                {1, 2, 3, 4},
//                {1, 2, 3, 4},
//                {1, 2, 3, 4},
//                {1, 2, 3, 4, 1}
//        };
//        int[][] arr2 = new int[2][2];
//        int[][] arr3 = null;
//
//        System.out.println(ArrayMethods.squareArray(arr1));
//        System.out.println(ArrayMethods.squareArray(arr3));
//        System.out.println(ArrayMethods.averageArray(arr1));
//    }

    public static boolean squareArray(int[][] array) {
        if (array == null) {
            return false;
        }
        for (int[] ints : array) {
            if (array.length != ints.length) {
                return false;
            }
        }
        return true;
    }

//    public static String averageArray(int[][] array) {
//        int countElement = 0;
//        int countAll = 0;
//        int zeroElement = 0;
//
//        try {
//            for (int i = 0; i < array.length; i++) {
//                for (int i1 = 0; i1 < array[i].length; i1++) {
//                    countElement++;
//                    countAll += array[i][i1];
//                    if (array[i][i1] == 0) {
//                        zeroElement++;
//                    }
//                }
//            }
//            if (zeroElement == countElement) {
//                return "All array elements = 0!";
//            } else {
//                double res = (double) countAll / countElement;
//                return "Average number in array = " + res;
//            }
//        } catch (NullPointerException e) {
//            return "Wrong array properties";
//        }
//    }

    public static double averageArray(int[][] array) {
        int countElement = 0;
        int countAll = 0;

        for (int i = 0; i < array.length; i++) {
            for (int i1 = 0; i1 < array[i].length; i1++) {
                countElement++;
                countAll += array[i][i1];
            }
        }
        return (double) countAll / countElement;
    }
}
