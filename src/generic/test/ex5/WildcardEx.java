package generic.test.ex5;

import generic.animal.Animal;

/**
 * 와일드카드는 제네릭 타입이나 제네릭 메서드를 선언하는게 아니다.
 * 이미 만들어진 제네릭 타입을 활용할 때 사용하는 것이다.
 */
public class WildcardEx {
    // 이것은 제네릭 메서드이다.
    // Box<Dog> dogBox를 전달한다. 타입 추론에 의해 타입 T가 Dog가 된다.
    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    // 이것은 제네릭 메서드가 아니다. 일반적인 메서드이다.
    // Box<Dog> dogBox를 전달한다. 와일드카드 ?는 모든 타입을 받을 수 있다.
    static void printWildcardV1(Box<?> box) { // 비제한 와일드카드
        System.out.println("? = " + box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    static void printWildcardV2(Box<? extends Animal> box) { // 상한 와일드카드
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    static Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }
}
