package collection.set.javaset;

import java.util.*;

public class JavaSetMain {
    public static void main(String[] args) {
        run(new HashSet<>()); // O(1) | 입력 순서 보장 X
        run(new LinkedHashSet<>()); // O(1) | 입력 순서 보장 O
        run(new TreeSet<>()); // O(log N) | 데이터 값을 기준으로 정렬
    }

    private static void run(Set<String> set) {
        System.out.println("set = " + set.getClass());
        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        // iterator()를 호출하면 컬렉션을 반복해서 출력할 수 있다.
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) { // 다음 데이터가 있는지 확인
            System.out.print(iterator.next() + " "); // 다음 데이터를 반환
        }
        System.out.println();
    }
}
