package dev.acacia.tolls_and_vehicles;

public class Truck extends Vehicles {

    protected int axis;

    public Truck(String plate, float amountToll, int axis) {
        super(plate, amountToll);
        this.axis = axis;
    }

    public Truck() {
        super();
    }
    
    @Override
    public void setAmountToll() {
        if (axis <= 0) {
            System.out.println("Error: Axis must be greater than 0. Then I'm calculating as 1 axis.");
            this.amountToll = (50.0f * 1);
        } else {
            this.amountToll = (50.0f * axis);
        }
    }
    
}
