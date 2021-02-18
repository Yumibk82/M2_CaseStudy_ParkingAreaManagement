package Behaviors;

import Entities.Car;
import Entities.ElectricBike;
import Entities.Motor;
import Entities.Vehicle;

import java.util.Scanner;

public class VehicleFactory {
    public static Vehicle getVehicle(String type){
        Scanner input = new Scanner(System.in);
        switch (type){
            case "Car":
                Car car = new Car();
                System.out.println("Enter car's safeDriveMode");
                String safeDriveMode = input.nextLine();
                car.setSafeDriveMode(safeDriveMode);
                return car;
            case "Motor":
                Motor motor = new Motor();
                System.out.println("Enter motor's transmissionMode");
                String transmissionMode = input.nextLine();
                motor.setTransmissionMode(transmissionMode);
                return motor;
            case "ElectricBike":
                ElectricBike electricBike = new ElectricBike();
                System.out.println("Enter electricBike's electric energy");
                int electricEnergy = Integer.parseInt(input.nextLine());
                electricBike.setElectricEnergy(electricEnergy);
                return electricBike;
            default:
                return null;
        }
    }
}
