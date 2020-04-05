package dictionary;

import java.util.*;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
    private Map<String, Set<String>> entries = new HashMap<String, Set<String>>();

    public PersonalMultipleEntryDictionary() {

    }

    @Override
    public void add(String word, String entry) {
        if (entries.containsKey(word)) {
            entries.get(word).add(entry);
        } else {
            entries.put(word, new HashSet<String>());
            this.add(word, entry);
        }
    }

    public Set<String> translate(String word) {
        if (entries.containsKey(word)) {
            return entries.get(word);
        } else {
            return null;
        }
    }

    public void remove(String word) {
        if (entries.containsKey(word)) {
            entries.remove(word);
        }
    }
}
