package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * MyHashSetV2는 Object를 받을 수 있다.
 * 따라서 직접 만든 Member와 같은 객체도 보관할 수 있다.
 *
 * ※ 여기서 주의할 점은 직접 만든 객체가 hashCode(), equals() 두 메서드를 반드시 구현해야 한다는 점이다.
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
        // !!주의!! 음수가 나올 수 있어서 절대값으로 변경해줘야 함
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
