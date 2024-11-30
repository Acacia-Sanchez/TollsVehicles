package dev.acacia.tolls_and_vehicles;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TruckTests {

    @Test
    void testMotoConstructorWithParameters() {
        Truck truck = new Truck("TRUCK1234", 500.0f, 4);
        assertEquals("TRUCK1234", truck.getPlate());
        assertEquals(500.0f, truck.getAmountToll());
    }

    @Test
    void testGetAxis() {
        Truck truck = new Truck();
        truck.setAxis(4);
        assertEquals(4, truck.getAxis());
    }

    @Test
    void testSetAmountTollWithAxis() {
        Truck truck = new Truck("TRUCK2345", 50.0f, 4);
        truck.setAmountToll();
        assertEquals(200.0f, truck.getAmountToll());
    }

    @Test
    void testSetAxis() {

    }
}
