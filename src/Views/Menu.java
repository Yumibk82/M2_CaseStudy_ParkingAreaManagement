package Views;

import Behaviors.VehicleFactory;
import Behaviors.VehicleManagement;
import Entities.Vehicle;

import java.util.Scanner;

public class Menu {
    static Scanner input = new Scanner(System.in);
    public static Vehicle getVehicleInfo(String type){
        Vehicle vehicle = VehicleFactory.getVehicle(type);
        System.out.println("Enter vehicle licencePlate");
            int licencePlate = Integer.parseInt(input.nextLine());
            vehicle.setLicensePlate(licencePlate);
        System.out.println("Enter vehicle's name");
            String name = input.nextLine();
            vehicle.setName(name);
        System.out.println("Enter vehicle's model");
            String model = input.nextLine();
            vehicle.setModel(model);
        System.out.println("Enter vehicle's color");
            String color = input.nextLine();
            vehicle.setColor(color);

        return vehicle;
    }
    public static Vehicle searchVehicle(VehicleManagement<Vehicle> vm){
        System.out.println("Enter vehicle's licencePlate to search");
        Vehicle vehicle = vm.search(Integer.parseInt(input.nextLine()));
        if(vehicle == null){
            System.out.println("No vehicle");
            return null;
        }else return vehicle;
    }
}
