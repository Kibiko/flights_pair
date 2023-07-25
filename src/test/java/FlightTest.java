import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FlightTest {

    private Flight flight;

    @BeforeEach
    public void setUp(){
        flight = new Flight("Copenhagen",12341);
    }

    @Test
    public void canGetDestination(){
        assertThat(flight.getDestination()).isEqualTo("Copenhagen");
    }

    @Test
    public void canSetDestination(){
        flight.setDestination("Milan");
        assertThat(flight.getDestination()).isEqualTo("Milan");
    }

    @Test
    public void canGetId(){
        assertThat(flight.getId()).isEqualTo(12341);
    }

    @Test
    public void canSetId(){
        flight.setId(13654);
        assertThat(flight.getId()).isEqualTo(13654);
    }

    @Test
    public void canGetSize(){
        assertThat(flight.getSize()).isEqualTo(0);
    }

    @Test
    public void canAddPassenger(){
        Passenger passenger = new Passenger("Kev", "134256357",123);
        flight.addPassenger(passenger);
        assertThat(flight.getSize()).isEqualTo(1);
    }

    @Test
    public void canRemovePassenger(){
        Passenger passenger = new Passenger("Kev", "134256357",123);
        flight.addPassenger(passenger);
        flight.removePassenger(passenger);
        assertThat(flight.getSize()).isEqualTo(0);
    }


}
