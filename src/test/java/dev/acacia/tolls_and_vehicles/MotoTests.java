package dev.acacia.tolls_and_vehicles;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MotoTests {
    @Test
    public void testMotoConstructorWithParameters() {
        // Crear una instancia de Moto usando el constructor con parámetros
        Moto moto = new Moto("CAR1234", 500.0f);
        // Verificar que la placa y el peaje se inicializan correctamente
        assertEquals("CAR1234", moto.getPlate());
        assertEquals(500.0f, moto.getAmountToll());
    }

    @Test
    public void testConstructorWithoutParameters() {
        Moto moto = new Moto();
        // Verificar que los valores por defecto sean null para plate y 0.0f para
        // amountToll
        assertNull(moto.getPlate(), "El valor de plate debe ser null");
        assertEquals(0.0f, moto.getAmountToll(), "El valor de amountToll debe ser 0.0f");
    }

    @Test
    void testSetAmountToll() {
        Moto moto = new Moto();
        moto.setAmountToll();
        assertEquals(50.0f, moto.getAmountToll());
    }
}