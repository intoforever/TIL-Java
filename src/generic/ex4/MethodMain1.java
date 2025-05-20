package generic.ex4;

/**
 * 제네릭 타입과 제네릭 메서드는 다르다.
 * 제네릭 메서드 또한 제네릭 타입처럼 타입 추론을 할 수 있어서 호출 시점에 타입 인자를 매번 전달하지 않아도 된다.
 *
 * 1. 제네릭 타입
 * - 정의: GenericClass<T> (클래스나 인터페이스 이름 옆)
 * - 타입 인자 전달: 객체를 생성하는 시점
 *     - 예) new GenericClass<String>
 *
 * 2. 제네릭 메서드
 * - 정의: <T> T genericMethod(T t) (반환값 앞)
 * - 타입 인자 전달: 메서드를 호출하는 시점
 *     - 예) GenericMethod.<Integer>genericMethod(i)
 */
public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        // Object object = GenericMethod.objMethod(i);
        Integer object = (Integer) GenericMethod.objMethod(i);

        // 타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);

        System.out.println("타입 추론");
        Integer result2 = GenericMethod.genericMethod(i);
        Integer integerValue2 = GenericMethod.numberMethod(10);
        Double doubleValue2 = GenericMethod.numberMethod(20.0);
    }
}
