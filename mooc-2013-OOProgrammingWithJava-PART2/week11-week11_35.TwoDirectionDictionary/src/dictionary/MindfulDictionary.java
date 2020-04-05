package dictionary;

import java.io.*;
import java.util.*;

public class MindfulDictionary {
    private Map<String, String> englishFinnish = new HashMap<String, String>();
    private Map<String, String> finnishEnglish = new HashMap<String, String>();
    private File file;

    public MindfulDictionary() {

    }

    public void add(String word, String translation) {
        if (!englishFinnish.containsKey(word)) {
            englishFinnish.put(word, translation);
            finnishEnglish.put(translation, word);
        }
    }

    public String translate(String word) {
        if (englishFinnish.containsKey(word)) {
            return englishFinnish.get(word);
        } else if (finnishEnglish.containsKey(word)) {
            return finnishEnglish.get(word);
        } else {
            return null;
        }
    }

    public void remove(String word) {
        if (englishFinnish.containsKey(word)) {
            String toRemove = englishFinnish.get(word);
            englishFinnish.remove(word);
            finnishEnglish.remove(toRemove);
        } else {
            String toRemove = finnishEnglish.get(word);
            finnishEnglish.remove(word);
            englishFinnish.remove(toRemove);
        }
    }

    public MindfulDictionary(String file) {
        this.file = new File(file);
    }

    public boolean load() {
        try {
            Scanner scanner = new Scanner(this.file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(":");
                this.add(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean save() {
        try {
            FileWriter writer = new FileWriter(this.file);
            for (String key : englishFinnish.keySet()) {
                writer.write(key + ":" + englishFinnish.get(key) + "\n");
            }
            writer.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
