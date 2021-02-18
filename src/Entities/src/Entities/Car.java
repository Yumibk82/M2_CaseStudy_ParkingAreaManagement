package Entities;

public class Car extends Vehicle {
    private String safeDriveMode;

    public Car(){

    }
    public Car(String safeDriveMode) {
        this.safeDriveMode = safeDriveMode;
    }

    public Car(int licensePlate, String model, String name, String color, String safeDriveMode) {
        super(licensePlate, model, name, color);
        this.safeDriveMode = safeDriveMode;
    }

    public String getSafeDriveMode() {
        return safeDriveMode;
    }

    public void setSafeDriveMode(String safeDriveMode) {
        this.safeDriveMode = safeDriveMode;
    }

    @Override
    public String toString() {
        return "Car{" +
                "safeDriveMode='" + safeDriveMode + '\'' +
                "} " + super.toString();
    }
}
