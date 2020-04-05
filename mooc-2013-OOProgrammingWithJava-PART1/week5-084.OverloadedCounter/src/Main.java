import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        Counter test = new Counter(2, true);
        System.out.println("" + test.value());
        test.decrease();
        test.decrease();
        System.out.println("" + test.value());
        test.decrease();
        System.out.println("" + test.value());


    }
}
