package com.palash.parkinglot.models;

import com.palash.parkinglot.enums.ParkingSlotStatus;
import com.palash.parkinglot.enums.VehicleType;

import java.util.List;

public class ParkingSlot extends BaseModel {
    private  int slotNumber;
    private ParkingSlotStatus parkingSlotStatus;
    private VehicleType vehicleType;
    private  Vehicle vehicle;
    private ParkingFloor parkingFloor;

    public int getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public ParkingSlotStatus getParkingSlotStatus() {
        return parkingSlotStatus;
    }

    public void setParkingSlotStatus(ParkingSlotStatus parkingSlotStatus) {
        this.parkingSlotStatus = parkingSlotStatus;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }
}
