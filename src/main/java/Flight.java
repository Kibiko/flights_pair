import java.util.ArrayList;

public class Flight {

    //properties

    private String destination;
    private int id;
    private ArrayList<Passenger> passengers;

    //constructor

    public Flight(String destination, int id){
        this.destination = destination;
        this.id = id;
        this.passengers = new ArrayList<>();
    }

    //methods

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public int getSize(){
        return passengers.size();
    }

    public void addPassenger(Passenger passenger){
        this.passengers.add(passenger);
    }

    public void removePassenger(Passenger passenger){
        this.passengers.remove(passenger);
    }

}
