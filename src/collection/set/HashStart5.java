package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * ※ 해시 인덱스 충돌 확률
 *   - 해시 충돌이 발생하면 데이터를 추가하거나 조회할 때, 연결 리스트 내부에서 O(n)의 추가 연산을 해야 하므로 성능이 떨어진다.
 *     따라서 해시 충돌은 가급적 발생하지 않도록 해야한다.
 *   - 배열의 크기를 크게 만들면 해시 충돌은 줄어서 성능은 좋아지지만, 많은 메모리가 낭비된다.
 *     반대로 배열의 크기를 너무 작게 만들면 해시가 자주 충돌해서 성능이 나빠진다.
 *     상황에 따라 다르겠지만 보통 75%를 적절한 크기로 보고 기준으로 잡는 것이 효과적이다.
 *
 * ※ LinkedList를 사용한 이유
 *   - 일단 해시 충돌날 확률은 거의 없다. (가끔 충돌)
 *   - ArrayList는 미리 기본 크기의 배열을 확보해야 하니까 가끔 충돌날 때만 추가하는 용도로 LinkedList를 사용했다.
 */
public class HashStart5 {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        // {1, 2, 5, 8, 14, 99, 9}
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];
        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }

        System.out.println("buckets = " + Arrays.toString(buckets));
        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);
        add(buckets, 9); // 해시 인덱스 충돌
        System.out.println("buckets = " + Arrays.toString(buckets));
        
        // 검색
        int searchValue = 9;
        boolean contains = contains(buckets, searchValue);
        System.out.println("buckets.contains(" + searchValue + ") = " + contains);
    }

    // 셋으로 구현할 것이기 때문에 중복제거
    private static void add(LinkedList<Integer>[] buckets, int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex]; // O(1)
        if (!bucket.contains(value)) { // O(n)
            bucket.add(value);
        }
    }
    
    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex]; // O(1)
        return bucket.contains(searchValue); // O(n)
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
