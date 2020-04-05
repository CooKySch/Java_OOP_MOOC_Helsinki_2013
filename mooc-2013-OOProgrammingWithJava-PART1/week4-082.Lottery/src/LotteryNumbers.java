import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        Random randomizer = new Random();
        int iterator = 0;
        int newNumber;
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        while (iterator < 7) {
            newNumber = randomizer.nextInt(39) + 1;
            while (containsNumber(newNumber)) {
                newNumber = randomizer.nextInt(39) + 1;
            }
            numbers.add(newNumber);
            iterator++;
        }

    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        if (numbers.contains(number)) {
            return true;
        }
        return false;
    }
}
