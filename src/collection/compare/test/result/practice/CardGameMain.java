package collection.compare.test.result.practice;

public class CardGameMain {

    public static void main(String[] args) {
        Deck deck = new Deck();
        Player player1 = new Player("플레이어1");
        Player player2 = new Player("플레이어2");

        for (int i = 0; i < 5; i++) {
            player1.drawCard(deck);
            player2.drawCard(deck);
        }

        player1.showCard();
        player2.showCard();

        Player winner = getWinner(player1, player2);
        if (winner != null) {
            System.out.println(winner + " 승리");
        } else {
            System.out.println("무승부");
        }
    }

    private static Player getWinner(Player player1, Player player2) {
        int score1 = player1.sumRank();
        int score2 = player2.sumRank();

        if (score1 > score2) {
            return player1;
        } else if (score1 == score2) {
            return null;
        } else {
            return player2;
        }
    }
}
