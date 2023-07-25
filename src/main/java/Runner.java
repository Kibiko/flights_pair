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
                    int count2 = 1;
                    for (Passenger passenger : airport.getUserbase()){
                        System.out.println(count2 + " . " +passenger.getName() +", " +passenger.getTeleNumber() +", " +passenger.getId());
                        count2 ++;

                    }

                    int choice2 = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println(terminal.promptForDisplayFlight());
                    int count3 = 1;
                    for(Flight flight : airport.getAvailableFlights()){
                        System.out.println(count3 + " . " +flight.getDestination() +", " +flight.getId());
                        count3 ++;
                    }
                    int choice3 = scanner.nextInt();
                    scanner.nextLine();
                    airport.bookUser(airport.getUserbase().get(choice2 - 1),airport.getAvailableFlights().get(choice3 -1) );
                    break;

                case 5:
                    System.out.println(terminal.promptForDisplayFlight());
                    int count = 1;
                    for(Flight flight : airport.getAvailableFlights()){
                        System.out.println(count + " . " +flight.getDestination() +", " +flight.getId());
                        count ++;
                    }
                    int choice = scanner.nextInt();
                    scanner.nextLine();
                    airport.cancelFlight(choice -1);
                    break;


            }

        }

    }

}
