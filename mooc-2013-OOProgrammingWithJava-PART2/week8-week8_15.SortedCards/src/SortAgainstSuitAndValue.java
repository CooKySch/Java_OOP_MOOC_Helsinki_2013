import java.util.Comparator;

public class SortAgainstSuitAndValue implements Comparator<Card> {

    public int compare(Card card1, Card card2) {
        int suitorder = card1.getSuit()-card2.getSuit();
        if (suitorder == 0) {
            return card1.getValue() - card2.getValue();
        }
        else {
            return suitorder;
        }
    }

}
