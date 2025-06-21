package collection.compare;

import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet과 같은 이진 탐색 트리 구조는 데이터를 보관할 때, 데이터를 정렬하면서 보관한다.
 * 따라서 정렬 기준을 제공하는 것이 필수다.
 *
 * 이진 탐색 트리는 데이터를 저장할 때 왼쪽 노드에 저장해야 할 지, 오른쪽 노드에 저장해야 할 지 비교가 필요한다.
 * 따라서 TreeSet, TreeMap은 Comparable 또는 Comparator가 필수이다.
 */
public class SortMain5 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        Set<MyUser> treeSet1 = new TreeSet<>(); // 기본정렬
        treeSet1.add(myUser1);
        treeSet1.add(myUser2);
        treeSet1.add(myUser3);
        System.out.println("Comparable 기본 정렬"); // 들어가는 순간에 이미 정렬이 됨
        System.out.println(treeSet1);

        Set<MyUser> treeSet2 = new TreeSet<>(new IdComparator()); // 비교자를 이용해서 정렬
        treeSet2.add(myUser1);
        treeSet2.add(myUser2);
        treeSet2.add(myUser3);
        System.out.println("IdComparator 정렬");
        System.out.println(treeSet2);
    }
}

/**
 * 자바의 정렬 알고리즘은 매우 복잡하고, 또 거의 완성형에 가깝다.
 *
 * 자바는 개발자가 복잡한 정렬 알고리즘은 신경 쓰지 않으면서 정렬의 기준만 간단히 변경할 수 있도록,
 * 정렬의 기준을 Comparable, Comparator 인터페이스를 통해 추상화해 두었다.
 *
 * 객체의 정렬이 필요한 경우 객체 내부에 Comparable을 통해 기본 자연 순서를 제공하자.
 * 자연 순서 외에 다른 정렬 기준이 추가로 필요하면 Comaparator를 제공하자.
 */