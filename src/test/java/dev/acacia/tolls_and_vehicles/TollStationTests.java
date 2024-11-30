package dev.acacia.tolls_and_vehicles;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TollStationTests {

    private TollStation tollStat;

    @BeforeEach
    void setUp() {
        tollStat = new TollStation("Tremañes", "Gijón", new ArrayList<>(), 8.0f);
    }

    @Test
    void testConstructorWithParameters() {
        assertEquals("Tremañes", tollStat.getName());
        assertEquals("Gijón", tollStat.getCity());
        assertTrue(tollStat.getVehicles().isEmpty());
        assertEquals(8.0f, tollStat.getTotalAmount(), "El valor de totalAmount debe ser 8.0f");
    }

    @Test
    void testAddCar() {
        tollStat.addCar("CARaca123");
        tollStat.addCar("CARbouba123");
        assertEquals(2, tollStat.getVehicles().size());
    }

    @Test
    void testAddMoto() {
        tollStat.addMoto("Motoaca123");
        assertEquals("Motoaca123", tollStat.getVehicles().get(0).getPlate());
    }

    @Test
    void testAddTruck() {

    }

    @Test
    void testPrintTotalAmount() {
        tollStat.printTotalAmount();
        tollStat.setTotalAmount(150);
        assertEquals(150.0f, tollStat.getTotalAmount());

    }
    /* public void printTotalAmount() {
        System.out.println(String.format("Toll Station: %s from city: %s. Total amount collected: %s", name, city, totalAmount));
    }
     */

    @Test
    void testPrintVehicles() {
        tollStat.printVehicles();
        tollStat.setCity("Embour");
        assertEquals("Embour", tollStat.getCity());
    }
  
    @Test
    void testSetCity() {

    }

    @Test
    void testSetName() {

    }

    @Test
    void testSetTotalAmount() {
        tollStat.setTotalAmount(180.0f);
        assertEquals(tollStat.getTotalAmount(), 180.0f);
    }

    @Test
    void testSetVehicles() {

    }

}