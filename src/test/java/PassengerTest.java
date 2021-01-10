import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;

    @Before
    public void setUp(){
        passenger1 = new Passenger("Mark", 2);

    }

    @Test
    public void canGetName(){
        assertEquals("Mark", passenger1.getName());
    }

    @Test
    public void canGetBags() {
        assertEquals(2, passenger1.getBags());
    }
}