package dev.acacia.tolls_and_vehicles;

public class Moto extends Vehicles {

    public Moto(String plate, float amountToll) {
        super(plate, amountToll);
    }

    public Moto() {
        super();
    }

    @Override
    public void setAmountToll() {
        this.amountToll = 50.0f;
    }

}
