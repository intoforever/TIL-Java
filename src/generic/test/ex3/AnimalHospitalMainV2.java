package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

/**
 * 문제점2: 동물 병원에 Integer, Object같은 동물과 전혀 관계없는 타입을 타입 인자로 전달할 수 있는 문제 발생
 */
public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Object> objectHospital = new AnimalHospitalV2<>();
    }
}
