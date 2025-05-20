package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

/**
 * 하한 와일드카드
 *
 * ※ 하한은 제네릭 타입, 제네릭 메서드에는 사용할 수 없고 와일드 카드에서만 사용 할 수 있다.
 */
public class WildcardMain2 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        // Animal 포함 상위 타입 전달 가능
        writeBox(objBox);
        writeBox(animalBox);
        // writeBox(dogBox); // 하한이 Animal
        // writeBox(catBox); // 하한이 Animal

        Animal animal = animalBox.get();
        System.out.println("animal = " + animal);
    }

    // ?가 Animal 타입을 포함한 Animal 타입의 상위 타입만 입력 받을 수 있다는 뜻
    static void writeBox(Box<? super Animal> box) { // 하한 와일드카드
        box.set(new Dog("멍멍이", 100));
    }
}