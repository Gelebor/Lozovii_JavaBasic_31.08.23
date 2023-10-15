package ua.hillel.lozovii.homeworks.hw12.car;

public class Car {
    private int countWheels;
    private boolean isStart;
    private double fuelStatus;
    private String modelName;

    public Car(int countWheels, double fuelStatus, String modelName) {
        this.countWheels = countWheels;
        this.fuelStatus = fuelStatus;
        this.modelName = modelName;
    }

    public void start() {
        startElectronicSystem();
        startFuelSystem();
        startGPSSystem();
        isStart = true;
    }

    private void startElectronicSystem() {
        System.out.println("start electronic system...");
    }

    private void startFuelSystem() {
        System.out.println("start fuel system...");
    }

    private void startGPSSystem() {
        System.out.println("start GPS system...");
    }

//    public String getModelName() {
//        return modelName;
//    }
//
//    public void setModelName(String modelName) {
//        this.modelName = modelName;
//    }


    public int getCountWheels() {
        return countWheels;
    }

    public boolean isStart() {
        return isStart;
    }

    public double getFuelStatus() {
        return fuelStatus;
    }

    public String getModelName() {
        return modelName;
    }

    public void setCountWheels(int countWheels) {
        this.countWheels = countWheels;
    }

    public void setFuelStatus(double fuelStatus) {
        this.fuelStatus = fuelStatus;
    }
}
