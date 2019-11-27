import java.util.ArrayList;

public class Container {
    public ArrayList<Suitcase> suitcases;
    public int maxWeight;

    public Container(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= maxWeight) {
            suitcases.add(suitcase);
        }
    }

    public int totalWeight() {
        int total = 0;
        for (Suitcase s : suitcases) {
            total += s.totalWeight();
        }
        return total;
    }

    public void printThings() {
        for (Suitcase s : suitcases) {
            s.printThings();
        }
    }

    public String toString() {
        return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }

    public static void main(String[] Container) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        // adding 100 suitcases with one brick in each
        for (int i = 0; i < 100; i++) {
            Thing brick = new Thing("Brick", 22);
            Suitcase a = new Suitcase(100);
            a.addThing(brick);
            container.addSuitcase(a);
        }
    }
}
