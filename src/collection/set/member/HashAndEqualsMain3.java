package collection.set.member;

import collection.set.MyHashSetV2;

/**
 * hashCode, equals를 모두 구현해서
 * set에 중복 데이터도 방지하고 검색도 성공
 */
public class HashAndEqualsMain3 {
    public static void main(String[] args) {
        // 중복 등록 안됨
        MyHashSetV2 set = new MyHashSetV2(10);
        Member m1 = new Member("A");
        Member m2 = new Member("A");
        System.out.println("m1.hashCode() = " + m1.hashCode()); // Object가 제공하는 hashCode 사용 -> 참조값으로 해시 코드 생성
        System.out.println("m2.hashCode() = " + m2.hashCode()); // Object가 제공하는 hashCode 사용 -> 참조값으로 해시 코드 생성
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        set.add(m1);
        set.add(m2);
        System.out.println(set);
        // MyHashSetV2{buckets=[[], [], [], [], [], [], [Member{id='A'}], [], [], []], size=1, capacity=10}

        // 검색 성공
        Member searchValue = new Member("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean result = set.contains(searchValue);
        System.out.println("result = " + result);

        // 그럼에도 불구하고 해시 충돌하는 경우는 있다.
        System.out.println("Aa.hashCode() = " + "Aa".hashCode()); // 2112
        System.out.println("BB.hashCode() = " + "BB".hashCode()); // 2112
    }
}
