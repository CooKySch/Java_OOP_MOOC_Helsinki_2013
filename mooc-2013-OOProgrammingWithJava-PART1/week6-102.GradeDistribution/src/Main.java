import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        System.out.println("Type exam scores, -1 completes:");
        ArrayList<Integer> scores = new ArrayList<Integer>();
        Scorelist scorelist = new Scorelist();
        // Your program should use only one Scanner object, i.e., it is allowed to call
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        scorelist.addScores(scores, scanner);

    }



}
