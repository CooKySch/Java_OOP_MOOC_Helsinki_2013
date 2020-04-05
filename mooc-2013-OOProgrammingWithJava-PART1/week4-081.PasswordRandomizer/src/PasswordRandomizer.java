import java.util.Random;

public class PasswordRandomizer {
    private int length;
    Random random = new Random();

    public PasswordRandomizer(int length) {
        this.length = length;
        Random random = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password

        int i = 0;
        int j = 0;
        String newPassword = "";
        while (i < this.length) {
            j = random.nextInt(26);
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(j);
            //build up new password
            newPassword += symbol;
            i++;
        }
        return newPassword;
    }
}
