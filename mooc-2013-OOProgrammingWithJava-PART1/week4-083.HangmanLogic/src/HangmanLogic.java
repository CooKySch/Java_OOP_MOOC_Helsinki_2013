
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // program here the functionality for making a guess
        // if the letter has already been guessed, nothing happens
        if (!guessedLetters.contains(letter)) {
            // it the word does not contains the guessed letter, number of faults increase
            if (!this.word.contains(letter))  {
                numberOfFaults++;
            }
            // the letter is added among the already guessed letters
            guessedLetters += letter;
        }
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word
        // create the hidden word by iterating through this.word letter by letter
        int length = this.word.length();
        int i = 0;
        String toGuess = "";
        char letter;
        while (i < length) {
            letter = this.word.charAt(i);
            // if the letter in turn is within the guessed words, put it in to the hidden word
            if (guessedLetters.indexOf(letter) >= 0) {
                toGuess += this.word.charAt(i);
            } else {
                // if the letter is not among guessed, replace it with _ in the hidden word
                toGuess += "_";
            }
            i++;
        }
        // return the hidden word at the end
        return toGuess;
    }
}
