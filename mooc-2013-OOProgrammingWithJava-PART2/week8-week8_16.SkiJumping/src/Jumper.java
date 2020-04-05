import java.util.ArrayList;

public class Jumper implements Comparable<Jumper>{
    private String name;
    private int score;
    private ArrayList<Integer> lengths = new ArrayList<Integer>();

    public Jumper(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void addLength(int length) {
        this.lengths.add(length);
    }

    public ArrayList<Integer> getLengths() {
        return this.lengths;
    }

    @Override
    public int compareTo(Jumper jumper) {
        return this.getScore() - jumper.getScore();
    }

    public void setScore(int currentScore) {
        this.score = currentScore;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.score + " points)";
    }
}
