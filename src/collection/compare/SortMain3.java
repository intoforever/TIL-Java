package collection.compare;

import java.util.Arrays;

/**
 * 객체의 기본 정렬 방법은 객체에 Comparable를 구현해서 정의한다.
 * 이렇게 하면 객체는 이름 그대로 비교할 수 있는 객체가 되고 기본 정렬 방법을 가진다.
 *
 * 그런데 기본 정렬 외에 다른 정렬 방법을 사용해야 하는 경우 비교자(Comparator)를 별도로 구현해서 정렬 메서드에 전달하면 된다.
 * 이 경우 전달한 Comparator가 항상 우선권을 가진다.
 *
 * 자바가 제공하는 Integer, String같은 기본 객체들은 대부분 Comparable을 구현해 두었다.
 */
public class SortMain3 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        MyUser[] array = {myUser1, myUser2, myUser3};
        System.out.println("기본 데이터");
        System.out.println(Arrays.toString(array));

        System.out.println("Comparable 기본 정렬");
        Arrays.sort(array); // 정렬할 때 기준을으로 compareTo를 사용함
        System.out.println(Arrays.toString(array));

        // 추가
        /**
         * 아이디를 기준으로 정렬하고 싶다면 IdComparator를 넘겨준다.
         * 이렇게 비교자를 따로 전달하면 객체가 기본으로 가지고 있는 Comparable을 무시하고,
         * 별도로 전달한 비교자를 사용해서 정렬한다.
         */
        System.out.println("IdComparator 정렬");
        Arrays.sort(array, new IdComparator());
        System.out.println(Arrays.toString(array));

        Arrays.sort(array, new IdComparator().reversed());
        System.out.println(Arrays.toString(array));
    }
}

/**
 * Arrays.sort(array)
 * 기본 정렬을 시도한다. 이때는 객체가 스스로 가지고 있는 Comparable 인터페이스를 사용해서 비교한다.
 * MyUser가 구현한 대로 나이(age) 오름차순으로 정렬된 것을 확인할 수 있다.
 * MyUser의 자연적인 순서를 사용했다.
 *
 * ※ 주의
 * 만약 Comparable도 구현하지 않고, Comparator도 제공하지 않으면 ClassCastException 런타임 오류가 발생한다.
 *
 * Comparator가 없으니, 객체가 가지고 있는 기본 정렬을 사용해야 하고 이때 Comparable을 사용하는데,
 * Comparable을 찾는데 없으니, 예외가 발생하는 것
 *
 * java.lang.ClassCastException: class collection.compare.MyUser cannot be cast to class java.lang.Comparable
 */