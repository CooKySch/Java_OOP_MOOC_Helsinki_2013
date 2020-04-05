import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
        this.starsInLastPrint = 0;
    }

    public NightSky(double density) {
        this(density, 20, 10);
    }

    public NightSky(int width, int height) {
        this(0.1, width, height);
    }

    public void printLine() {
        //create empty starline
        Random random = new Random();
        String starline = new String();
        //loop over the width using columns and use random to create new star if random < prob.
        for (int column = 0; column < this.width; column++) {
            if (random.nextDouble() < density) {
                starline += "*";
                starsInLastPrint++;
            } else {
                starline += " ";
            }
        }
        System.out.println(starline);
    }

    public void print() {
        starsInLastPrint = 0;
        for (int row = 0; row < this.height; row++) {
            printLine();
        }
    }

    public int starsInLastPrint() {
        return starsInLastPrint;
    }
}
