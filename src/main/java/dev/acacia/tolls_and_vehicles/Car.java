package dev.acacia.tolls_and_vehicles;

public class Car extends Vehicles {

    public Car(String plate, float amountToll) {
        super(plate, amountToll);
    }

    public Car() {
        super();
    }

    @Override
    public void setAmountToll() {
        this.amountToll = 100.0f;
    }
    
}