import java.util.HashMap;

public class PromissoryNote {
    public HashMap<String, Double> loans;

    public PromissoryNote() {
        loans = new HashMap<>();
    }

    public void setLoan(String toWhom, double value) {
        loans.put(toWhom, value);
    }

    public double howMuchIsTheDebt(String whose) {
        if (loans.containsKey(whose)) {
            return loans.get(whose);
        }
        return 0;
    }

    public static void main(String[] args) {
        PromissoryNote mattisNote = new PromissoryNote();
        mattisNote.setLoan("Arto", 51.5);
        mattisNote.setLoan("Arto", 10.5);

        System.out.println(mattisNote.howMuchIsTheDebt("Arto"));
    }
}
