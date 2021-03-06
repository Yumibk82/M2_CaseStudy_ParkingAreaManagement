package Entities;

public class Motor extends Vehicle{
    private String transmissionMode;

    public Motor(){

    }

    public Motor(String transmissionMode) {
        this.transmissionMode = transmissionMode;
    }

    public Motor(int licensePlate, String model, String name, String color, String transmissionMode) {
        super(licensePlate, model, name, color);
        this.transmissionMode = transmissionMode;
    }

    public String getTransmissionMode() {
        return transmissionMode;
    }

    public void setTransmissionMode(String transmissionMode) {
        this.transmissionMode = transmissionMode;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "transmissionMode='" + transmissionMode + '\'' +
                "} " + super.toString();
    }
}
