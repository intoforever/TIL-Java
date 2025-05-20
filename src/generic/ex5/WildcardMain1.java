package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

/**
 * 제네릭 메서드 vs 와일드 카드
 *
 * 1.
 * 와일드카드는 제네릭 메서드처럼 타입을 결정하거나 복잡하게 작동하지 않는다.
 * 단순히 일반 메서드에 제네릭 타입을 받을 수 있는 매개변수가 하나 있는 것 뿐이다.
 * 제네릭 타입이나 제네릭 메서드를 정의하는게 꼭 필요한 상황이 아니라면, 더 단순한 와일드카드 사용을 권장한다.
 *
 * 2.
 * 메서드의 타입을 특정 시점에 변경하려면 제네릭 타입이나, 제네릭 메서드를 사용해야 한다.
 * 와일드카드는 이미 만들어진 제네릭 타입을 받아서 활용할 때 사용한다.
 * 따라서 메서드의 타입들을 타입 인자를 통해 변경할 수 없다.
 *
 * 정리하면 제네릭 타입이나 제네릭 메서드가 꼭 필요한 상황이면 <T>를 사용하고,
 * 그렇지 않은 상황이면 와일드카드를 사용하는 것을 권장한다.
 */
public class WildcardMain1 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 100));

        WildcardEx.printGenericV1(dogBox);
        WildcardEx.printWildcardV1(dogBox);

        WildcardEx.printGenericV2(dogBox);
        WildcardEx.printWildcardV2(dogBox);

        Dog dog = WildcardEx.printAndReturnGeneric(dogBox);

        // 제네릭 메서드는 반환타입을 명확하게 반환할 수 있다. (Dog, Cat)
        catBox.set(new Cat("냐옹이", 200));
        Cat cat = WildcardEx.printAndReturnGeneric(catBox);

        // 와일드 카드는 이미 반환값이 정해진 일반 메서드에 제네릭 타입을 활용할 뿐이라서 전달한 타입을 명확하게 반환할 수 없다. (Animal)
        // 캐스팅이 필요하다.
        Animal animal = WildcardEx.printAndReturnWildcard(dogBox);
    }
}