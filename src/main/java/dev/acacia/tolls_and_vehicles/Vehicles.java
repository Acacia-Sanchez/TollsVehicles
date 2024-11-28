package dev.acacia.tolls_and_vehicles;

public abstract class Vehicles {
    protected String plate;
    protected float amountToll;

    public Vehicles(String plate, float amountToll) {
        this.plate = plate;
        this.amountToll = amountToll;
    }
    
    public Vehicles() {
    }
    
    public String getPlate() {
        return plate;
    }
    public void setPlate(String plate) {
        this.plate = plate;
    }

    public float getAmountToll() {
        return amountToll;
    }
    public void setAmountToll() {
    }
    
}
