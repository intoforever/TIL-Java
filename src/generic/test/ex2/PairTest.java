package generic.test.ex2;

/**
 * 문제와 풀이1
 * 문제2 - 제네릭 기본2
 *
 * 다음 코드와 실행 결과를 참고해서 Pair 클래스를 만들어라.
 * Pair 클래스는 제네릭을 사용해야 한다.
 */
public class PairTest {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>();
        pair1.setFirst(1);
        pair1.setSecond("data");
        System.out.println(pair1.getFirst());
        System.out.println(pair1.getSecond());
        System.out.println("pair1 = " + pair1);

        Pair<String, String> pair2 = new Pair<>();
        pair2.setFirst("key");
        pair2.setSecond("value");
        System.out.println(pair2.getFirst());
        System.out.println(pair2.getSecond());
        System.out.println("pair2 = " + pair2);
    }
}
