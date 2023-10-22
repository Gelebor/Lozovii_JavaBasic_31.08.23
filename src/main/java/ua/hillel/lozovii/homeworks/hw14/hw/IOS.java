package ua.hillel.lozovii.homeworks.hw14.hw;

public interface IOS {
    default void osVersion() {
        System.out.println("iOS version: 15.1");
    }
}
