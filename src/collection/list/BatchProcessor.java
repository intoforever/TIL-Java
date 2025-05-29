package collection.list;

/**
 * ※ 의존관계 주입 (Dependency Injection)
 *   - 다형성과 추상화 활용의 선례
 *   - BatchProcessor 코드를 전혀 변경하지 않고 리스트 전략(알고리즘)을 MyArrayList에서 MyLinkedList로 변경할 수 있다.
 */
public class BatchProcessor {
    private final MyList<Integer> list;

    // 생성자 의존관계 주입
    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) { // O(n)
            list.add(0, i); // ArrayList: O(n) -> 최종 O(n*n) | LinkedList: O(1) -> 최종 O(n)
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
}