import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class PrintingLAB {
    public static void main(String[] args) {
        xmasTree(8);
    }
    public static void printStars(int amount, boolean change) {
        while (true) {
            if (amount <= 0) {
                break;
            }
            System.out.print("*");
            amount--;
        }
        if (change) {
            System.out.println();
        }
    }
    public static void printWhitespaces(int size) {
        while (true) {
            if (size <= 0) {
                break;
            }
            System.out.print(" ");
            size--;
        }
    }
    public static void printTriangle(int size) {
        int counter = 1;
        while (true) {
            if (size <= 0) {
                break;
            }
            printWhitespaces(size-1);
            printStars(counter, true);
            size--;
            counter++;
        }
    }
    public static void xmasTree(int height) {
        int width = 1;
        while (true) {
            if (height <= 0) {
                break;
            }
            printWhitespaces(height-1);
            printStars(width, false);
            printStars(width-1, true);
            height--;
            width++;
        }
        printWhitespaces(width-3);
        System.out.println("***");
        printWhitespaces(width-3);
        System.out.println("***");
    }
}
