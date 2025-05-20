package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 100);

        AnimalMethod.checkup(dog); // 타입 매개변수 추론 → 사실은 <Dog>checkup(dog)임
        AnimalMethod.checkup(cat); // 타입 매개변수 추론 → 사실은 <Cat>checkup(cat)임

        Dog targetDog = new Dog("큰 멍멍이", 200);
        Dog bigger = AnimalMethod.bigger(dog, targetDog); // 타입 매개변수 추론 → 사실은 <Dog>bigger(dog, targetDog)임
        System.out.println("bigger = " + bigger);
    }
}
