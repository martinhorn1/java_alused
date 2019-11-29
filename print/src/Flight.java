public class Flight {
    public String departure;
    public String destination;

    public Flight(String departure, String destination) {
        this.departure = departure;
        this.destination = destination;
    }

    public String toString() {
        return "(" + departure + "-" + destination + ")";
    }
}
