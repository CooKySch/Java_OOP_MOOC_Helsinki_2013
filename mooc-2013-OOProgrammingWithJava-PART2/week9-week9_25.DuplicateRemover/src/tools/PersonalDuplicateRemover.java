package tools;

import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {
    private Set<String> entries = new HashSet<String>();
    private int detectedDuplicates;

    public PersonalDuplicateRemover() {
        this.detectedDuplicates = 0;
    }

    public void add(String characterString) {
        if (entries.contains(characterString)) {
            this.detectedDuplicates++;
        } else {
            entries.add(characterString);
        }
    }

    public int getNumberOfDetectedDuplicates() {
        return detectedDuplicates;
    }

    public Set<String> getUniqueCharacterStrings() {
        return entries;
    }

    public void empty() {
        this.entries.clear();
        this.detectedDuplicates = 0;
    }
}
