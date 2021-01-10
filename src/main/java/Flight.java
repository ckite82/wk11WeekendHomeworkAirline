import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> bookedPassengers;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(String flightNumber, String destination, String departureAirport, String departureTime) {
        this.bookedPassengers = new ArrayList<Passenger>();
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int passengerCount() {
        return bookedPassengers.size();
    }

    public void addPassenger(Passenger passenger) {
        this.bookedPassengers.add(passenger);
    }

    public int returnAvailableSeats(Plane plane){
        return plane.getCapacityFromEnum() - passengerCount();
    }


    public int checkFlightAvailability(Plane plane, Passenger passenger) {
        if (this.passengerCount() < this.returnAvailableSeats(plane)) {
            addPassenger(passenger);
        }
        return passengerCount();
    }
}
