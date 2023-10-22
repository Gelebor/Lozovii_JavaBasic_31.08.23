package ua.hillel.lozovii.homeworks.hw14.hw;

public class Main {
    public static void main(String[] args) {
//    Зробіть інтерфейс Smartphones, який має містити методи call(), sms(), internet()
//    Зробіть класи, які його імплементують: Androids, iPhones.
//    Андроїди повинні також імплементувати LinuxOS, айфони повинні імплементувати iOS
//    Створіть екземпляри кожного виду у мейн-класі

        IPhones iPhone = new IPhones("iPhone 15 Pro");
        Androids android = new Androids("Google Pixel 10");

        iPhone.call();
        iPhone.sms();
        iPhone.internet();
        iPhone.osVersion();

        System.out.println(" ");
        android.call();
        android.sms();
        android.internet();
        android.osVersion();
    }
}
