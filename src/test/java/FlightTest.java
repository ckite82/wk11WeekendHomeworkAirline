import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;

    @Before
    public void setUp(){
        flight = new Flight("BA1234", "PER", "EDI", "13:00");
        plane = new Plane(PlaneType.CESSNA_182);
        passenger1 = new Passenger("Mark", 2);
        passenger2 = new Passenger("Chris", 1);
        passenger3 = new Passenger("Michael", 3);
        passenger4 = new Passenger("John", 2);
        passenger5 = new Passenger("Kat", 5);
    }

    @Test
    public void canGetFlightNumber(){
        assertEquals("BA1234", flight.getFlightNumber());
    }

    @Test
    public void canGetDestination(){
        assertEquals("PER", flight.getDestination());
    }

    @Test
    public void canGetDepartureAirport(){
        assertEquals("EDI", flight.getDepartureAirport());
    }
    @Test
    public void canGetDepartureTime(){
        assertEquals("13:00", flight.getDepartureTime());
    }

    @Test
    public void canCheckBookedPassengerListIsEmpty(){
        assertEquals(0, flight.passengerCount());
    }

    @Test
    public void canAddPassenger(){
        flight.addPassenger(passenger1);
        assertEquals(1, flight.passengerCount());
    }
    @Test
    public void canAddAnotherPassenger(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger3);
        assertEquals(2, flight.passengerCount());
    }

    @Test
    public void checkAvailableSeats(){
        flight.addPassenger(passenger1);
        assertEquals(3, flight.returnAvailableSeats(plane));
    }

    @Test
    public void bookPassengerIfAvailability(){
        assertEquals(1, flight.checkFlightAvailability(plane, passenger1));
    }

    @Test
    public void dontBookPassengerIfNoAvailability(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        assertEquals(4, flight.checkFlightAvailability(plane, passenger5));
    }
}