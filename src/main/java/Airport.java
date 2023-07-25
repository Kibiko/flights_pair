import java.util.ArrayList;

public class Airport {

    private ArrayList<Flight> availableFlights;
    private ArrayList<Passenger> userbase;

    public Airport(){
        this.availableFlights = new ArrayList<>();
        this.userbase = new ArrayList<>();
    }

    public ArrayList<Flight> getAvailableFlights() {
        return availableFlights;
    }

    public ArrayList<Passenger> getUserbase() {
        return userbase;
    }

    public int getFlightSize(){
        return this.availableFlights.size();
    }

    public int getUserSize(){
        return this.userbase.size();
    }

    public void addNewFlight(Flight flight){
        this.availableFlights.add(flight);
    }

    public void cancelFlight(Flight flight){
        this.availableFlights.remove(flight);
    }

    public void cancelFlight(int index){
        this.availableFlights.remove(index);
    }

    public void addUser(Passenger user){
        this.userbase.add(user);
    }

    public void removeUser(Passenger user){
        this.userbase.remove(user);
    }

    public void bookUser(Passenger user, Flight flight){
        this.removeUser(user);
        flight.addPassenger(user);
    }

}
