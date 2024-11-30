package dev.acacia.tolls_and_vehicles;

import java.util.ArrayList;
import java.util.List;

public class TollStation {
    private String name = "", city = "";
    List<Vehicles> vehicles = new ArrayList<>(); // inicializa lista vehiculos, para evitar NullPointerException al estar vacia
    private float totalAmount;  
    
    //TollStation tollStation = new TollStation("Tremañes", "Gijón", vehicles, 0);

    public TollStation(String name, String city, List<Vehicles> vehicles, float totalAmount) {
        this.name = name;
        this.city = city;
        this.vehicles = vehicles;
        this.totalAmount = totalAmount;
    }

    public TollStation() {
        
    }   

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    } 

    public String getCity() {    
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }   

    public List<Vehicles> getVehicles() {
        return vehicles;
    }
    public void setVehicles(List<Vehicles> vehicles) {
        this.vehicles = vehicles;
    } 

    public float getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    } 

    public void addCar(String plate) {
        Car car = new Car();
        car.setPlate(plate);
        vehicles.add(car);
        System.out.println("Car added. Plate: " + car.getPlate() + " Amount: " + car.getAmountToll());
        totalAmount += car.getAmountToll();
    }

    public void addMoto(String plate) {
        Moto moto = new Moto();
        moto.setPlate(plate);
        vehicles.add(moto);
        System.out.println("Moto added. Plate: " + moto.getPlate() + " Amount: " + moto.getAmountToll());
        totalAmount += moto.getAmountToll();
    }

    public void addTruck(String name) {
        Truck truck = new Truck();
        truck.setPlate(name);
        truck.setAxis(3);
        vehicles.add(truck);
        System.out.println("Truck added. Plate: " + truck.getPlate() + " Amount: " + truck.getAmountToll());
        totalAmount += truck.getAmountToll();
    }

    public void printVehicles() {
        for (Vehicles vehicle : vehicles) {
            System.out.println("Plate: " + vehicle.getPlate() + " Amount: " + vehicle.getAmountToll());
        }
    }

    public void printTotalAmount() {
        System.out.println(String.format("Toll Station: %s from city: %s. Total amount collected: %s", name, city, totalAmount));
    }

}
