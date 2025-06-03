package collection.set;

import java.util.Arrays;

/**
 * 셋은 유일한 요소들의 컬렉션이다.
 *   - 유일성: 중복된 요소가 존재하지 않는다.
 *           (셋에 요소를 추가할 때, 이미 존재하는 요소면 무시된다.)
 *   - 순서 미보장: 대부분의 셋 구현에서는 요소들의 순서를 보장하지 않아서 출력할 때 입력 순서와 다를 수 있다.
 *   - 빠른 검색: 요소의 유무를 빠르게 확인할 수 있다.
 */
public class MyHashSetV0 {
    private int[] elementData = new int[10];
    private int size = 0;

    // O(n)
    public boolean add(int value) {
        if (contains(value)) {
            return false;
        }
        elementData[size] = value;
        size++;
        return true;
    }

    // O(n)
    public boolean contains(int value) {
        for (int data : elementData) {
            if (data == value) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "elementData=" + Arrays.toString(Arrays.copyOf(elementData, size)) + // 전체 배열이 아니라 데이터가 있는 것 까지만 나오게
                ", size=" + size +
                '}';
    }
}
