package generic;

// Ctrl + Alt + n 눌러서 inline variable 만들기

/**
 * 다형성을 활용한 덕분에 코드의 중복을 제거하고, 기존 코드를 재사용할 수 있게 되었다.
 * 하지만 Object 타입이기 때문에 입력할 때 실수로 원하지 않는 타입이 들어갈 수 있는 타입 안전성 문제가 발생한다.
 * (항상 정확하게 원하는 타입을 받을 수 있다는 보장이 없기 때문에 위험한 다운 캐스팅을 시도하는 상황이 된다.)
 */
public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get(); // Object -> Integer 다운 캐스팅
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get(); // Object -> String 다운 캐스팅
        System.out.println("str = " + str);

        // 잘못된 타입의 인수 전달 시
        integerBox.set("문자100");
        Integer result = (Integer) integerBox.get(); // String -> Integer 캐스팅 예외 (ClassCastException)
        System.out.println("result = " + result);
    }
}
