package collection.array;

import java.util.Arrays;

/**
 * 보통 배열을 사용한 리스트라고 해서 ArrayList라고 부른다.
 */
public class MyArrayListV2 {
    private static final int DEFAULT_CAPACITY = 5; // 기본 배열의 크기
    private Object[] elementData; // 다양한 타입의 데이터를 보관하기 위해 Object 배열 사용
    private int size = 0; // 입력된 데이터 갯수

    // 기본 배열 크기로 생성
    public MyArrayListV2() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    // 원하는 크기로 생성
    public MyArrayListV2(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    // 리스트의 크기
    public int size() {
        return size;
    }

    // 리스트에 데이터 추가
    public void add(Object e) {
        // 코드 추가
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = e;
        size++;
    }

    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    // 인덱스에 있는 항목 조회
    public Object get(int index) {
        return elementData[index];
    }

    // 인덱스에 있는 항목 변경
    public Object set(int index, Object element) {
        Object oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    // 리스트를 순차 탐색하여 인수와 같은 데이터가 있는 인덱스 위치 반환
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    // size 만큼만 배열 출력
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size))
                + " size=" + size + ", capacity=" + elementData.length;
    }
}
