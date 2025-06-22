package collection.compare.test;

/**
 * 문제와 풀이
 * 카드 게임을 만들어보자.
 */
public class CardGameMain {
    
    public static void main(String[] args) {
        // 코드 작성
        try {
            Deck cards = new Deck(); // 랜덤하게 섞음
            Player player1 = new Player(cards.getCard());
            Player player2 = new Player(cards.getCard());

            showWinner(player1, player2);
        } catch (NotEnoughCardsException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void showWinner(Player player1, Player player2) {
        System.out.print("플레이어1의 카드: ");
        player1.showCards();
        System.out.print("플레이어2의 카드: ");
        player2.showCards();

        int score1 = player1.getScore(), score2 = player2.getScore();
        int result = score1 == score2 ? 0 : (score1 > score2 ? 1 : 2);

        switch (result) {
            case 1:
                System.out.println("플레이어1 승리");
                break;
            case 2:
                System.out.println("플레이어2 승리");
                break;
            default:
                System.out.println("무승부");
                break;
        }
    }
}
