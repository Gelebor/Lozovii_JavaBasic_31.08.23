package ua.hillel.lozovii.homeworks.hw6;

public class DraftShuttleNumber {
    public static void main(String[] args) {
        //========================================
//        нещасливі числа 4 та 9 у Японії
//        пронумерувати 100 шатлів без нещасливих чисел

        int startNum = 1;
        int endNum = 100;

        int flag = 0;
        int shNumCount = 0;
        int shBadNumCount = 0;

        for (int i = startNum; i <= endNum; i++) {
            int range = 0;
            int tempRange = Math.abs(i);
            while (tempRange != 0) {
                tempRange /= 10;
                ++range;
            }

//            System.out.println("i1=" + i);
            if (range > 1) {
                for (int j = 0; j <= (range - 1); j++) {
//                    System.out.println("i2=" + i);

                    int devI = (int) (Math.abs(i) / (Math.pow(10, j)));
                    int modI = devI % 10;
//                    System.out.println("modI=" + modI + " devI=" + devI);

                    if (modI == 4 || modI == 9) {
                        ++flag;
                    }
                }
            } else {
//                System.out.println("range=1");
                if (Math.abs(i) == 4 || Math.abs(i) == 9) {
                    ++flag;
                }
            }

//            System.out.println("flag=" + flag);
            if (flag > 0) {
                flag = 0;
                ++shBadNumCount;
                continue;
            }
            ++shNumCount;
            System.out.println("Shuttle number = " + i);
        }
        System.out.println("Count of bad numbers: " + shBadNumCount);
        System.out.println("Count of good numbers: " + shNumCount);


//        for (int i = 0; i < 100; i++) {
//            if (String.valueOf(i).contains("4") || String.valueOf(i).contains("9")) {
//                continue;
//            }
//        System.out.println("Shuttle number = " + i);
//        }
    }
}
