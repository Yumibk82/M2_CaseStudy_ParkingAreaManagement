package Behaviors;

import Entities.Car;
import Entities.ElectricBike;
import Entities.Motor;
import Entities.Vehicle;

import java.util.ArrayList;

public class VehicleManagement<E extends Vehicle> implements IMethod<E> {
    ArrayList<E> vehicleManagement = new ArrayList<E>();

    @Override
    public void add(E addObj){
        vehicleManagement.add(addObj);
    }
    public void update(E newObj,E previousObj){
        previousObj.setLicensePlate(newObj.getLicensePlate());
        previousObj.setModel(newObj.getModel());
        previousObj.setName(newObj.getName());
        previousObj.setColor(newObj.getColor());

        if(previousObj instanceof Car && newObj instanceof Car){
            ((Car)previousObj).setSafeDriveMode(((Car)newObj).getSafeDriveMode());
        }
        if(previousObj instanceof Motor && newObj instanceof Motor) {
            ((Motor)previousObj).setTransmissionMode(((Motor) newObj).getTransmissionMode());
        }
        if(previousObj instanceof ElectricBike && newObj instanceof ElectricBike){
            ((ElectricBike)previousObj).setElectricEnergy(((ElectricBike)newObj).getElectricEnergy());
        }
    }
    @Override
    public void remove(E removeObj){
        vehicleManagement.removeIf(obj->obj.getLicensePlate()==removeObj.getLicensePlate());
    }
    @Override
    public E search(int licencePlate){
        for (E obj: vehicleManagement) {
            if(obj.getLicensePlate()==licencePlate){
                return obj;
            }
        }
        return null;
    }
    @Override
    public void show(){
        for (E obj:vehicleManagement) {
            System.out.println(obj.toString());
        }
    }

}
