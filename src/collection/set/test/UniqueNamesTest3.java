package collection.set.test;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * 문제와 풀이1
 * 문제3 - 중복 제거와 데이터 순서 유지
 * - 여러 정수가 입력된다. 여기서 중복 값을 제거하고 값을 출력해라.
 * - 30, 20, 20, 10, 10이 출력되면 중복을 제거하고 출력하면 된다.
 * - 데이터의 값 순서로 출력해라.
 *     - 출력 예) 10, 20, 30
 */
public class UniqueNamesTest3 {
    public static void main(String[] args) {
        Integer[] inputArray = {30, 20, 20, 10, 10};

        // 코드 작성
        Set<Integer> set = new TreeSet<>(List.of(inputArray));
        for (Integer s : set) {
            System.out.println(s);
        }
    }
}
