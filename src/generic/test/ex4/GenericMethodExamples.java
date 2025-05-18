package generic.test.ex4;

/**
 * 인스턴스 메서드, static 메서드
 * 제네릭 메서드는 인스턴스 메서드와 static 메서드에 모두 적용할 수 있다.
 *
 * ※ 참고
 * 제네릭 타입은 static 메서드에 타입 매개변수를 사용할 수 없다.
 * 제네릭 타입은 객체를 생성하는 시점에 타입이 정해진다.
 *
 * 그런데 static 메서드는 인스턴스 단위가 아니라 클래스 단위로 작동하기 때문에 제네릭 타입과는 무관하다.
 * 따라서 static 메서드에 제네릭을 도입하려면 제네릭 메서드를 사용해야 한다.
 */
public class GenericMethodExamples<T> { // 제네릭 타입
    static <V> V staticMethod2(V v) { return v; } // static 메서드에 제네릭 메서드 도입
    <Z> Z instanceMethod(Z z) { return z; } // 인스턴스 메서드에 제너릭 메서드 도입 가능

    // ※ static 메서드는 제네릭 타입의 타입 매개변수 사용 불가
    // (아래 메서드들은 제네릭 메서드가 아님!!!)
    T instanceMethod2(T t) { return t; } // 가능
    // static T staticMethod2(T t) {return t; } // 제네릭 타입의 T 사용 불가능, 제네릭을 사용하고 싶다면 제네릭 메서드로 만들어야 함
}
