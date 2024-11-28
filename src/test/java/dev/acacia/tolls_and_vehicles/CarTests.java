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
    void testSetAmountToll() {
        Car car = new Car("CAR1234", 0.0f);
        car.setAmountToll();
        assertEquals(100.0f, car.getAmountToll());
    }
}

/* 
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
 */