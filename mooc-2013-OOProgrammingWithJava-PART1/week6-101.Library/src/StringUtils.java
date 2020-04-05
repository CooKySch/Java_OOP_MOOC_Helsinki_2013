public class StringUtils {

    public static boolean included(String word, String searched) {
        if (word == null) {
            return false;
        }
        if (searched == null) {
            return false;
        }
        if (word.toUpperCase().contains(searched.toUpperCase().trim())) {
            return true;
        }
        return false;
    }
}
