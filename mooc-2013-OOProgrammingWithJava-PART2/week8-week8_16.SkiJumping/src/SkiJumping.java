import java.util.*;

public class SkiJumping {
    private Scanner reader;
    private ArrayList<Jumper> jumpers = new ArrayList<Jumper>();
    private Random random = new Random();

    public SkiJumping(Scanner reader) {
        this.reader = reader;
    }

    public void start() {
        System.out.println("Kumpula ski jumping week\n");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        addNames();
        System.out.println("The tournament begins!\n");
        jumping();
        System.out.println("\nThanks!\n");
        printFinalScores();
    }

    public void addNames() {
        while (true) {
            System.out.print("  Participant name: ");
            String name = this.reader.nextLine();
            if (name.isEmpty()) {
                System.out.println("");
                break;
            } else {
                this.jumpers.add(new Jumper(name));
            }
        }
    }

    public void jumping() {
        int roundNumber = 1;
        while (true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String command = this.reader.nextLine();
            if (!command.equals("jump")) {
                determineOrder();
                break;
            } else {
                System.out.println("");
                System.out.println("Round " + roundNumber + "\n");
                determineOrder();
                System.out.println("");

                int length = 0;
                ArrayList<Integer> votes;
                System.out.println("Results of round " + roundNumber);
                for (Jumper jumper : jumpers) {
                    length = length();
                    jumper.addLength(length);
                    votes = votes();
                    jumper.setScore(jumper.getScore() + length + votes.get(1) + votes.get(2) + votes.get(3));
                    printScores(jumper, length, votes);
                }
                roundNumber++;
            }
        }
    }

    private void printScores(Jumper jumper, int length, ArrayList<Integer> votes) {
        System.out.println("  " + jumper.getName());
        System.out.println("    length: " + length);
        System.out.println("    judge votes: " + votes);;
    }

    private void printFinalScores() {
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        for (int i = jumpers.size() - 1; i >= 0; i--) {
            System.out.println(jumpers.size()-i + "           " + jumpers.get(i));
            System.out.println("            jump lengths: " + printLenghts(jumpers.get(i)));
        }
    }

    private String printLenghts(Jumper jumper) {
        String output = "";
        for (int lengthIndex = 0; lengthIndex < jumper.getLengths().size(); lengthIndex++) {
            if (lengthIndex == jumper.getLengths().size() -1) {
                output += jumper.getLengths().get(lengthIndex) + " m";
            } else {
                output += jumper.getLengths().get(lengthIndex) + " m, ";
            }
        }
        return output;
    }

    public void determineOrder() {
        Collections.sort(jumpers);
        System.out.println("Jumping order:");
        for (int i = 0; i<jumpers.size(); i++) {
            System.out.println("  " + (i+1) + ". " + jumpers.get(i));
        }
    }

    public int length() {
        int length = this.random.nextInt(60) + 60;
        return length;
    }

    public ArrayList<Integer> votes() {
        ArrayList<Integer> votes = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            votes.add(this.random.nextInt(10) + 10);
            Collections.sort(votes);
        }
        return votes;
    }
}
