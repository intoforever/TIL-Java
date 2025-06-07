package collection.set;

import collection.set.member.Member;

/**
 * 1. 자바가 기본으로 제공하는 클래스 대부분은 hashCode()를 재정의해두었다.
 * 2. 객체를 직접 만들어야 하는 경우에 equals()와 hashCode()를 모두 재정의하면 된다.
 * 3. hashCode()만 재정의하면 필요한 모든 종류의 객체를 해시 자료 구조에 보관할 수 있다.
 * => 해시 자료 구조에 데이터를 저장하는 경우 hashCode()를 구현해야 한다.
 */
public class JavaHashCodeMain {
    public static void main(String[] args) {
        // Object의 기본 hashCode는 객체의 참조값을 기반으로 생성
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1.hashCode() = " + obj1.hashCode());
        System.out.println("obj2.hashCode() = " + obj2.hashCode());
        // System.out.println("obj1 = " + obj1); // 16진수로 바꿔서 표현

        // java는 이미 각 클래스마다 hashCode를 이미 오버라이딩 해두었다.
        Integer i = 10;
        String strA = "A";
        String strAB = "AB";

        System.out.println("10.hashCode() = " + i.hashCode());
        System.out.println("'A'.hashCode() = " + strA.hashCode());
        System.out.println("'AB'.hashCode() = " + strAB.hashCode());

        // 또한 hashCode에는 마이너스 값이 들어올 수 있다.
        System.out.println("-1.hashCode() = " + Integer.valueOf(-1).hashCode());

        // 둘은 같을까 다를까?, 인스턴스는 다르지만, equals는 같다.
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

        // equals, hashCode를 오버라이딩 하지 않은 경우와, 한 경우를 비교
        System.out.println("(member1 == member2) = " + (member1 == member2));
        System.out.println("(member1 equals member2) = " + (member1.equals(member2)));
        System.out.println("member1.hashCode() = " + member1.hashCode());
        System.out.println("member2.hashCode() = " + member2.hashCode());

        // ※ 지현 테스트 (번외) Double형의 hashCode도 정수이겠지?
        Double d1 = 11.0782; // 음수 정수형태로 출력됨 (-1800196062)
        Double d2 = -1.0782; // 양수 정수형태로 출력됨 (458850587)
        System.out.println("d1.hashCode() = " + d1.hashCode());
        System.out.println("d2.hashCode() = " + d2.hashCode());
    }
}

/**
 * ※ Object.hashCode()
 * 자바는 모든 객체가 자신만의 해시 코드를 표현할 수 있는 기능을 제공한다.
 * 바로 Object에 있는 hashCode() 메서드이다.
 *
 * ※ Object.hashCode()를 사용하지 않는 이유
 * 하지만, 이 메서드를 그대로 사용하기 보다는 보통 재정의(오버라이딩)해서 사용한다.
 * Object.hashCode() 메서드의 기본 구현은 객체의 참조값을 기반으로 해시 코드를 생성한다.
 * 쉽게 이야기해서 객체의 인스턴스가 다르면 해시 코드도 다르다.
 *
 * ※ 자바의 기본 클래스의 해시 코드
 * Integer, String 같은 자바의 기본 클래스들은 대부분 내부 값을 기반으로 해서 해시 코드를 구할 수 있도록 hashCode() 메서드를 재정의해두었다.
 * 따라서 데이터의 값이 같으면 같은 해시 코드를 반환한다.
 * 해시 코드의 경우 정수를 반환하기 때문에 마이너스 값이 나올 수 있다.
 */