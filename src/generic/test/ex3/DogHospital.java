package generic.test.ex3;

import generic.animal.Dog;

/**
 * 개 병원 클래스
 */
public class DogHospital {
    private Dog animal;

    public void set(Dog animal) {
        this.animal = animal;
    }

    // 개의 이름과 크기 출력 후 sound() 메서드 호출
    public void checkup() {
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    // 다른 개와 크기를 비교해 둘 중에 큰 개를 반환
    public Dog bigger(Dog target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
