package ua.hillel.lozovii.homeworks.hw14.hw;

public class Main {
    public static void main(String[] args) {
        IPhones iPhone = new IPhones("iPhone 15 Pro");
        Androids android = new Androids("Google Pixel 10");

        System.out.println(iPhone.getName());
        iPhone.call();
        iPhone.sms();
        iPhone.internet();
        iPhone.osVersion();

        System.out.println(" ");
        System.out.println(android.getName());
        android.call();
        android.sms();
        android.internet();
        android.osVersion();
    }
}
