package ua.hillel.lozovii.homeworks.hw16;

public class ArrayMethods {
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
}
