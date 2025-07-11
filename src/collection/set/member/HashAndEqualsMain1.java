package collection.set.member;

import collection.set.MyHashSetV2;

/**
 * hashCode, equals를 구현하지 않아서
 * set에 중복 데이터가 들어가고 검색도 실패
 */
public class HashAndEqualsMain1 {
    public static void main(String[] args) {
        // 중복 등록
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberNoHashNoEq m1 = new MemberNoHashNoEq("A");
        MemberNoHashNoEq m2 = new MemberNoHashNoEq("A");
        System.out.println("m1.hashCode() = " + m1.hashCode()); // Object가 제공하는 hashCode 사용 -> 참조값으로 해시 코드 생성
        System.out.println("m2.hashCode() = " + m2.hashCode()); // Object가 제공하는 hashCode 사용 -> 참조값으로 해시 코드 생성
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        set.add(m1);
        set.add(m2);
        System.out.println(set);
        // MyHashSetV2{buckets=[[], [MemberNoHashNoEq{id='A'}], [], [], [], [], [], [MemberNoHashNoEq{id='A'}], [], []], size=2, capacity=10}

        // 검색 실패
        MemberNoHashNoEq searchValue = new MemberNoHashNoEq("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean result = set.contains(searchValue);
        System.out.println("result = " + result);
    }
}
