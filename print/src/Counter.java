public class Counter {
    public int startingValue;
    public boolean check;

    public Counter(int startingValue, boolean check) {
        this.startingValue = startingValue;
        this.check = check;
    }
    public Counter(int startingValue) {
        this.startingValue = startingValue;
        this.check = true;
    }
    public Counter(boolean check) {
        this.startingValue = 0;
        this.check = check;
    }
    public Counter() {
        this.startingValue = 0;
        this.check = true;
    }

    public int value() {
        return this.startingValue;
    }
    public void increase(int increaseAmount) {
        this.startingValue += increaseAmount;
    }
    public void decrease(int decreaseAmount) {
        if (check && (startingValue - decreaseAmount) < 0) {
            startingValue = 0;
        }
        else {
            this.startingValue -= decreaseAmount;
        }
    }

    public static void main(String[] args) {
        Counter m = new Counter(7,true);
        System.out.println(m.value());
        m.decrease(9);
        System.out.println(m.value());
        m.increase(5);
        System.out.println(m.value());
        System.out.println("-----------");

        Counter i = new Counter(7);
        System.out.println(i.value());
        i.decrease(9);
        System.out.println(i.value());
        i.increase(5);
        System.out.println(i.value());
        System.out.println("-----------");

        Counter f = new Counter(false);
        System.out.println(f.value());
        f.decrease(2);
        System.out.println(f.value());
        f.increase(3);
        System.out.println(f.value());
        System.out.println("-----------");

        Counter s = new Counter();
        System.out.println(s.value());
        s.increase(1);
        System.out.println(s.value());
        s.decrease(3);
        System.out.println(s.value());
        s.decrease(3);
        System.out.println(s.value());
        s.increase(9);
        System.out.println(s.value());

    }
}
