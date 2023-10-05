package ua.hillel.lozovii.homeworks.hw9;

public class L9 {
    public static void main(String[] args) {
        //        int[][] array = new int[3][7];
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = (int) (Math.random() * 11);
//            }
//        }
//
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }


//        System.out.println(array.length);
//        System.out.println(array[0].length);


//        int[][] array2 = new int[][] {
//                {1, 2, 3},
//                {4, 5 ,6},
//                {7, 8, 9}
//        };
//
//        int[][] array3 = {
//                {1, 2, 3},
//                {4, 5 ,6},
//                {7, 8, 9}
//        };
//
//
//        int[][] array4 = {
//                {1, 2},
//                {4, 5 ,6, 2, 67},
//                {7, 8, 9, 34},
//                {},
//                {12}
//        };

//        for (int i = 0; i < array4.length; i++) {
//            for (int j = 0; j < array4[i].length; j++) {
//                System.out.print(array4[i][j] + "\t");
//            }
//            System.out.println();
//        }

//        System.out.println(array4.length);
//        System.out.println(array4[0].length);
//        System.out.println(array4[1].length);
//        System.out.println(array4[2].length);
//        System.out.println(array4[3].length);
//        System.out.println(array4[4].length);


        // TASK 1

// Створити масив розміром 5x5. Заповнити масив за допомогою циклу таким
// чином, щоб одиниця у кожному рядку зміщувалась вправо:

//       0 1 2 3 4

//0      1 0 0 0 0  // 00
//1      0 1 0 0 0  // 11
//2      0 0 1 0 0  // 22
//3      0 0 0 1 0  // 33
//4      0 0 0 0 1  // 44

//       0 1 2 3 4

//0      0 0 0 0 1  // 04
//1      0 0 0 1 0  // 13
//2      0 0 1 0 0  // 22
//3      0 1 0 0 0  // 31
//4      1 0 0 0 0  // 40

//        int[][] array = new int[5][5];

