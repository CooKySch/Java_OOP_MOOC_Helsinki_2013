import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write test code here
        //stats.addNumber(3);
        //stats.addNumber(5);
        //stats.addNumber(1);
        //stats.addNumber(2);
        //System.out.println("Amount: " + stats.amountOfNumbers());
        //System.out.println("sum: " + stats.sum());
        //System.out.println("average: " + stats.average());

        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.
        NumberStatistics allStats = new NumberStatistics();
        NumberStatistics evenStats = new NumberStatistics();
        NumberStatistics oddStats = new NumberStatistics();
        System.out.print("Type numbers: ");
        int currentValue = 0;
        while (true) {
            currentValue = Integer.parseInt(reader.nextLine());
            if (currentValue == -1) {
                break;
            }
            if (currentValue % 2 == 0) {
                evenStats.addNumber(currentValue);
            } else {
                oddStats.addNumber(currentValue);
            }
            allStats.addNumber(currentValue);
        }
        System.out.print("sum: " + allStats.sum());
        System.out.print("sum of even: " + evenStats.sum());
        System.out.print("sum of odd: " + oddStats.sum());
        // The tests does not work if you do not create the objects in the correct order

    }
}
