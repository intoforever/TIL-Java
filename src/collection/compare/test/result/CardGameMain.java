package collection.compare.test.result;

public class CardGameMain {

    public static void main(String[] args) {
        Deck deck = new Deck();
        Player player1 = new Player("플레이어1");
        Player player2 = new Player("플레이어2");

        for (int i = 0; i < 5; i++) {
            player1.drawCard(deck);
            player2.drawCard(deck);
        }

        player1.showHand();
        player2.showHand();

        /**
         * 변수를 선언해놓고 if~else로 조건처리 하면서 결과를 받는게 아니라 바로 값을 받자
         * => 메소드로 리팩토링
         */
        Player winner = getWinner(player1, player2);

        if (winner != null) {
            System.out.println(winner.getName() + " 승리");
        } else {
            System.out.println("무승부");
        }
    }

    // 변수 따로 선언할 필요 없이 바로 return
    private static Player getWinner(Player player1, Player player2) {
        int sum1 = player1.rankSum();
        int sum2 = player2.rankSum();

        if (sum1 > sum2) {
            return player1;
        } else if (sum1 == sum2) {
            return null;
        } else {
            return player2;
        }
    }
}
