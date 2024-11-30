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

    public int getAxis() {
        return axis;
    }

    public void setAxis(int axis) {
        this.axis = axis;
    }

    @Override
    public void setAmountToll() {
        if (this.axis <= 0) {
            System.out.println("Error: Axis must be greater than 0. Then I'm calculating as 1 axis.");
            this.amountToll = (50.0f);
        } else {
            this.amountToll = (50.0f * this.axis);
        }
    }

}