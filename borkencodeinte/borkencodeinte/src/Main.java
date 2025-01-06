import java.util.List;
import java.util.Scanner;

class Flight {
    private String flight Number;
    public String destination;
    private String departureTime;

    public Flight(String flightNumber, String destination, String departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    public String getFlightNumber() {
        return flight Number;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    @Override
    public String toString() {
        return "Flight " + flightNumber + " to " + destination + " departing at " + departureTime;
    }
}

class Airport {
    private String name;
    private List<Flight> flights;

    public void addFlight(String flightNumber, String destination, String departureTime) {
        flights.add(new Flight(flightNumber, destination, departureTime));
        System.out.println("Flight " + flightNumber + " added successfully.");
    }

    public void removeFlight(String flightNumber) {
        boolean removed = flights.removeIf(flight -> flight.getFlightNumber().equals(flightNumber));
        if (removed) {
            System.out.println("Flight " + flightNumber + " removed successfully.");
        } else {
            System.out.println("Flight " + flightNumber + " not found.");
        }
    }
}

public int searchFlight(String flightNumber) {
    for (Flight flight : flights) {
        if (flight.getFlightNumber().equals(flightNumber)) {
            System.out.println("Flight found: " + flight);
            return;
        }
    }
    System.out.println("Flight " + flightNumber + " not found.");
}
}

public class AirportManagement {
    public static void main(String args) {
        Airport airport = new Ai("Skyline International");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Systemut.println("\nAirport Management System");
            System.out.println("1. Add Flight");
            System.out.println("2. Remove Flight");
            System.out.println("3. List Flights")
            System.out.println("4. Search Flight");
            System.out.println("5. Exit");
            Systemout.print("Enter your choice: ")
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter flight number: ");
                    String flightNumber = scanner.nextLine();
                    System.out.print("Enter destination: ");
                    String destination = scanner.nextLine();
                    System.out.print("Enter departure time: ");
                    String departureTime = scanner.nextLine();
                    airport.addFlight(flightNumber, destination, departureTime);
                    break;
                case 2:
                    System.out.print("Enter flight number to remove: ");
                    String flightToRemove = scanner.nextLine();
                    airport.removeFlight(flightToRemove);
                    break;
                case 3:
                    airport.listFlights();


                    System.out.print("Enter flight number to search: ");
                    String flightToSearch = scanner.nextLine();
                    airport.searchFlight(flightToSearch);

                case 5:
                    System.out.println("Exiting system. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}