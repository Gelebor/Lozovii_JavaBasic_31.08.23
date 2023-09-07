package ua.hillel.lozovii.homeworks.hw2;

public class Location {
    public static void main(String[] args) {

//        Latitude 50.442623
//        Longitude 30.548921
//        50° 26' 33.4428'' N
//        30° 32' 56.1156'' E

        char degreeSign = '\u00B0';
        char minuteSign = '\u2032';
        char secondSign = '\u2033';

        char latFirstPart = '2';           //50
        char tempLongFirstPartPart = '<';  //60
        int longFirstPart = (byte) tempLongFirstPartPart / 2;
        double latSecondPart = 0.442623;
        double longSecondPart = 0.548921;
        float latSeconds = 33.4428F;
        float longSeconds = 56.1156F;

        System.out.println("\nA well-known businessman, who was informed about the suspicion, is temporarily staying in this great place:");
        System.out.println("Latitude\u003A " + ((byte) latFirstPart + latSecondPart) + " | Longitude\u003A " + (longFirstPart + longSecondPart));
        System.out.println("\nDMS format:");
        System.out.println("Latitude : " + (byte) latFirstPart + degreeSign + " 26" + minuteSign + " " + latSeconds + secondSign + " N");
        System.out.println("Longitude: " + (byte) longFirstPart + degreeSign + " 32" + minuteSign + " " + longSeconds + secondSign + " E");
    }
}
