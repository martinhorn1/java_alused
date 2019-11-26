public class Smileys {
    private static void printWithSmileys(String characterString) {
        int length = characterString.length();
        if (length % 2 == 0) {
            System.out.print(":)");
            for (int i = 0; i <= length; i+=2) {
                System.out.print(":)");
            }
            System.out.println(":)");
            System.out.println(":) " + characterString + " :)");
            System.out.print(":)");
            for (int i = 0; i <= length; i+=2) {
                System.out.print(":)");
            }
            System.out.println(":)");
        }
        else {
            System.out.print(":)");
            for (int i = 0; i <= length; i+=2) {
                System.out.print(":)");
            }
            System.out.println(":):)");
            System.out.println(":) " + characterString + "  :)");
            System.out.print(":)");
            for (int i = 0; i <= length; i+=2) {
                System.out.print(":)");
            }
            System.out.println(":):)");
        }
    }

    public static void main(String[] args) {
        printWithSmileys(":D");
        printWithSmileys("87. and extra length for testing");
    }
}
