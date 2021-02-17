package Entities;

public class Vehicle {
    private int licensePlate;
    private String model;
    private String name;
    private String color;

    public Vehicle(){

    }

    public Vehicle(int licensePlate, String model, String name, String color) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.name = name;
        this.color = color;
    }

    public int getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(int licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "licensePlate=" + licensePlate +
                ", model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
