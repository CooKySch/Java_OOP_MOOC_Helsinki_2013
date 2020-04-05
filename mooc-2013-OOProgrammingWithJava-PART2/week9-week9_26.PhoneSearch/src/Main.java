import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Start your program here
        // ATTENTION: In your program, you can create only one instance of class Scanner!
        String testText = "1\nConnor\n06-13791879\n2\nConnor\nx";//1\nAngelique\n06-40470287\n3\n06-40470287\n3\n06-13791879\n4\nConnor\nCoenderstraat\nDelft\n4\nAngelique\nBoeijer\nVolendam\n5\nAngelique\n6\nConnor\n5\nConnor\nx";
        Scanner reader = new Scanner(System.in);
        PhoneSearch test = new PhoneSearch(reader);
        test.start();

    }
}
