import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        Scanner scanner = new Scanner(System.in);
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        BirdDict myBirdDict = new BirdDict();
        String command = "";
        while (!command.toUpperCase().equals("QUIT")) {
            System.out.println("?");
            command = scanner.nextLine().toUpperCase();
            if (command.equals("ADD")) {
                myBirdDict.add(scanner);
            }
            if (command.equals("OBSERVATION")) {
                myBirdDict.observation(scanner);
            }
            if (command.equals("STATISTICS")) {
                myBirdDict.statistics();
            }
            if (command.equals("SHOW")) {
                System.out.println(myBirdDict.show(scanner));
            }
        }
            
    }

}
