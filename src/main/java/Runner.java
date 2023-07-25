import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Airport airport = new Airport();
        airport.addNewFlight(new Flight("Milan",1234));
        airport.addNewFlight(new Flight("London",6574));
        airport.addNewFlight(new Flight("Tokyo",2344));
        airport.addUser(new Passenger("Michael","1234126",3254));
        String teleNumber;
        String passengerName;
        int passengerId;
        String destination;
        int flightId;

        IPlay terminal = new AirportMenu();

        System.out.println(terminal.start());

        while(terminal.isRunning()){

            System.out.println(terminal.displayMenu());

            int proceed = scanner.nextInt();
            scanner.nextLine(); //use to clear out remaining String part

            switch(proceed){
                case 1:
                    System.out.println(terminal.promptForAddFlightDestination());
                    destination = scanner.nextLine();

                    System.out.println(terminal.promptForAddFlightId());
                    flightId = scanner.nextInt();

                    airport.addNewFlight(new Flight(destination,flightId));
                    break;
                case 2:
                    System.out.println(terminal.promptForDisplayFlight());
                    for(Flight flight : airport.getAvailableFlights()){
                        System.out.println(flight.getDestination() +", " +flight.getId());
                    }
                    break;
                case 3:
                    System.out.println(terminal.promptForAddPassengerName());
                    passengerName = scanner.nextLine();

                    System.out.println(terminal.promptForAddPassengerTeleNumber());
                    teleNumber = scanner.nextLine();

                    System.out.println(terminal.promptForAddPassengerId());
                    passengerId = scanner.nextInt();

                    airport.addUser(new Passenger(passengerName, teleNumber, passengerId));
                    break;
                case 4:
                    System.out.println(terminal.promptForAddPassengerName());
                    passengerName = scanner.nextLine();

                    System.out.println(terminal.promptForAddPassengerTeleNumber());
                    teleNumber = scanner.nextLine();

                    System.out.println(terminal.promptForAddPassengerId());
                    passengerId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println(terminal.promptForAddFlightDestination());
                    destination = scanner.nextLine();

                    System.out.println(terminal.promptForAddFlightId());
                    flightId = scanner.nextInt();
                    scanner.nextLine();

                    airport.bookUser(new Passenger(passengerName, teleNumber, passengerId),new Flight(destination, flightId));
                    System.out.println(terminal.promptForBooking(passengerName,passengerId,destination,flightId));

            }

        }

    }

}
