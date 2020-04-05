
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    public void save(String file, String text) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(text);
        fileWriter.close();
    }

    public void save(String file, List<String> texts) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        for (String text : texts) {
            fileWriter.write(text + "\n");
        }
        fileWriter.close();
    }

    public List<String> read(String file) throws FileNotFoundException{
        List<String> contents = new ArrayList<String>();
        try {
            File file1 = new File(file);
            Scanner reader = new Scanner(file1);
            while (reader.hasNextLine()) {
                contents.add(reader.nextLine());
            }
        } catch (Exception e) {
            throw new FileNotFoundException("File was not found.");
        }
        return contents;
    }
}
