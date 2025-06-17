package collection.iterable;

import java.util.Iterator;

/**
 * 어떤 자료구조이든지 상관없이 일관성 있게 순회
 */
public class MyArrayMain {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(new int[]{1, 2, 3, 4});
        Iterator<Integer> iterator = myArray.iterator();
        System.out.println("iterator 사용");
        
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println("value = " + value);
        }

        // 추가
        System.out.println("for-each 사용");
        for (Integer value : myArray) {
            System.out.println("value = " + value);
        }
    }
}

/**
 * for-each문으로 불리는 향상된 for문은 자료 구조를 순회하는 것이 목적이다.
 * 자바는 Iterable 인터페이스를 구현한 객체에 대해서 향상된 for문을 사용할 수 있게 해준다.
 *
 * 자바는 아래의 for-each문을
 * for (int value : myArray) {
 *     System.out.println("value = " + value);
 * }
 *
 * 컴파일 시점에 다음과 같이 변경한다.
 * while (iterator.hasNext()) {
 *     Integer value = iterator.next();
 *     System.out.println("value = " + value);
 * }
 */