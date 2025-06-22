package collection.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 빈 가변 리스트는 원하는 컬렉션의 구현체를 직접 생성하면 된다.
 * 빈 불변 리스트는 2가지 생성 방법이 있다.
 *  - Collections.emptyList(): 자바5부터 제공되는 기능이다.
 *  - List.of(): 자바9부터 제공되는 최신 기능이다.
 *               더 간결하고 List.of(1, 2, 3)도 불변이기 때문에 사용법에 일관성이 있다.
 *               자바9 이상을 사용한다면 이 기능을 권장한다.
 */
public class EmptyListMain {

    public static void main(String[] args) {
        // 빈 가변 리스트 생성
        List<Object> list1 = new ArrayList<>();
        List<Object> list2 = new ArrayList<>();

        // 빈 불변 리스트 생성
        List<Object> list3 = Collections.emptyList(); // 자바5
        List<Object> list4 = List.of(); // 자바9 (권장)

        System.out.println("list3 = " + list3.getClass());
        System.out.println("list4 = " + list4.getClass());

        List<Integer> list5 = Arrays.asList(1, 2, 3);
        List<Integer> list6 = List.of(1, 2, 3);

        Integer[] arr = {1, 2, 3, 4, 5};
        List<Integer> arrList = Arrays.asList(arr); // 받은 배열의 참조를 그대로 사용함 (엄청나게 큰 배열을 사용하는 경우에만 재생성 하지 않으니 생성비용이 줄어들 수 있음)
        arrList.set(0, 100);
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("arrList = " + arrList);
    }
}

/**
 * Arrays.asList()
 * 자바 1.2부터 존재했던 메서드로, 리스트를 생성할 수 있다.
 * (자바9를 사용한다면 List.of()를 권장한다.)
 *
 * Arrays.asList()로 생성된 리스트는 고정된 크기를 가지지만, 요소들은 변경할 수 있다.
 * 고정도 가변도 아닌 애매한 리스트이다.
 *  - set()을 통해 요소를 변경할 수 있다.
 *  - add(), remove() 같은 메서드를 호출하면 예외가 발생한다. 크기를 변경할 수 없다.
 *      - java.lang.UnsupportedOperationException 발생
 *
 * 일반적으로 List.of()를 사용하는 것을 권장한다. 다음과 같은 경우 Arrays.asList()를 선택할 수 있다.
 * - 변경 가능한 요소: 리스트 내부의 요소를 변경해야 하는 경우 (단, 리스트의 크기는 변경할 수 없음)
 * - 하위 호환성: Java 9 이전 버전에서 작업해야 하는 경우
 */