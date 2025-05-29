package collection.list;

/**
 * 구체적인 MyArrayList에 의존하는 BatchProcessor 예시
 */
public class BatchProcessor {
    private final MyArrayList<Integer> list = new MyArrayList<>();

    public void logic(int size) {
        for (int i = 0; i < size; i++) {
            list.add(0, i); // 앞에 추가
        }
    }
}