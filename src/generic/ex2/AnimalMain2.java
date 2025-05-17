package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain2 {
    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 50);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal); // 부모 타입
        animalBox.set(dog); // 자식 타입 Animal = Dog
        animalBox.set(cat); // 자식 타입 Animal = Cat

        Animal findAnimal = animalBox.get(); // 구체적인 타입으로 뽑고 싶다면 다운캐스팅 필요 (Cat)
        System.out.println("findAnimal = " + findAnimal); // 마지막에 넣은 동물이 고양이이기 때문에 고양이가 나옴
    }
}
