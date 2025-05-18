package generic.test.ex4;

/**
 * 제네릭 메서드는 클래스 전체가 아니라 특정 메서드 단위로 제네릭을 도입할 때 사용한다.
 * 제네릭 메서드를 정의할 때는 메서드의 반환 타입 왼쪽에 다이아몬드를 사용해서 <T>와 같이 타입 매개변수를 적어준다.
 * 제네릭 메서드는 메서드를 실체 호출하는 시점에 다이아몬드를 사용해서 <Integer>와 같이 타입을 정하고 호출한다.
 *
 * 제네릭 메서드의 핵심은 메서드를 호출하는 시점에 타입 인자를 전달해서 타입을 지정하는 것이다.
 * 따라서 타입을 지정하면서 메서드를 호출한다.
 */
public class GenericMethod { // 여기에 하면 제네릭 타입
    public static Object objMethod(Object obj) {
        System.out.println("Object print = " + obj);
        return obj;
    }

    public static <T> T genericMethod(T t) { // 여기에 하면 제네릭 메서드
        System.out.println("Generic print = " + t);
        return t;
    }

    /**
     * 타입 매개변수 제한
     *
     * 제네릭 메서드도 제네릭 타입과 마찬가지로 타입 매개변수를 제한할 수 있다.
     * 다음 코드는 타입 매개변수를 Number로 제한했다. 따라서 Number와 그 자식만 받을 수 있다.
     * 참고로 Integer, Double, Long과 같은 숫자 타입이 Number의 자식이다.
     */
    public static <T extends Number> T numberMethod(T t) {
        System.out.println("Bound print = " + t);
        return t;
    }
}
