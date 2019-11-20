public class StringUtils {
    public static boolean included(String word, String searched) {
        if (word.trim().toUpperCase().contains(searched.trim().toUpperCase())) {
            return true;
        }
        else {
            return false;
        }
    }
}
