package collection.set.test;

import java.util.HashSet;
import java.util.Set;

/**
 * 문제와 풀이1
 * 문제1 - 중복 제거
 * - 여러 정수가 입력된다. 여기서 중복 값을 제거하고 값을 출력해라.
 * - 30, 20, 20, 10, 10이 출력되면 중복을 제거하고 출력하면 된다. 출력 순서는 상관없다.
 *     - 출력 예) 30, 20, 10 또는 10, 20, 30 또는 20, 10, 30등과 같이 출력 순서는 관계 없다.
 */
public class UniqueNamesTest1 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        // 코드 작성
        Set<Integer> set = new HashSet<>();
        for (Integer i : inputArr) {
            set.add(i);
        }

        for (Integer s : set) {
            System.out.println(s);
        }
    }
}
