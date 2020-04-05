package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Analysis {
    private File file;

    public Analysis(File file) throws FileNotFoundException {
        try {
            this.file = file;
        } catch (Exception e) {

        }
    }

    public int lines() throws FileNotFoundException {
        Scanner reader = new Scanner(this.file);
        int lines = 0;
        while (reader.hasNextLine()) {
            reader.nextLine();
            lines++;
        }
        return lines;
    }

    public int characters() throws  FileNotFoundException {
        Scanner reader = new Scanner(this.file);
        int characters = 0;
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            characters += line.length() + 1;
        }
        return characters;
    }
}
