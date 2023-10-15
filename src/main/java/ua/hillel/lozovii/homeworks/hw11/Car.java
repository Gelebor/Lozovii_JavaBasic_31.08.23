package ua.hillel.lozovii.homeworks.hw11;

public class Car {

    final String model;
    final int year;

//    Car() {
//
//    }
//
//    Car(String param1) {
//        model = param1;
//    }
//
//    Car(int param2) {
//        year = param2;
//    }
//
//    Car(String param1, int param2) {
//        model = param1;
//        year = param2;
//    }


    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void start() {
        String model = "";
        System.out.println(this.model + " star...");
    }

    void stop() {
        System.out.println(model + " stop...");
    }

    void run() {
        System.out.println(model + " run...");
    }

    String getCarInfo() {
        return "Car model: " + model + ", year: " + year;
    }


    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
