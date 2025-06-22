package collection.compare.test;

import java.util.*;

/**
 * "\u2660": 스페이드(♠)
 * "\u2665": 하트(♥)
 * "\u2666": 다이아몬드(♦)
 * "\u2663": 클로버(♣)
 */
public class Deck {
    private String[] patterns = {"\u2660", "\u2665", "\u2666", "\u2663"};
    private int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    private List<String> cards;
    private int holdLength = 5;

    public Deck() {
        cards = new ArrayList<>();
        initCards();
        Collections.shuffle(cards);
    }

    private void initCards() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < patterns.length; j++) {
                sb.append(numbers[i]);
                sb.append("(");
                sb.append(patterns[j]);
                sb.append(")");
                cards.add(sb.toString());
                sb.setLength(0);
            }
        }
    }

    public List<String> getCard() {
        List<String> gameCards = new ArrayList<>();
        if (cards.size() < holdLength) {
            throw new NotEnoughCardsException("뽑을 카드가 부족합니다.");
        }
        for (int i = 0; i < holdLength; i++) {
            gameCards.add(cards.get(cards.size() - 1));
            cards.remove(cards.size() - 1);
        }
        return gameCards;
    }
}
