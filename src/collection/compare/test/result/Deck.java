package collection.compare.test.result;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * List에서 데이터를 앞에서 부터 꺼내고 있다.
 * 지금처럼 데이터의 수가 작다면 ArrayList를 사용해도 괜찮지만,
 * 데이터의 수가 많다면 LinkedList를 고려하자.
 */
public class Deck {
    List<Card> cards = new ArrayList<>();

    public Deck() {
        initCard();
        shuffle();
    }

    private void initCard() {
        for (int i = 1; i <= 13; i++) {
            for (Suit value : Suit.values()) {
                cards.add(new Card(i, value));
            }
        }
    }

    private void shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        return cards.removeFirst(); // 자바21, cards.remove(0)
    }
}
