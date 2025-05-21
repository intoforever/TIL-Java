package collection.array;

import java.util.Arrays;

/**
 * 배열의 index를 사용하면 O(1)의 실행결과를 얻을 수 있다.
 * 배열의 시작 참조(x100) + (자료의 크기(4byte) * 인덱스 위치(i))
 */
public class ArrayMain1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("==index 입력: O(1)==");
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));

        System.out.println("==index 변경: O(1)==");
        arr[2] = 10;
        System.out.println(Arrays.toString(arr));

        System.out.println("==index 조회: O(1)==");
        System.out.println("arr[2] = " + arr[2]);

        System.out.println("==배열 검색: O(n)==");
        System.out.println(Arrays.toString(arr));
        int value = 10;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]" + arr[i]);
            if (arr[i] == value) {
                System.out.println(value + "찾음");
                break;
            }
        }
    }
}
