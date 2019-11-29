import java.util.ArrayList;
import java.util.HashMap;

public class Airport {
    public ArrayList<Plane> planes;
    public HashMap<Plane, Flight> flights;

    public Airport() {
        planes = new ArrayList<>();
        flights = new HashMap<>();
    }

    public void addPlane(String planeID, int capacity) {
        planes.add(new Plane(planeID, capacity));
    }

    public void addFlight(String planeID, Flight flight) {
        for (Plane s : planes) {
            if (s.getPlaneID().equals(planeID)) {
                Plane plane = new Plane(s.planeID, s.capacity);
                flights.put(plane, flight);
                break;
            }
        }
    }

    public void printPlanes() {
        for (Plane s : planes) {
            System.out.println(s);
        }
    }

    public void printFlights() {
        for (Plane s : flights.keySet()) {
            System.out.println(s + " " + flights.get(s));
        }
    }

    public void printPlaneInfo(String planeID) {
        for (Plane s : planes) {
            if (s.getPlaneID().equals(planeID)) {
                System.out.println(s);
            }
        }
    }
}
