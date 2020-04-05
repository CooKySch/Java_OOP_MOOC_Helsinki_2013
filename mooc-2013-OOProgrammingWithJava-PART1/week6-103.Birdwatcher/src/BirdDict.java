import java.util.ArrayList;
import java.util.Scanner;

public class BirdDict {
    private ArrayList<Bird> birdDict = new ArrayList<Bird>();

    public BirdDict() {

    }

    public void add(Scanner scanner) {
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Latin Name: ");
        String latinName = scanner.nextLine();
        birdDict.add(new Bird(name, latinName, 0));
    }

    public Bird check(String search) {
        for (Bird bird: birdDict) {
            if (bird.toString().toUpperCase().contains(search.toUpperCase().trim())){
                return bird;
            }
        }
        return null;
    }

    public void observation(Scanner scanner) {
        System.out.println("What was observed:?");
        String name = scanner.nextLine();
        Bird observedBird = check(name);
        if (observedBird == null) {
            System.out.println("Is not a bird!");
        } else {
            observedBird.observed();
        }
    }

    public void statistics() {
        for (Bird bird : birdDict) {
            System.out.println(bird);
        }
    }

    public String show(Scanner scanner) {
        System.out.println("What?");
        String search = scanner.nextLine();
        Bird toShow = check(search);
        if (toShow != null) {
            return toShow.toString();
        }
        return "Is not a bird!";
    }
}
