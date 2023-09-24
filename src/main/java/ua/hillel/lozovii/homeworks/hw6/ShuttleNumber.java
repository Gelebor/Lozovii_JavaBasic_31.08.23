package ua.hillel.lozovii.homeworks.hw6;

public class ShuttleNumber {
    public static void main(String[] args) {
        int startNum = 1;
        int endNum = 100;

        int badDigit1 = 4;
        int badDigit2 = 9;

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

            if (range > 1) {
                for (int j = 0; j <= (range - 1); j++) {
                    int devI = (int) (Math.abs(i) / (Math.pow(10, j)));
                    int modI = devI % 10;

                    if (modI == badDigit1 || modI == badDigit2) {
                        ++flag;
                    }
                }
            } else {
                if (Math.abs(i) == badDigit1 || Math.abs(i) == badDigit2) {
                    ++flag;
                }
            }

            if (flag > 0) {
                flag = 0;
                ++shBadNumCount;
                continue;
            }
            ++shNumCount;
            System.out.println("Shuttle number = " + i);
        }

        System.out.println("\nCount of bad numbers: " + shBadNumCount);
        System.out.println("Count of good numbers: " + shNumCount);
    }
}
