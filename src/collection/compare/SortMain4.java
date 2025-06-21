package collection.compare;

import java.util.LinkedList;
import java.util.List;

/**
 * Collections.sort(list)
 * 리스트는 순서가 있는 컬렉션이므로 정렬할 수 있다.
 * 이 메서드를 사용하면 기본 정렬이 적용된다.
 * 하지만 객체지향적 관점에서 객체 스스로 정렬 메서드를 가지고 있는 list.sort()를 사용하는 것이 더 권장한다.
 * (참고로 둘의 결과는 같다.)
 */
public class SortMain4 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        List<MyUser> list = new LinkedList<>(); // ArrayList를 사용해도 상관 없음
        list.add(myUser1);
        list.add(myUser2);
        list.add(myUser3);
        System.out.println("기본 데이터");
        System.out.println(list);

        System.out.println("Comparable 기본 정렬");
        list.sort(null); // Comparator를 넣어줄 수 있는데, 안넣으면 기본 Comparable 사용
        // Collections.sort(list);
        System.out.println(list);

        System.out.println("IdComparator 정렬");
        list.sort(new IdComparator());
        // Collections.sort(list, new IdComparator());
        System.out.println(list);
    }
}

/**
 * list.sort(null 또는 비교자 전달)
 * - 별도의 비교자가 없다면 null을 넣는다. 그럴 경우 Comparable을 사용해 자연적인 순서로 비교하고 정렬한다.
 * - 전달한 비교자가 있다면 그 비교자를 우선순위 기준으로 비교하여 정렬한다.
 * - 자바 1.8부터 사용
 *
 * Collections.sort(list, new IdComparator())
 * - 별도의 비교자로 비교하고 싶다면 다음 인자에 비교자를 넘기면 된다.
 * - 하지만 이 방식보다는 객체 스스로 정렬 메서드를 가지고 있는 list.sort() 사용을 더 권장한다.
 * (참고로 둘의 결과는 같다.)
 */