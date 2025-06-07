package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * 해시 알고리즘을 사용한 덕분에 등록, 검색, 삭제 모두 평균 O(1)로 연산 속도를 크게 개선
 *
 * ※ 남은 문제
 * 해시 인덱스를 사용하려면 입력된 데이터의 값을 배열의 인덱스로 사용해야 한다.
 * 하지만 현재 로직상 입력 데이터의 값이 "A, B"같은 문자열인 경우 처리 불가
 */
public class MyHashSetV1 {
    static final int DEFAULT_INITIAL_CAPACITY = 16;
    LinkedList<Integer>[] buckets;
    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV1() {
        initBuckets();
    }

    public MyHashSetV1(int capacity) {
        this.capacity = capacity;
        initBuckets();

    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex]; // O(1)
        if (bucket.contains(value)) { // O(n) -> 사실상 데이터가 거의 1개 아니면 2개라서 평균적으로 O(1)
            return false;
        }

        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex]; // O(1)
        return bucket.contains(searchValue); // O(n) -> 사실상 데이터가 거의 1개 아니면 2개라서 평균적으로 O(1)
    }

    public boolean remove(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex]; // O(1)
        boolean result = bucket.remove(Integer.valueOf(value)); // O(n) -> 사실상 데이터가 거의 1개 아니면 2개라서 평균적으로 O(1)
        if (result) {
            size--;
            return true;
        } else {
            return false;
        }
    }

    private int hashIndex(int value) {
        return value % capacity;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV1{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
