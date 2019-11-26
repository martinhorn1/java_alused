import java.util.ArrayList;

public class Changer {
    public ArrayList<Change> changeList;

    public Changer() {
        changeList = new ArrayList<>();
    }

    public void addChange(Change change) {
        changeList.add(change);
    }

    public String change(String characterString) {
        String result = "";
        for (Change s : changeList) {
            characterString = s.change(characterString);
        }
        return characterString;
    }

    public static void main(String[] args) {
        Changer scandiesAway = new Changer();
        scandiesAway.addChange(new Change('ä', 'a'));
        scandiesAway.addChange(new Change('ö', 'o'));
        System.out.println(scandiesAway.change("ääliö älä lyö, ööliä läikkyy"));
    }
}
