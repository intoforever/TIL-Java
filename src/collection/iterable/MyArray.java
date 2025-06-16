package collection.iterable;

import java.util.Iterator;

/**
 * Iterator는 단독으로 사용할 수 없다.
 * Iterator를 통해 순회의 대상이 되는 자료 구조로 배열을 가지는 단순한 자료 구조를 만든다.
 *
 * Iterable 인터페이스를 구현한다.
 * 이 인터페이스는 이 자료 구조에 사용할 반복자(Iterator)를 반환하면 된다.
 * 앞서 만든 반복자인 MyArrayIterator를 반환한다.
 * 이때 MyArrayIterator는 생성자를 통해 MyArray의 내부 배열인 numbers를 참조한다.
 */
public class MyArray implements Iterable<Integer> {
    private int[] numbers;

    public MyArray(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyArrayIterator(numbers);
    }
}
