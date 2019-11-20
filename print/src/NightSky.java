import java.util.Random;

public class NightSky {
    public double density;
    public int width;
    public int height;

    public NightSky(double density) {
        this.density = density;
        width = 20;
        height = 10;
    }

    public NightSky(int width, int height) {
        this.width = width;
        this.height = height;
        density = 0.1;
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void printLine() {
        for (int i = 0; i < width; i++) {
            boolean val = new Random().nextInt((100/(int)(density*100)))==0;
            if (val) {
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
        }
    }

    public void print() {
        for (int i = 0; i < height; i++) {
            printLine();
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        NightSky NightSky = new NightSky(8, 4);
        NightSky.print();
    }
}
