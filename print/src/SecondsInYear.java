public class SecondsInYear {
    public static void main(String[] args) {
        int seconds = 60;
        int minutes = 60;
        int hours = 24;
        int days = 365;

        int result = seconds*minutes*hours*days;

        System.out.println("There are " + result + "seconds in a year");
    }
}
