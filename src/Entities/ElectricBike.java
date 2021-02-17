package Entities;

public class ElectricBike extends Vehicle {
    private int electricEnergy;

    public ElectricBike(){

    }

    public ElectricBike(int electricEnergy) {
        this.electricEnergy = electricEnergy;
    }

    public ElectricBike(int licensePlate, String model, String name, String color, int electricEnergy) {
        super(licensePlate, model, name, color);
        this.electricEnergy = electricEnergy;
    }

    public int getElectricEnergy() {
        return electricEnergy;
    }

    public void setElectricEnergy(int electricEnergy) {
        this.electricEnergy = electricEnergy;
    }

    @Override
    public String toString() {
        return "ElectricBike{" +
                "electricEnergy='" + electricEnergy + '\'' +
                '}';
    }
}
