import java.util.ArrayList;

public class Box implements ToBeStored {
    public ArrayList<ToBeStored> things;
    public double maxWeight;

    @Override
    public double weight() {
        double weight = 0;

        for (ToBeStored s : things) {
            weight += s.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + things.size() + " things, total weight " + weight() + " kg";
    }

    public Box(double maxWeight) {
        this.things = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void add(ToBeStored obj) {
        if (obj.weight() + weight() < maxWeight) {
            things.add(obj);
        }
    }

    public static void main(String[] args) {
        Box box = new Box(10);
        Box box2 = new Box(5);
        Box box3 = new Box(9);

        box2.add( new Book1("Fedor Dostojevski", "Crime and Punishment", 2) ) ;
        box2.add( new Book1("Robert Martin", "Clean Code", 1) );
        box2.add( new Book1("Kent Beck", "Test Driven Development", 0.7) );

        box.add(box2);
        box3.add(box2);

        System.out.println( box );
        System.out.println( box2 );
        System.out.println( box3 );
    }
}
