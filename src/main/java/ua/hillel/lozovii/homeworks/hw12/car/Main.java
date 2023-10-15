package ua.hillel.lozovii.homeworks.hw12.car;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(4, 55.5, "BMW");

        car.start();

//        car.startGPSSystem();

//        car.countWheels = 7;
//        car.isStart = true;
//        car.fuelStatus = 0.0;
//        car.modelName = "Audi";

//        car.setModelName("Audi");
        car.setCountWheels(6);
        car.setFuelStatus(35.5);
        System.out.println(car.getModelName());
        System.out.println(car.getFuelStatus());
        System.out.println(car.getCountWheels());
        System.out.println(car.isStart());

    }
}
