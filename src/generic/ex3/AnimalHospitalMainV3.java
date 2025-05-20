package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

/**
 * 제네릭에 타입 매개변수 상한을 사용해서 타입 안전성을 지키면서 상위 타입의 원하는 기능까지 사용할 수 있었다.
 * 덕분에 코드 재사용과 타입 안전성이라는 두 마리 토끼를 동시에 잡을 수 있었다.
 *
 * 1. 타입 안전성 문제
 *     - 개 병원에 고양이를 전달하는 문제 차단
 *     - Animal 타입을 반환해서 다운 캐스팅 해야 하는 문제 해결
 *     - 실수로 고양이를 입력했는데, 개를 반환하는 상황의 캐스팅 예외 차단
 *
 * 2. 제네릭 도입 문제
 *     - 타입 매개변수가 모든 타입을 수용하는 것 차단
 *     - 컴파일 시점에 타입을 명확히 알 수 없어서 Object로 가정하는 바람에 Object 메서드만 사용했던 것 해결
 *       (여기서는 Animal을 상한으로 두어서 Animal의 기능 사용 가능)
 */
public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();
        // AnimalHospitalV3<Integer> integer = new AnimalHospitalV3<>();
        // AnimalHospitalV3<Object> object = new AnimalHospitalV3<>();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        // 문제1: 개 병원에 고양이 전달
         // dogHospital.set(cat); // 다른 타입 입력: 컴파일 오류

        // 문제2: 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
