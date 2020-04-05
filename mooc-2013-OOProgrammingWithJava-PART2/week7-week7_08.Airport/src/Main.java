import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        //String input = "1 \n ha-lol \n 42 \n 1 \n G-OWAC \n 101 \n 2 \n ha-lol \n Hel \n Bal \n G-owac \n JFK \n Bal \n 2 \n Ha-lol \n bal \n hel \n X \n 1 \n 2 \n 3 \n ha-lol \n x \n";
        Scanner reader = new Scanner(System.in);
        //only for testing purposes, else use the above line.

        Airport airport = new Airport(reader);

        airport.start();
        airport.flightService();

    }
}
