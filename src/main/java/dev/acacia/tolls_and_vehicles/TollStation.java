package dev.acacia.tolls_and_vehicles;

import java.util.ArrayList;
import java.util.List;

public class TollStation {
    private String name, city;
    List<Vehicles> vehicles;
    private float totalAmount;  
    
    TollStation tollStation = new TollStation("Tremañes", "Gijón", vehicles, 0);

    public TollStation(String name, String city, List<Vehicles> vehicles, float totalAmount) {
        this.name = name;
        this.city = city;
        this.vehicles = vehicles;
        this.totalAmount = totalAmount;
    }

    public TollStation() {
        vehicles = new ArrayList<>(); // esto inicializa la lista de vehiculos, para evitar NullPointerException al estar vacia
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

    public void addCar() {
        Car car = new Car();
        car.setPlate("CAR1234");
        vehicles.add(car);
        car.setAmountToll();
        System.out.println("Car added. Plate: " + car.getPlate() + " Amount: " + car.getAmountToll());
        totalAmount += car.getAmountToll();
    }

    public void addMoto() {
        Moto moto = new Moto();
        moto.setPlate("MOTO2345");
        moto.setAmountToll();
        vehicles.add(moto);
        System.out.println("Moto added. Plate: " + moto.getPlate() + " Amount: " + moto.getAmountToll());
        totalAmount += moto.getAmountToll();
    }

    public void addTruck() {
        Truck truck = new Truck("TRUCK54568", 0, 3);
        truck.setAmountToll();
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
        System.out.println("Toll Station: " + name + " from city: " + city + " Total amount collected: " + totalAmount);
    }

}
