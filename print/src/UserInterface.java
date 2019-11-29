import java.util.Scanner;

public class UserInterface {
    public Scanner reader;
    public Airport airport;

    public UserInterface(Scanner reader, Airport airport) {
        this.reader = reader;
        this.airport = airport;
    }

    public void listAirportOperations() {
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
        System.out.print("> ");
    }

    public void airportPanel() {
        System.out.println("Airport panel");
        System.out.println("-------------");

        while (true) {
            System.out.println("\nChoose operation:");
            listAirportOperations();
            String input = reader.nextLine();

            if (input.equals("1")) {
                addPlane();
            }
            else if (input.equals("2")) {
                addFlight();
            }
            else if (input.equals("x")) {
                break;
            }
        }
    }

    public void listFlightServices() {
        System.out.println("[1] Print planes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Exit");
        System.out.print("> ");
    }

    public void flightService() {
        System.out.println("\nFlight service");
        System.out.println("--------------");

        while (true) {
            System.out.println("\nChoose operation:");
            listFlightServices();
            String input = reader.nextLine();

            if (input.equals("1")) {
                airport.printPlanes();
            }
            else if (input.equals("2")) {
                airport.printFlights();
            }
            else if (input.equals("3")) {
                System.out.print("Insert plane ID: ");
                airport.printPlaneInfo(reader.nextLine());
            }
            else if (input.equals("x")) {
                System.out.println("End of the program");
                break;
            }
        }
    }

    public void addPlane() {
        System.out.print("Insert plane ID: ");
        String planeID = reader.nextLine();
        System.out.print("Insert plane capacity: ");
        int planeCapacity = Integer.parseInt(reader.nextLine());

        airport.addPlane(planeID, planeCapacity);
    }

    public void addFlight() {
        System.out.print("Insert plane ID: ");
        String planeID = reader.nextLine();
        System.out.print("Insert departure code: ");
        String departure = reader.nextLine();
        System.out.print("Insert destination code: ");
        String destination = reader.nextLine();

        airport.addFlight(planeID, new Flight(departure, destination));
    }

    public void start() {
        airportPanel();
        flightService();
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Airport airport = new Airport();
        UserInterface ui = new UserInterface(reader, airport);

        ui.start();
    }


}
