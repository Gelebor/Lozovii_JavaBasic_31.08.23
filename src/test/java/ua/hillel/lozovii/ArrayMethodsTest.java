package ua.hillel.lozovii;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.hillel.lozovii.homeworks.hw16.ArrayMethods;

public class ArrayMethodsTest {
    @Test
    void test1() {
        int[][] arr1 = new int[][]{
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        };
        Assertions.assertTrue(ArrayMethods.squareArray(arr1));
    }

    @Test
    void test2() {
        int[][] arr1 = new int[][]{
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4}
        };
        Assertions.assertTrue(ArrayMethods.squareArray(arr1));
    }

    @Test
    void test3() {
        int[][] arr1 = new int[][]{
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 20, 3, 4},
                {1, 2, 3, 4}
        };

        int roundAverage = (int) ArrayMethods.averageArray(arr1);
        Assertions.assertEquals(3, roundAverage);
    }

    @Test
    void test4() {
        int[][] arr1 = new int[][]{
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4}
        };

        int roundAverage = (int) ArrayMethods.averageArray(arr1);
        Assertions.assertEquals(2, roundAverage);
    }
}