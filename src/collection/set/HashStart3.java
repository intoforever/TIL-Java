package collection.set;

import java.util.Arrays;

/**
 * 데이터의 값을 인덱스로 사용하는 방법은 매우 빠른 성능을 보장하지만,
 * 입력 값의 범위가 조금만 커져도 메모리 낭비가 너무 심하다.
 */
public class HashStart3 {
    public static void main(String[] args) {
        // 입력: {1, 2, 5, 8, 14, 99}
        // [null, 1, 2, null, null, 5, null, null, 8, ..., 14, ..., 99]
        Integer[] inputArray = new Integer[100];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        inputArray[14] = 14;
        inputArray[99] = 99;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 99;
        Integer result = inputArray[searchValue]; // O(1)
        System.out.println(result);
    }
}
