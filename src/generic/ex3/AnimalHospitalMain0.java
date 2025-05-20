package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

/**
 * 현재 코드
 *
 * 1. 코드 재사용X: 개 병원과 고양이 병원은 중복이 많이 보인다.
 * 2. 코드 안전성O: 타입 안전성이 명확하게 지켜진다.
 */
public class AnimalHospitalMain0 {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        // 문제1: 개 병원에 고양이 전달
        // dogHospital.set(cat); // 다른 타입 입력: 컴파일 오류 (타입 세이프)

        // 문제2: 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
