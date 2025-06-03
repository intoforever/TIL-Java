package collection.set;

import java.util.Arrays;

/**
 * 데이터의 값을 인덱스 번호로 사용
 * 검색 시간복잡도를 O(n) -> O(1)로 개선
 *
 * ※ 문제
 * 입력값의 범위만큼 큰 배열을 사용해야 한다. (배열에 낭비되는 공간 발생)
 */
public class HashStart2 {
    public static void main(String[] args) {
        // 입력: 1, 2, 5, 8
        // [null, 1, 2, null, null, 5, null, null, 8, null]
        Integer[] inputArray = new Integer[10];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 8;
        Integer result = inputArray[searchValue]; // O(1)
        System.out.println("result = " + result);
    }
}
