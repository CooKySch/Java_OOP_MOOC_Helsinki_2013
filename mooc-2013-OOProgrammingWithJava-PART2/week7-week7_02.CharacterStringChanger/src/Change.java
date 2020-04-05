public class Change {
    char fromCharacter;
    char toCharacter;

    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }

    public String change(String characterString) {
        String returnedString = "";
        for (int i = 0; i < characterString.length(); i++) {
            char manipulatedChar = characterString.charAt(i);
            if (manipulatedChar == this.fromCharacter) {
                returnedString += this.toCharacter;
            } else {
                returnedString += manipulatedChar;
            }
        }
        return returnedString;
    }
}
