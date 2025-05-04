/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package airplan_system;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author LENOVO
 */
public class TicketReservationTest {
    
    public TicketReservationTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class TicketReservation.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TicketReservation.main(args);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of loadFlightDetails method, of class TicketReservation.
     */
    @Test
    public void testLoadFlightDetails() {
        System.out.println("loadFlightDetails");
        int flightId = 0;
        TicketReservation instance = null;
        instance.loadFlightDetails(flightId);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of bookTicket method, of class TicketReservation.
     */
    @Test
    public void testBookTicket() {
        System.out.println("bookTicket");
        TicketReservation instance = null;
        instance.bookTicket();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of updateSeatsLeft method, of class TicketReservation.
     */
    @Test
    public void testUpdateSeatsLeft() {
        System.out.println("updateSeatsLeft");
        TicketReservation instance = null;
        instance.updateSeatsLeft();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of updateBookingCount method, of class TicketReservation.
     */
    @Test
    public void testUpdateBookingCount() {
        System.out.println("updateBookingCount");
        TicketReservation instance = null;
        instance.updateBookingCount();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
