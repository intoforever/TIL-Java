package generic.test.ex3;

import generic.animal.Animal;

/**
 * 여기서 핵심은 <T extends Animal>이다.
 * 타입 매개변수 T를 Animal과 그 자식만 받을 수 있도록 제한을 두어 상한이 최대 Animal이 되는 것이다.
 * 이렇게 하면 타입 인자로 들어올 수 있는 값이 Animal과 그 자식으로 제한된다.
 *
 * 또한 코드 작성 시점에 사용할 수 있는 코드가 Animal내 정의된 코드까지 수용이 가능하다.
 * (Animal에 없고 Dog, Cat에만 정의된 메서드는 사용 불가)
 */
public class AnimalHospitalV3<T extends Animal> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
         System.out.println("동물 이름: " + animal.getName());
         System.out.println("동물 크기: " + animal.getSize());
         animal.sound();
    }

    public T bigger(T target) {
         return animal.getSize() > target.getSize() ? animal : target;
    }
}
