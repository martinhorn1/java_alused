import java.util.ArrayList;

public class Suitcase {
    public ArrayList<Thing> things;
    public int maxWeight;
    public int currentWeight = 0;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        things = new ArrayList<>();
    }

    public void addThing(Thing thing) {
        if (thing.weight + currentWeight <= maxWeight) {
            things.add(thing);
            currentWeight += thing.weight;
        }
    }

    public void printThings() {
        for (Thing s : things) {
            System.out.println(s);
        }
    }

    public int totalWeight() {
        return this.currentWeight;
    }

    public Thing heaviestThing() {
        if (things.isEmpty()) {
            return null;
        }

        Thing heaviest = things.get(0);
        for (Thing s : things) {
            if (s.weight > heaviest.weight) {
                heaviest = s;
            }
        }
        return heaviest;
    }

    public String toString() {
        if (things.size() == 0) {
            return "Empty (" + currentWeight + " kg)";
        }
        else if (things.size() == 1) {
            return things.size() + " thing (" + currentWeight + " kg)";
        }
        else {
            return things.size() + " things (" + currentWeight + " kg)";
        }
    }

    public static void main(String[] args) {
        Thing book = new Thing("Happiness in Three Steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);
        Thing brick = new Thing("Brick", 4);

        Suitcase suitcase = new Suitcase(10);
        suitcase.addThing(book);
        suitcase.addThing(mobile);
        suitcase.addThing(brick);

        Thing heaviest = suitcase.heaviestThing();
        System.out.println("The heaviest thing: " + heaviest);
    }
}
