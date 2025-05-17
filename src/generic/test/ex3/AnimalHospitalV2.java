package generic.test.ex3;

/**
 * 문제점1: 제네릭 타입은 코드 작성 시 Object가 제공하는 메서드만 호출할 수 있다.
 *
 * 코드 작성 시점에는 자바 컴파일러는 T에 어떤 값이 들어올지 예측할 수 없기 때문에,
 * T를 어떤 타입이든 받을 수 있는 모든 객체의 최종 부모인 Object 타입으로 가정한다.
 */
public class AnimalHospitalV2<T> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        // T의 타입을 메서드를 정의하는 시점에는 알 수 없다. Object의 기능만 사용
        animal.toString();
        animal.equals(null);

        // 컴파일 오류
        // System.out.println("동물 이름: " + animal.getName());
        // System.out.println("동물 크기: " + animal.getSize());
        // animal.sound();
    }

    public T bigger(T target) {
        // 컴파일 오류
        // return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }
}
