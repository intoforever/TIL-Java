package collection.list;

/**
 * 추상적인 MyList에 의존하는 BatchProcessor 예시
 */
public class BatchProcessor {
    // private final MyArrayList<Integer> list = new MyArrayList<>();
    // private final MyLinkedList<Integer> list = new MyLinkedList<>(); // 코드 변경 필요

    private final MyList<Integer> list;

    public BatchProcessor(MyList<Integer> list) { // 생성 시점에 동적으로 변경 가능
        this.list = list;
    }

    public void logic(int size) {
        for (int i = 0; i < size; i++) {
            list.add(0, i); // 앞에 추가
        }
    }
}