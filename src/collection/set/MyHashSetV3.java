package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * 제네릭을 이용해서 타입 안전성이 높은 자료구조로 업그레이드
 */
public class MyHashSetV3<E> implements MySet<E> {
    static final int DEFAULT_INITIAL_CAPACITY = 16;
    private LinkedList<E>[] buckets;
    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV3() {
        initBuckets();
    }

    public MyHashSetV3(int capacity) {
        this.capacity = capacity;
        initBuckets();

    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(E value) {
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket = buckets[hashIndex]; // O(1)
        if (bucket.contains(value)) { // O(n) -> 사실상 데이터가 거의 1개 아니면 2개라서 평균적으로 O(1)
            return false;
        }

        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(E searchValue) {
        int hashIndex = hashIndex(searchValue); // O(1)
        LinkedList<E> bucket = buckets[hashIndex]; // O(1)
        return bucket.contains(searchValue); // O(n) -> 사실상 데이터가 거의 1개 아니면 2개라서 평균적으로 O(1)
    }

    public boolean remove(E value) {
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket = buckets[hashIndex]; // O(1)
        boolean result = bucket.remove(value); // O(n) -> 사실상 데이터가 거의 1개 아니면 2개라서 평균적으로 O(1)
        if (result) {
            size--;
            return true;
        } else {
            return false;
        }
    }

    private int hashIndex(Object value) {
        // !!주의!! 음수가 나올 수 있어서 절대값으로 변경해줘야 함
        return Math.abs(value.hashCode()) % capacity;
    }

    public int getSize() {
        return size;
    }


    @Override
    public String toString() {
        return "MyHashSetV3{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
