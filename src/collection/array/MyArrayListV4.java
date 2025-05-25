package collection.array;

import java.util.Arrays;

/**
 * 보통 배열을 사용한 리스트라고 해서 ArrayList라고 부른다.
 */
public class MyArrayListV4<E> {
    private static final int DEFAULT_CAPACITY = 5; // 기본 배열의 크기
    private Object[] elementData; // 다양한 타입의 데이터를 보관하기 위해 Object 배열 사용
    private int size = 0; // 입력된 데이터 갯수

    // 기본 배열 크기로 생성
    public MyArrayListV4() {
        elementData = new Object[DEFAULT_CAPACITY]; // ★타입 이레이저 때문에 new E 할 수 없음, 따라서 Object를 유지★
    }

    // 원하는 크기로 생성
    public MyArrayListV4(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    // 리스트의 크기
    public int size() {
        return size;
    }

    // 리스트에 데이터 추가
    public void add(E e) {
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = e;
        size++;
    }

    // 코드 추가
    public void add(int index, E e) {
        if (size == elementData.length) {
            grow();
        }
        // 데이터 이동
        shiftRightFrom(index);
        elementData[index] = e;
        size++;
    }

    // 코드 추가, 요소의 마지막부터 index까지 오른쪽으로 밀기
    private void shiftRightFrom(int index) {
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
    }

    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    // 인덱스에 있는 항목 조회
    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E) elementData[index]; // 항상 E타입만 add될 거라서 E로 다운캐스팅 해도 문제 없음
    }

    // 인덱스에 있는 항목 변경
    public E set(int index, E element) {
        E oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    // 코드 추가
    public E remove(int index) {
        E oldValue = get(index);
        // 데이터 이동
        shiftLeftFrom(index);

        size--;
        elementData[size] = null;
        return oldValue;
    }

    // 코드 추가, 요소의 index부터 마지막까지 왼쪽으로 밀기
    private void shiftLeftFrom(int index) {
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
    }

    // 리스트를 순차 탐색하여 인수와 같은 데이터가 있는 인덱스 위치 반환
    public int indexOf(E o) {
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
