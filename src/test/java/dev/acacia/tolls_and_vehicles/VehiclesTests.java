package dev.acacia.tolls_and_vehicles;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VehiclesTests {

    @Test
    public void testConstructorWithoutParameters() {
        Vehicles vehicle = new Vehicles();
        
        // Verificar que los valores por defecto sean null para plate y 0.0f para amountToll
        assertNull(vehicle.getPlate(), "El valor de plate debe ser null");
        assertEquals(0.0f, vehicle.getAmountToll(), "El valor de amountToll debe ser 0.0f");
    }

    @Test
    public void testSetAmountToll() {
        Vehicles vehicles = new Vehicles("TEST123", 10.0f);
        vehicles.setAmountToll();
        assertEquals(10.0f, vehicles.getAmountToll());
    }

    @Test
    public void testGetPlate() {
        Vehicles vehicles = new Vehicles("TEST4567", 20.0f);
        assertEquals("TEST4567", vehicles.getPlate());
    }

    @Test
    public void testSetPlate() {
        Vehicles vehicles = new Vehicles();
        vehicles.setPlate("TEST890");
        assertEquals("TEST890", vehicles.getPlate());
    }
}
