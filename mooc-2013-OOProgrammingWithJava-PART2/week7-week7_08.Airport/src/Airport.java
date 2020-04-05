import java.util.ArrayList;
import java.util.Scanner;

public class Airport {
    private Scanner reader;
    private ArrayList<Plane> planes = new ArrayList<Plane>();
    private ArrayList<Flight> flights = new ArrayList<Flight>();

    public Airport(Scanner reader){
        this.reader = reader;
    }

    public void start() {
        System.out.println("Airport panel");
        System.out.println("--------------------\n");
        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flights");
            System.out.println("[x] Exit");
            String input = reader.nextLine().trim().toLowerCase();
            //Make sure the application can be closed;
            if (input.equals("x")) {
                break;
            }
            if (input.equals("1")) {
                System.out.println("Give plane ID:");
                String planeID = reader.nextLine().trim().toUpperCase();
                System.out.println("Give plane capacity:");
                int capacity = Integer.parseInt(reader.nextLine().trim());
                this.planes.add(new Plane (planeID, capacity));
            }
            if (input.equals("2")) {
                //User input
                System.out.println("Give plane ID:");
                String planeID = reader.nextLine().trim().toUpperCase();
                System.out.println("Give departure airport code:");
                String departure = reader.nextLine().trim().toUpperCase();
                System.out.println("Give destination airport code:");
                String destination = reader.nextLine().trim().toUpperCase();
                //Search Plane by ID and add plane to flights
                for (Plane plane : planes) {
                    if (plane.getID().equals(planeID)) {
                        flights.add(new Flight(plane, departure, destination));
                    }
                }
            }
        }
    }

    public void flightService() {
        System.out.println("Flight service");
        System.out.println("------------\n");

        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            String input = reader.nextLine().trim();
            if (input.equals("x")) {
                break;
            }
            if (input.equals("1")) {
                for (Plane plane : planes) {
                    System.out.println(plane);
                }
            }
            if (input.equals("2")) {
                for (Flight flight : flights) {
                    System.out.println(flight);
                }
            }
            if (input.equals("3")) {
                System.out.println("Give plane ID:");
                String planeID = reader.nextLine().trim().toUpperCase();
                for (Plane plane : planes) {
                    if (plane.getID().equals(planeID)) {
                        System.out.println(plane);
                    }
                }
            }
        }
    }
}
