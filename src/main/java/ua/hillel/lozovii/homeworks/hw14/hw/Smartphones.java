package ua.hillel.lozovii.homeworks.hw14.hw;

public interface Smartphones {
    default void call() {
        System.out.println("Start calling...");
    }

    default void sms() {
        System.out.println("Sending SMS...");
    }

    default void internet() {
        System.out.println("Connecting to internet...");
    }
}
