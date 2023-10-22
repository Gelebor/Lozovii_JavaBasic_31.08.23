package ua.hillel.lozovii.homeworks.hw14.hw;

public interface LinuxOS {
    default void osVersion() {
        System.out.println("Linux version: 36.2");
    }
}
