import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> myDictionary = new HashMap<String, String>();

    public String translate(String word) {
        word = stringCleaner(word);
        if (myDictionary.containsKey(word)) {
            return myDictionary.get(word);
        }
        return null;
    }

    public void add(String word, String translation) {
        this.myDictionary.put(stringCleaner(word), stringCleaner(translation));
    }

    public int amountOfWords() {
        return this.myDictionary.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> translationList = new ArrayList<String>();
        for (String key : this.myDictionary.keySet()) {
            String keyString = key + " = " + this.myDictionary.get(key);
            translationList.add(keyString);
        }
        return translationList;
    }

    public String stringCleaner(String word) {
        if (word == null) {
            return "";
        }
        return word.toLowerCase().trim();
    }
}
