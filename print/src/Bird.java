import java.util.ArrayList;
import java.util.Scanner;

public class Bird {
    public String name;
    public String latinName;
    public int observation;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observation = 0;
    }

    public void Observed() {
        this.observation++;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.observation + " observations";
    }

    public static void main(String[] args) {
        ArrayList<Bird> birdDB = new ArrayList<>();
        Scanner reader = new Scanner(System.in);

        System.out.println("Commands: Add, Observation, Statistics, Show, Quit");
        while (true) {
            System.out.println("?");
            String command = reader.nextLine();

            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = reader.nextLine();

                System.out.print("Latin name: ");
                String latinName = reader.nextLine();

                Bird added = new Bird(name, latinName);
                birdDB.add(added);
            }

            else if (command.equals("Observation")) {
                System.out.print("What was observed? ");
                String obs = reader.nextLine();

                for (Bird i : birdDB) {
                    if (i.getName().equals(obs)) {
                        i.Observed();
                    }
                    else {
                        System.out.println("Is not a bird");
                    }
                }
            }

            else if (command.equals("Statistics")) {
                for (Bird i : birdDB) {
                    System.out.println(i);
                }
            }

            else if (command.equals("Show")) {
                System.out.print("What? ");
                String name = reader.nextLine();
                for (Bird i : birdDB) {
                    if (i.getName().equals(name)) {
                        System.out.println(i);
                    }
                }
            }
            else if (command.equals("Quit")) {
                break;
            }
            else {
                System.out.println("Commands: Add, Observation, Statistics, Show, Quit");
            }
        }
    }
}
