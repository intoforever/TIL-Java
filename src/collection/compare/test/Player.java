package collection.compare.test;

import java.util.List;

public class Player {
    private final List<String> cards;
    private int score;

    public Player(List<String> cards) {
        this.cards = cards;
        for (String card : cards) {
            score += Integer.parseInt(card.substring(0, card.indexOf("(")));
        }
    }

    public void showCards() {
        System.out.print("[");
        for (int i = 0; i < cards.size(); i++) {
            System.out.print(cards.get(i));
            if (i != cards.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("], 합계: " + score);
    }

    public int getScore() {
        return score;
    }
}
