import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    public HashMap<String, String> dict = new HashMap();

    public Dictionary() {
        this.dict = new HashMap<>();
    }

    public String translate(String word) {
        return dict.get(word);
    }

    public void add(String word, String translation) {
        dict.put(word, translation);
    }

    public int amountOfWords() {
        return dict.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> result = new ArrayList<>();

        for (String key : dict.keySet()) {
            result.add(key + " = " + dict.get(key));
        }
        return result;
    }

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("cembalo", "harpsichord");

        ArrayList<String> translations = dictionary.translationList();
        for(String translation: translations) {
            System.out.println(translation);
        }
    }
}
