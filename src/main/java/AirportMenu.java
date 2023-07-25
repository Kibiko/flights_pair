public class AirportMenu implements IPlay{

    private boolean running;
    private String name;
    private String teleNumber;
    private int passengerId;
    private String destination;
    private int flightId;

    public boolean isRunning() {
        return this.running;
    }

    public String start() {
        this.running = true;
        return "Welcome to the Aiport!";
    }

    public String displayMenu() {
        return "Please pick an option: " +
                "\n 1. Add a new flight " +
                "\n 2. Display all available flights " +
                "\n 3. Add a new passenger " +
                "\n 4. Book a passenger onto a flight " +
                "\n 5. Cancel a flight \n";
    }

    public String promptForAddFlightDestination() {
        return "Add flight destination: ";
    }

    public String promptForAddFlightId(){
        return "Add flight id: ";
    }

    public String promptForAddPassengerName() {
        return "Add passenger name: ";
    }

    public String promptForAddPassengerTeleNumber() {
        return "Add passenger telephone number: ";
    }

    public String promptForAddPassengerId() {
        return "Add passenger id: ";
    }

    public String promptForBooking(String name, int passengerId, String destination, int flightId) {
        return "Confirmation booked for " + name + ", " + passengerId + " for " +destination + ", "+flightId;
    }

    public String promptForCancelFlight(String destination, int flightId) {
        return "Confirming cancellation for " + destination + ", " + flightId;
    }

    public String promptForDisplayFlight() {
        return "Here are the available flights: ";
    }
}
