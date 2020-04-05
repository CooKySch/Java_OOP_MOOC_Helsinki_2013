import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> cards = new ArrayList<Card>();

    public Hand() {

    }

    public void add(Card card) {
        cards.add(card);
    }

    public void print() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public void sort() {
        Collections.sort(cards);
    }

    public int getValue() {
        int value = 0;
        for (Card card : cards) {
            value += card.getValue();
        }
        return value;
    }

    @Override
    public int compareTo(Hand hand) {
        return (this.getValue() - hand.getValue());
    }

    public void sortAgainstSuit() {
        Collections.sort(cards, new SortAgainstSuitAndValue());
    }
}
