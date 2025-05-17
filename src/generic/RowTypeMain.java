package generic;

/**
 * 제네릭 타입을 사용할 때는 항상 <>을 사용해서 사용시점에 원하는 타입을 지정해야 한다. (권장)
 * 그런데 다음과 같이 <>을 지정하지 않을 수 있는데, 이런 것을 로 타입(row type), 또는 원시 타입이라 한다.
 * 원시 타입을 사용하면 내부의 타입 매개변수가 Object로 사용된다고 이해하면 된다.
 *
 * ※ 로 타입(row type) 지원 이유:
 * 제네릭이 없던 시절의 과거 코드와의 하위 호환이 필요했다.
 * 그래서 어쩔 수 없이 이런 로 타입을 지원한다.
 * 즉, 자바 호환성 문제가 아닌 이상 로 타입을 사용하지 않아야 한다.
 */
public class RowTypeMain {
    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox(); // 제네릭 정보를 안적으면 Object형이 된다.
        // GenericBox<Object> integerBox = new GenericBox<>(); // 권장
        integerBox.set(10);
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);
    }
}
