public class DecreasingCounter {
    private int value;
    private int init;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        init = valueAtStart;
    }
    public void printValue() {
        System.out.println("Value: " + this.value);
    }
    public void decrease() {
        if (this.value > 0) {
            this.value -= 1;
        }
    }
    public void reset() {
        this.value = 0;
    }
    public void setInitial() {
        this.value = init;
    }

    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.setInitial();
        counter.printValue();
    }
}
