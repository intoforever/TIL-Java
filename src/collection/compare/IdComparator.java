package collection.compare;

import java.util.Comparator;

/**
 * Arrays.sort(array, Comparator)
 * 기본 정렬이 아니라 정렬 방식을 지정하고 싶다면 Arrays.sort의 인수로 비교자(Comparator)를 만들어서 넘겨주면 된다.
 * 이렇게 비교자를 따로 전달하면 객체가 기본으로 가지고 있는 Comparable을 무시하고,
 * 별도로 전달한 비교자를 사용해서 정렬한다.
 */
public class IdComparator implements Comparator<MyUser> {
    @Override
    public int compare(MyUser o1, MyUser o2) {
        // "a",compareTo("b") ==> String에서 문자의 compareTo를 이미 다 구현해놨음.
        return o1.getId().compareTo(o2.getId());
    }
}
