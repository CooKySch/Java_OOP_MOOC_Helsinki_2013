package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {
    private File file;

    public WordInspection(File file) throws FileNotFoundException {
        try {
            this.file = file;
        } catch (Exception e) {
        }
    }

    public int wordCount() throws FileNotFoundException {
        Scanner reader = new Scanner(this.file, "UTF-8");
        int wordCount = 0;
        while (reader.hasNextLine()) {
            reader.nextLine();
            wordCount++;
        }
        return wordCount;
    }

    public List<String> wordsContainingZ() throws FileNotFoundException {
        Scanner reader = new Scanner(this.file, "UTF-8");
        List<String> wordsWithZ = new ArrayList<String>();
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            if (line.contains("z")) {
                wordsWithZ.add(line);
            }
        }
        return wordsWithZ;
    }

    public List<String> wordsEndingInL() throws FileNotFoundException {
        Scanner reader = new Scanner(this.file, "UTF-8");
        List<String> wordsEndinginL = new ArrayList<String>();
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            if (line.endsWith("l")) {
                wordsEndinginL.add(line);
            }
        }
        return wordsEndinginL;
    }

    public List<String> palindromes() throws FileNotFoundException {
        Scanner reader = new Scanner(this.file, "UTF-8");
        List<String> palindromes = new ArrayList<String>();
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            int start = 0;
            int end = line.length() - 1;
            while (start <= end) {
                if (line.charAt(start) == line.charAt(end)) {
                    start++;
                    end--;
                    if (start > end) {
                        palindromes.add(line);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return palindromes;
    }

    public List<String> wordsWhichContainAllVowels() throws FileNotFoundException {
        Scanner reader = new Scanner(this.file, "UTF-8");
        List<String> containsAllVowels = new ArrayList<String>();
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            if (line.contains("a")) {
                if (line.contains("e")) {
                    if (line.contains("i")) {
                        if (line.contains("o")) {
                            if (line.contains("u")) {
                                if (line.contains("y")) {
                                    if (line.contains("ä")) {
                                        if (line.contains("ö")) {
                                            containsAllVowels.add((line));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return containsAllVowels;
    }
}