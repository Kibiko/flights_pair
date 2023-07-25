import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AirportTest {

    private Airport airport;

    private Flight flight;
    private Passenger user;

    @BeforeEach

    public void setUp(){

        airport = new Airport();
        flight = new Flight("Madrid", 456);
        user = new Passenger("Tom", "999", 5);
        airport.addUser(user);
        airport.addNewFlight(flight);

    }

    @Test
    public void canGetAvailableFlights(){
        assertThat(airport.getAvailableFlights().size()).isEqualTo(1);
    }

    @Test
    public void canGetUserbase(){
        assertThat(airport.getUserbase().size()).isEqualTo(1);
    }

    @Test
    public void canAddNewFlight(){
        Flight flight2 = new Flight("Paris", 457);
        airport.addNewFlight(flight2);
        assertThat(airport.getFlightSize()).isEqualTo(2);
    }

    @Test
    public void canCancelFlight(){
        airport.cancelFlight(flight);
        assertThat(airport.getFlightSize()).isEqualTo(0);
    }

    @Test
    public void canAddUser(){
        Passenger user2 = new Passenger("Paris", "57", 80);
        airport.addUser(user2);
        assertThat(airport.getUserSize()).isEqualTo(2);
    }

    @Test
    public void canRemoveUser(){
        airport.removeUser(user);
        assertThat(airport.getUserSize()).isEqualTo(0);
    }

    @Test
    public void canBookUser(){

        airport.bookUser(user, flight);
        assertThat(airport.getUserSize()).isEqualTo(0);
        assertThat(flight.getSize()).isEqualTo(1);

    }


}
