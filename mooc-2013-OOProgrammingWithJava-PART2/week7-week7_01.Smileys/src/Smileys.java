
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following

         printWithSmileys("Method");
         printWithSmileys("Beerbottle");
         printWithSmileys("Interface");
    }

    private static void printWithSmileys(String characterString) {
        String usedString = characterString;
        // Use the string length to check if it is odd or even.
        if (usedString.length() % 2 == 1) {
            usedString = usedString + " ";
        }
        // Find string length and use it to create a string of smileys
        int amountOfSmileys = (usedString.length() + 6) / 2;
        String smileyRow = "";
        for (int i = 0; i < amountOfSmileys; i++) {
            smileyRow += ":)";
        }
        System.out.println(smileyRow);
        System.out.println(":) " + usedString + " :)");
        System.out.println(smileyRow);
    }

}
