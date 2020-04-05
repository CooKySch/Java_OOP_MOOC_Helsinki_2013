import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Statement: ");
            String input = this.reader.nextLine().toLowerCase().trim();
            if (input.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (input.equals("add")) {
                add();
            } else if (input.equals("translate")) {
                translate();
            }
            else {
                System.out.println("Unknown Statement");
            }
        }
    }

    public void add() {
        System.out.println("In Finnish:" );
        String word = this.reader.nextLine();
        System.out.println("Translation:");
        String translation = this.reader.nextLine();
        this.dictionary.add(word, translation);
    }

    public void translate() {
        System.out.println("Give a word:");
        String word = this.reader.nextLine();
        String translation = this.dictionary.translate(word);
        System.out.println("Translation: " + translation);
    }
}
