package dev.acacia.tolls_and_vehicles;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CarTests {
    
    @Test
    public void testCarConstructorWithParameters() {
        // Crear una instancia de Car usando el constructor con parámetros
        Car car = new Car("CAR1234", 100.0f);
        // Verificar que la placa y el peaje se inicializan correctamente
        assertEquals("CAR1234", car.getPlate());
        assertEquals(100.0f, car.getAmountToll());
    }

    @Test
    public void testConstructorWithoutParameters() {
        Car car = new Car();
        // Verificar que los valores por defecto sean null para plate y 0.0f para amountToll
        assertNull(car.getPlate(), "El valor de plate debe ser null");
        assertEquals(0.0f, car.getAmountToll(), "El valor de amountToll debe ser 0.0f");
    }
    
    @Test
    void testSetAmountToll() {
        Car car = new Car();
        car.setAmountToll();
        assertEquals(100.0f, car.getAmountToll());
    }
}