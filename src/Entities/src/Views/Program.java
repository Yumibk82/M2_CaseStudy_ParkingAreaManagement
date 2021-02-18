package Views;

import Behaviors.VehicleManagement;
import Entities.Vehicle;

import java.util.Scanner;

public class Program {
    static Scanner input = new Scanner(System.in);
    static VehicleManagement<Vehicle> vehicleVehicleManagement = new VehicleManagement<>();

    public static void main(String[] args) {
        int choiceMainMenu = 0;
        do {
            System.out.println("=================================");
            System.out.println("1. ADD NEW VEHICLE");
            System.out.println("2. UPDATE VEHICLE");
            System.out.println("3. REMOVE VEHICLE");
            System.out.println("4. SHOW ALL VEHICLES INFORMATION");
            System.out.println("5. EXIT");
            System.out.println("=================================");
            try {
                choiceMainMenu = Integer.parseInt(input.nextLine());
                switch (choiceMainMenu) {
                    case 1:
                        int choiceExtraMenu = 0;
                        do {
                            System.out.println("-----------------------");
                            System.out.println("1. Add a new car");
                            System.out.println("2. Add a new motor");
                            System.out.println("3. Add a new electricBike");
                            System.out.println("4. Back main menu");
                            System.out.println("-----------------------");
                            System.out.println("Enter your choice");
                            try {
                                choiceExtraMenu = Integer.parseInt(input.nextLine());
                                switch (choiceExtraMenu) {
                                    case 1:
                                        Vehicle car = Menu.getVehicleInfo("Car");
                                        vehicleVehicleManagement.add(car);
                                        break;
                                    case 2:
                                        Vehicle motor = Menu.getVehicleInfo("Motor");
                                        vehicleVehicleManagement.add(motor);
                                        break;
                                    case 3:
                                        Vehicle electricBike = Menu.getVehicleInfo("ElectricBike");
                                        vehicleVehicleManagement.add(electricBike);
                                    case 4:
                                        break;
                                    default:
                                        System.out.println("Enter a number from 1 to 4");
                                }

                            } catch (NumberFormatException e) {
                                System.out.println("Please enter a number between 1 to 4");
                            }

                        } while (choiceExtraMenu != 4);

                        break;
                    case 2:
                        Vehicle vehicleUpdate = Menu.searchVehicle(vehicleVehicleManagement);
                        if (vehicleUpdate != null) {
                            String className = vehicleUpdate.getClass().getSimpleName();
                            Vehicle newVehicle = Menu.getVehicleInfo(className);
                            vehicleVehicleManagement.update(newVehicle, vehicleUpdate);
                        }
                        break;
                    case 3:
                        Vehicle vehicleRemove = Menu.searchVehicle(vehicleVehicleManagement);
                        if (vehicleRemove != null) {
                            vehicleVehicleManagement.remove(vehicleRemove);
                        }
                        break;
                    case 4:
                        vehicleVehicleManagement.show();
                        break;
                    case 5:
                        System.out.println("Exit programing");
                        break;
                }
            }
                catch(Exception e){
                    System.out.println("Please enter a number between 1 to 5");
                }
            } while (choiceMainMenu != 5) ;
        while (choiceMainMenu !=5);
    }
}

