package collection.set;

/**
 * 세상의 어떤 객체든지 정수로 만든 해시 코드만 정의할 수 있다면 해시 인덱스를 사용할 수 있다.
 * 그렇다면 문자 뿐만 아니라 내가 직접 만든 Member, User와 같은 객체는 어떻게 해시 코드를 정의할 수 있을까? -> 자바의 hashCode() 메서드
 */
public class StringHashMain {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        // char
        char charA = 'A';
        char charB = 'B';
        System.out.println("charA = " + (int) charA);
        System.out.println("charB = " + (int) charB);

        // hashCode
        System.out.println("hashCode('A') = " + hashCode("A"));
        System.out.println("hashCode('B') = " + hashCode("B"));
        System.out.println("hashCode('AB') = " + hashCode("AB"));

        // hashIndex
        int hashCodeA = hashCode("A");
        int hashIndex = hashIndex(hashCodeA);
        System.out.println("hashIndex = " + hashIndex);

        System.out.println("hashIndex('A') = " + hashIndex(hashCode("A")));
        System.out.println("hashIndex('B') = " + hashIndex(hashCode("B")));
        System.out.println("hashIndex('AB') = " + hashIndex(hashCode("AB")));
    }

    static int hashCode(String str) {
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum = sum + (int) c;
        }
        return sum;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}

/**
 * ● 해시 함수(Hash Function) - 해시 코드를 생성하는 함수
 * 1. 임의의 길이의 데이터를 입력으로 받아, 고정된 길이의 해시값(해시 코드)을 출력하는 함수
 *   - 여기서 의미하는 고정된 길이는 저장 공간의 크기를 말한다.
 *     예를 들어서 int형 1, 100은 둘 다 4bytes를 차지하는 고정된 길이를 뜻한다.
 * 2. 같은 데이터를 입력하면 항상 같은 해시 코드가 출력된다.
 * 3. 다른 데이터를 입력해도 같은 해시 코드가 출력될 수 있다. 이것을 해시 충돌이라 한다.
 *
 * ● 해시 코드(Hash Code) - 데이터를 대표하는 값
 * 해시 코드는 데이터를 대표하는 값을 뜻한다. 보통 해시 함수를 통해 만들어진다.
 *   - 데이터 A의 해시 코드는 65
 *   - 데이터 B의 해시 코드는 66
 *   - 데이터 AB의 해시 코드는 131
 *
 * ● 해시 인덱스(Hash Index) - 해시 코드를 사용해서 데이터의 저장 위치를 결정하는 값
 * 해시 인덱스는 데이터의 저장 위치를 결정하는데, 주로 해시 코드를 사용해서 만든다.
 * 보통 해시 코드의 결과에 배열의 크기를 나누어 구한다.
 */