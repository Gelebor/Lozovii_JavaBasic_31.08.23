package ua.hillel.lozovii.homeworks.hw4;

public class WarsOfDynasties {
    public static void main(String[] args) {

        //Lee
        int leePwrWarior = 13;
        int leePwrArcher = 24;
        int leePwrHorseman = 46;

        int leeArmyCountIndex = 860;

        double leeWariorMult = 1;
        double leeArcherMult = 1;
        double leeHorsemanMult = 1;

        int leeWariorCount = (int) Math.round(leeArmyCountIndex * leeWariorMult);
        int leeArcherCount = (int) Math.round(leeArmyCountIndex * leeArcherMult);
        int leeHorsemanCount = (int) Math.round(leeArmyCountIndex * leeHorsemanMult);

        int leeArmyPower = (leeWariorCount * leePwrWarior) + (leeArcherCount * leePwrArcher) + (leeHorsemanCount * leePwrHorseman);

        //Min
        int minPwrWarior = 9;
        int minPwrArcher = 35;
        int minPwrHorseman = 12;

        int minArmyCountIndex = 860;

        double minWariorMult = 1.5;
        double minArcherMult = 1.5;
        double minHorsemanMult = 1.5;

        int minWariorCount = (int) Math.round(minArmyCountIndex * minWariorMult);
        int minArcherCount = (int) Math.round(minArmyCountIndex * minArcherMult);
        int minHorsemanCount = (int) Math.round(minArmyCountIndex * minHorsemanMult);

        int minArmyPower = (minWariorCount * minPwrWarior) + (minArcherCount * minPwrArcher) + (minHorsemanCount * minPwrHorseman);

        System.out.println("Total power of the Lee Dynasty army: " + leeArmyPower + "\nTotal power of the Min Dynasty army: " + minArmyPower);
    }
}
