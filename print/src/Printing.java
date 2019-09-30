import java.util.Scanner;

public class Printing {
    public static void main(String[] args) {
        printStars(5);
        System.out.println();
        printSquare(3);
        printRectangle(8, 4);
        printTriangle(5);
    }
    public static void printStars(int amount) {
        while (true) {
            if (amount <= 0) {
                break;
            }
            System.out.print("*");
            amount--;
        }
        System.out.println();
    }
    public static void printSquare(int sideSize) {
        System.out.println("Square:");
        for (int i = 0; i < sideSize; i++) {
            printStars(sideSize);
        }
        System.out.println();
    }
    public static void printRectangle(int width, int height) {
        System.out.println("Rectangle:");
        for (int i = 0; i < height; i++) {
            printStars(width);
        }
        System.out.println();
    }
    public static void printTriangle(int size) {
        System.out.println("Triangle:");
        for (int i = 1; i <= size; i++) {
            printStars(i);
        }
    }
}
