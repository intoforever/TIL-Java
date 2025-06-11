package collection.set.test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * 문제와 풀이1
 * 문제2 - 중복 제거와 입력 순서 유지
 * - 여러 정수가 입력된다. 여기서 중복 값을 제거하고 값을 출력해라.
 * - 30, 20, 20, 10, 10이 출력되면 중복을 제거하고 출력되면 된다.
 * - 단 입력 순서대로 출력해라.
 *     - 출력 예) 30, 20, 10
 */
public class UniqueNamesTest2 {
    public static void main(String[] args) {
        Integer[] inputArray = {30, 20, 20, 10, 10};

        // 코드 작성
        Set<Integer> set = new LinkedHashSet<>(List.of(inputArray));

        for (Integer s : set) {
            System.out.println(s);
        }
    }
}
