import java.util.Random;

public class NightSky {
    public double density;
    public int width;
    public int height;
    public int starsInLastPrint;

    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
        this.starsInLastPrint = 0;
    }

    public NightSky(int width, int height) {
        this.width = width;
        this.height = height;
        this.density = 0.1;
        this.starsInLastPrint = 0;
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
        this.starsInLastPrint = 0;
    }

    public void printLine() {
        for (int i = 0; i < width; i++) {
            boolean val = new Random().nextDouble() <= this.density;
            if (val) {
                System.out.print("*");
                this.starsInLastPrint++;
            }
            else {
                System.out.print(" ");
            }
        }
    }

    public void print() {
        this.starsInLastPrint = 0;
        for (int i = 0; i < height; i++) {
            this.printLine();
            System.out.println("");
        }
    }

    public int starsInLastPrint() {
        return this.starsInLastPrint;
    }

    public static void main(String[] args) {
        NightSky NightSky = new NightSky(8, 4);
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
        System.out.println("");

        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
    }
}
