import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PlaneTest {
    Plane plane1;
    Plane plane2;
    Plane plane3;

    @Before
    public void setUP(){
        plane1 = new Plane(PlaneType.AIRBUS_A380);
        plane2 = new Plane(PlaneType.BOEING_737);
        plane3 = new Plane(PlaneType.CESSNA_182);
    }

    @Test
    public void canGetAircraftType(){
        assertEquals(PlaneType.AIRBUS_A380, plane1.getAircraft());
    }

    @Test
    public void canGetPassengerCapacity(){
        assertEquals(600, plane1.getCapacityFromEnum());
    }

    @Test
    public void canGetAircraftTotalWeight(){
        assertEquals(40, plane2.getWeightFromEnum());
    }
}
