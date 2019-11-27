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
        Thing book = new Thing("Happiness in three steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);
        Thing brick = new Thing("Brick", 4);

        Suitcase suitcase = new Suitcase(5);
        System.out.println(suitcase);

        suitcase.addThing(book);
        System.out.println(suitcase);

        suitcase.addThing(mobile);
        System.out.println(suitcase);

        suitcase.addThing(brick);
        System.out.println(suitcase);
    }
}
