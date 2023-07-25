public interface IPlay {

    boolean isRunning();
    String start();
    String displayMenu();
    String promptForAddFlightId();
    String promptForAddFlightDestination();
    String promptForAddPassengerId();
    String promptForAddPassengerName();

    String promptForAddPassengerTeleNumber();
    String promptForBooking(String name, int id, String destination, int flightId);
    String promptForCancelFlight(String destination, int flightId);
    String promptForDisplayFlight();

}
