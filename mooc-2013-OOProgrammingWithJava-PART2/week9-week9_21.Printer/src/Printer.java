import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Printer {
    private Scanner reader;
    private File file;

    public Printer(String filename) throws Exception{
        this.file = new File(filename);
        this.reader = new Scanner(file);
    }

    public void printLinesWhichContain(String word) throws Exception {
        this.reader = new Scanner(this.file);
        if (!word.isEmpty()) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                if (line.contains(word)) {
                    System.out.println(line);
                }
            }
        } else {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
        }
    }

}
