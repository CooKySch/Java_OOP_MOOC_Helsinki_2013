
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileManager t = new FileManager();

        for (String line : t.read("src/testinput1.txt")) {
            System.out.println(line);
        }

        ArrayList<String> test = new ArrayList<String>();
        test.add("One");
        test.add("Two");
        test.add("Three");

        t.save("src/test.txt", test);
        for (String line : t.read("src/text.txt")) {
            System.out.println(line);
        }
    }


}
