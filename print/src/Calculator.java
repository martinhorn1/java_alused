public class Calculator {
    public Reader reader;
    public int numOfCalculations = 0;

    public Calculator() {
        reader = new Reader();
        numOfCalculations = 0;
    }

    public int[] getValues() {
        int[] values = new int[2];

        System.out.print("Value 1: ");
        values[0] = reader.readInteger();
        System.out.print("Value 2: ");
        values[1] = reader.readInteger();
        return values;
    }

    private void sum() {
        int[] values = getValues();
        System.out.println("Sum of the values: " + (values[0] + values[1]));
    }

    private void difference() {
        int[] values = getValues();
        System.out.println("Difference of the values: " + (Math.abs(values[0] - values[1])));
    }

    private void product() {
        int[] values = getValues();
        System.out.println("Product of the values: " + (values[0] * values[1]));
    }

    private void statistics() {
        System.out.println("Calculations done: " + numOfCalculations);
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
                numOfCalculations ++;
            } else if (command.equals("difference")) {
                difference();
                numOfCalculations ++;
            } else if (command.equals("product")) {
                product();
                numOfCalculations ++;
            }
        }
        statistics();
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.start();
    }
}
