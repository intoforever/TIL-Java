package generic;

/**
 * 제네릭 클래스는 생성하는 시점에 <> 사이에 원하는 타입을 지정한다.
 */
public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>(); // 생성 시점에 T의 타입 결정
        integerBox.set(10);
        // integerBox.set("문자100"); // Integer 타입만 허용, 컴파일 오류
        Integer integer = integerBox.get(); // Integer 타입 반환 (캐스팅 필요 X)
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);

        // 원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(10.5);
        Double doubleValue = doubleBox.get();
        System.out.println("doubleValue = " + doubleValue);
        
        // 타입 추론: 생성하는 제네릭 타입 생략 가능
        /**
         * ※ 타입 추론:
         * 변수를 선언할 때와 객체를 생성할 때 <Integer>가 두 번 나온다.
         * 자바는 왼쪽에 있는 변수를 선언할 때의 <Integer>를 보고 오른쪽에 있는 객체를 생성할 때 필요한 타입 정보를 얻을 수 있다.
         * 따라서 new GenerixBox<>()와 같이 타입 정보를 생략할 수 있다.
         * 이렇게 자바가 스스로 타입 정보를 추론해서 개발자가 타입 정보를 생략할 수 있는 것을 타입 추론이라 한다.
         */
        GenericBox<Integer> integerBox2 = new GenericBox<Integer>(); // 타입 직접 입력
        GenericBox<Integer> integerBox3 = new GenericBox<>(); // 타입 추론
    }
}