        // version 1
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (i == j) {
//                    array[i][j] = 1;
//                }
//            }
//        }


        // version 2
//        for (int i = 0; i < array.length; i++) {
//            array[i][i] = 1;
//        }


        // version 1
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if ((i + j) == array.length - 1) {
//                    array[i][j] = 1;
//                }
//            }
//        }

        // version 2
//        for (int i = 0, j = array.length -1; i < array.length; i++, j--) {
//            array[i][j] = 1;
//        }

        //version 3
//        for (int i = 0; i < array.length; i++) {
//            array[i][array[i].length - 1 - i] = 1;
//        }
//
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }


        // TASK 2

//      За допомогою циклів створити шахівницю 8х8 виду:
//
//      B W B W B W B W  //00, 02, 04, 06   0, 2, 4, 6
//      W B W B W B W B  //11, 13, 15, 17   2, 4, 6, 8
//      B W B W B W B W  //20, 22, 24, 26   2, 4, 6, 8
//      W B W B W B W B  //31, 33, 35, 37   4, 6, 8, 10
//      B W B W B W B W
//      W B W B W B W B
//      B W B W B W B W
//      W B W B W B W B

//        char[][] chess = new char[8][8];
//
//        for (int i = 0; i < chess.length; i++) {
//            for (int j = 0; j < chess[i].length; j++) {
//                if ((i + j) % 2 == 0) {
//                    chess[i][j] = 'B';
//                } else {
//                    chess[i][j] = 'W';
//                }
//            }
//        }
//
//        for (int i = 0; i < chess.length; i++) {
//            for (int j = 0; j < chess[i].length; j++) {
//                System.out.print(chess[i][j] + "\t");
//            }
//            System.out.println();
//        }


//        int[][][] array0 = new int[3][2][4];
//
//        int[][][] array = {
//                {
//                        {18, 28, 18, 28},
//                        {45, 90, 45, 0}
//                },
//                {
//                        {7, 125, 500, 5},
//                        {0, 11, 25, 30}
//                },
//                {
//                        {81, 17, 19, 55},
//                        {1, 7, 38, 11}
//                }
//        };
//
//        System.out.println(array.length);
//        System.out.println(array[0].length);
//        System.out.println(array[0][0].length);

//        System.out.println(array[0][1][0]);
//        System.out.println(array[1][1][3]);

//        System.out.println(Arrays.toString(array[0]));
//        System.out.println(Arrays.toString(array[0][0]));


//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                for (int k = 0; k < array[i][j].length; k++) {
//                    System.out.print(array[i][j][k] + "\t");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }


//        int[][][][] array =
//                {
//                        {
//                                {
//                                        {18, 28},
//                                        {45, 90, 45}
//                                },
//                                {
//                                        {7, 125, 500, 5},
//                                        {}
//                                },
//                                {
//                                        {81, 17, 19, 55},
//                                        {1}
//                                }
//                        },
//                        {
//                                {
//                                        {18, 28, 18, 28},
//                                        {45, 90, 45, 0}
//                                },
//                                {
//                                        {7, 125, 500, 5},
//                                        {0, 11, 25, 30}
//                                },
//                                {
//                                        {81, 17, 19, 55},
//                                        {1, 7, 38, 11}
//                                }
//                        }
//                };
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                for (int k = 0; k < array[i][j].length; k++) {
//                    for (int l = 0; l < array[i][j][k].length; l++) {
//                        System.out.print(array[i][j][k][l] + "\t");
//                    }
//                    System.out.println();
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }


//        int[] array = {1, 2, 3};
//
//        int[] array2 = new int[array.length + 2];
//
//        for (int i = 0; i < array.length; i++) {
//            array2[i] = array[i];
//        }
//
//        System.out.println(Arrays.toString(array2));
//
//        array2[3] = 4;
//        array2[4] = 5;
//
//        System.out.println(Arrays.toString(array2));
//
//
//        array = array2;
//
//        System.out.println(Arrays.toString(array));


//        int[] array = {1, 2, 3};
//
//        for (int i = 0; i < 5; i++) {
//            array = Arrays.copyOf(array, array.length + i);
//            System.out.println(Arrays.toString(array));
//        }
//
//
//        System.out.println(Arrays.toString(array));


//        int[][] array = new int[2][3];
//        System.out.println(array.length);
//        System.out.println(array[0].length);
//        System.out.println(array[1].length);
////        System.out.println(array[2].length);
//        array = Arrays.copyOf(array, 3);
//
//        array[2] = new int[3];
//
//        System.out.println();
//        System.out.println();
//
//        System.out.println(array.length);
//        System.out.println(array[0].length);
//        System.out.println(array[1].length);
//        System.out.println(array[2].length);


//        int[][] array3 = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//
//        for (int[] ints : array3) {
//            for (int value : ints) {
//                System.out.print(value + "\t");
//            }
//            System.out.println();
//        }


        // Оголошення та ініціалізація п'ятивимірного масиву
        int[][][][][] fiveDimArray = {
                {
                        {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}},
                        {{{9, 10}, {11, 12}}, {{13, 14}, {15, 16}}}
                },
                {
                        {{{17, 18}, {19, 20}}, {{21, 22}, {23, 24}}},
                        {{{25, 26}, {27, 28}}, {{29, 30}, {31, 32}}}
                }
        };

        // Виведення значень п'ятивимірного масиву
        for (int i = 0; i < fiveDimArray.length; i++) {
            for (int j = 0; j < fiveDimArray[i].length; j++) {
                for (int k = 0; k < fiveDimArray[i][j].length; k++) {
                    for (int l = 0; l < fiveDimArray[i][j][k].length; l++) {
                        for (int m = 0; m < fiveDimArray[i][j][k][l].length; m++) {
                            int value = fiveDimArray[i][j][k][l][m];
                            System.out.println("fiveDimArray[" + i + "][" + j + "][" + k + "][" + l + "][" + m + "] = " + value);
                        }
                    }
                }
            }
        }


        for (int[][][][] arr1 : fiveDimArray) {
            for (int[][][] arr2 : arr1) {
                for (int[][] arr3 : arr2) {
                    for (int[] arr4 : arr3) {
                        for (int value : arr4) {
                            System.out.print(value + "\t");
                        }
                        System.out.println();
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
