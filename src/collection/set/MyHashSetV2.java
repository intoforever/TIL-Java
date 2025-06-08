package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * 모든 타입을 저장할 수 있도록 Object를 사용
 */
public class MyHashSetV2 {
    static final int DEFAULT_INITIAL_CAPACITY = 16;
    private LinkedList<Object>[] buckets;
    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV2() {
        initBuckets();
    }

    public MyHashSetV2(int capacity) {
        this.capacity = capacity;
        initBuckets();

    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(Object value) {
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex]; // O(1)
        if (bucket.contains(value)) { // O(n) -> 사실상 데이터가 거의 1개 아니면 2개라서 평균적으로 O(1)
            return false;
        }

        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(Object searchValue) {
        int hashIndex = hashIndex(searchValue); // O(1)
        LinkedList<Object> bucket = buckets[hashIndex]; // O(1)
        return bucket.contains(searchValue); // O(n) -> 사실상 데이터가 거의 1개 아니면 2개라서 평균적으로 O(1)
    }

    public boolean remove(Object value) {
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex]; // O(1)
        boolean result = bucket.remove(value); // O(n) -> 사실상 데이터가 거의 1개 아니면 2개라서 평균적으로 O(1)
        if (result) {
            size--;
            return true;
        } else {
            return false;
        }
    }

    private int hashIndex(Object value) {
        // 음수가 나올 수 있어서 절대값으로 변경해줘야 함
        return Math.abs(value.hashCode()) % capacity;
    }

    public int getSize() {
        return size;
    }


    @Override
    public String toString() {
        return "MyHashSetV2{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
