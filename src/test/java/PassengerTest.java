import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PassengerTest {

    private Passenger passenger;

    @BeforeEach

   public void setUp(){

        passenger = new Passenger("Tom", "449876", 10);

    }


    @Test

    public void canGetName(){
        assertThat(passenger.getName()).isEqualTo("Tom");
    }

    @Test

    public void canSetName(){
        passenger.setName("Harry");
        assertThat(passenger.getName()).isEqualTo("Harry");
    }

    @Test

    public void canGetTeleNumber(){
        assertThat(passenger.getTeleNumber()).isEqualTo("449876");
    }

    @Test

    public void canSetTeleNumber(){
        passenger.setTeleNumber("567");
        assertThat(passenger.getTeleNumber()).isEqualTo("567");
    }

    @Test

    public void canGetId(){
        assertThat(passenger.getId()).isEqualTo(10);
    }

    @Test

    public void canSetId(){
        passenger.setId(12);
        assertThat(passenger.getId()).isEqualTo(12);
    }

}
