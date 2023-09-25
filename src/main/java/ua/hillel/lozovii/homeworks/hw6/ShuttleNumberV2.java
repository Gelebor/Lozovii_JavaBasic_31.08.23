package ua.hillel.lozovii.homeworks.hw6;

public class ShuttleNumberV2 {
    public static void main(String[] args) {
        int startNum = 1;
        int shAmount = 100;

        int badDigit1 = 4;
        int badDigit2 = 9;

        int flag = 0;
        int shGoodNumCount = 0;
        int shBadNumCount = 0;

        while (shGoodNumCount < shAmount) {
            int range = 0;
            int tempRange = Math.abs(startNum);
            if (startNum == 0) {
                range = 1;
            } else {
                while (tempRange != 0) {
                    tempRange /= 10;
                    ++range;
                }
            }

            if (range > 1) {
                for (int j = 0; j <= (range - 1); j++) {
                    int devI = (int) (Math.abs(startNum) / (Math.pow(10, j)));
                    int modI = devI % 10;

                    if (modI == badDigit1 || modI == badDigit2) {
                        ++flag;
                    }
                }
            } else {
                if (Math.abs(startNum) == badDigit1 || Math.abs(startNum) == badDigit2) {
                    ++flag;
                }
            }

            if (flag > 0) {
                flag = 0;
                ++shBadNumCount;
                ++startNum;
                continue;
            }

            System.out.println("Shuttle number = " + startNum);
            ++shGoodNumCount;
            ++startNum;
        }

        System.out.println("\nCount of bad numbers: " + shBadNumCount);
        System.out.println("Count of good numbers: " + shGoodNumCount);
    }
}
