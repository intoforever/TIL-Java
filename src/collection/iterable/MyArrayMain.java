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
    }
}
