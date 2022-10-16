
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {

    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print() {
        this.cards.stream().forEach(card -> {
            System.out.println(card);
        });
    }

    public void sort() {
        this.cards.stream().sorted((p1, p2) -> p1.compareTo(p2)).forEach(card -> {
            System.out.println(card);
        });
    }

    @Override
    public int compareTo(Hand hand) {

        int sumThis = this.cards.stream().map(card -> card.getValue()).reduce(0, (prevSum, value) -> prevSum + value);
        int sumHand = hand.cards.stream().map(card -> card.getValue()).reduce(0, (prevSum, value) -> prevSum + value);

        if (sumThis == sumHand) {
            return 0;
        } else if (sumThis > sumHand) {
            return 1;
        }
        return -1;
    }
    
    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());
    }
}
