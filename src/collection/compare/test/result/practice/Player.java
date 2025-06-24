package collection.compare.test.result.practice;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> hands;

    public Player(String name) {
        this.name = name;
        this.hands = new ArrayList<>();
    }

    public void drawCard(Deck deck) {
        hands.add(deck.drawCard());
    }

    public int sumRank() {
        int score = 0;
        for (Card card : hands) {
            score += card.getRank();
        }
        return score;
    }

    public void showCard() {
        hands.sort(null); // ★★★ 키포인트: 정렬 메소드를 호출했어야지!!! ★★★
        System.out.println(name + "의 카드: " + hands + ", 합계: " + sumRank());
    }

    public String getName() {
        return name;
    }
}
