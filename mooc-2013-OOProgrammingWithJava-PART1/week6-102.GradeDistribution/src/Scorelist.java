import java.util.ArrayList;
import java.util.Scanner;

public class Scorelist {

    public void addScores(ArrayList<Integer> scoreList, Scanner scanner) {
        int score = Integer.parseInt(scanner.nextLine());
        while (score != -1) {
            if (score <= 60) {
                if (score >= 0) {
                    scoreList.add(score);
                }
            }
            score = Integer.parseInt(scanner.nextLine());
        }
        printScores(scoreList);
    }

    public void printScores(ArrayList<Integer> scores) {
        String zero = "";
        String one = "";
        String two = "";
        String three = "";
        String four = "";
        String five = "";
        for (Integer score : scores) {
            if (score >= 50) {
                five += "*";
            } else if (score >= 45) {
                four += "*";
            } else if (score >= 40) {
                three += "*";
            } else if (score >= 35) {
                two += "*";
            } else if (score >= 30) {
                one += "*";
            } else {
                zero += "*";
                }
        }
        System.out.println("Grade distribution:");
        System.out.println("5: " + five);
        System.out.println("4: " + four);
        System.out.println("3: " + three);
        System.out.println("2: " + two);
        System.out.println("1: " + one);
        System.out.println("0: " + zero);
        double acceptPercent = Double.valueOf(one.length() + two.length() + three.length() + four.length() + five.length()) * 100 / scores.size();
        System.out.println("Acceptance percentage: " + acceptPercent);
            }

}
