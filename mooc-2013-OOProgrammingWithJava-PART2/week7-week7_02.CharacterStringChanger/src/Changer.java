import java.util.ArrayList;

public class Changer {
    // The arraylist changers is used to contain multiple changes to the string given. These are used in the change
    // method which uses the changers using a for-loop.
    ArrayList<Change> changers = new ArrayList<Change>();

    public void addChange(Change change) {
        //just adds a change
        this.changers.add(change);
    }

    public String change(String text) {
        //create empty text to be returned. Changes will be appended with the text using the changes.
        String returnedText = text;
        for (Change change : changers) {
            returnedText = change.change(returnedText);
        }
        return returnedText;
    }
}
