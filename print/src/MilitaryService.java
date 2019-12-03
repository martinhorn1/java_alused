public class MilitaryService implements NationalService {
    int daysLeft = 0;

    public MilitaryService(int daysLeft) {
        this.daysLeft = daysLeft;
    }

    @Override
    public int getDaysLeft() {
        return daysLeft;
    }

    @Override
    public void work() {
        if (daysLeft >= 1) {
            daysLeft --;
        }
    }

    public static void main(String[] args) {
        MilitaryService test = new MilitaryService(200);
        System.out.println(test.getDaysLeft());
        test.work();
        System.out.println(test.getDaysLeft());
    }
}
