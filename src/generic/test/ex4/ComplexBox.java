package generic.test.ex4;

import generic.animal.Animal;

public class ComplexBox<T extends Animal> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    /**
     * 제네릭 타입과 제네릭 메서드의 타입 매개변수명이 동일할 때, 제네릭 메서드의 타입이 우선순위가 된다.
     *
     * ※ 제네릭 타입과 제네릭 메서드의 타입 매개변수는 별개!!!!!
     *
     * 제네릭 타입에서 T extends Animal로 상한을 걸었어도
     * 제네릭 메서드는 extends Animal을 하지 않았기 때문에 Object 단위가 되고 animal의 메소드를 사용할 수 없다.
     */
//    public <T> T printAndReturn(T t) {
//        System.out.println("animal.className: " + animal.getClass().getName());
//        System.out.println("t.className: " + t.getClass().getName());
//        // t.getName(); // 제네릭 타입과 별개로 제네릭 메서드의 상한이 Object이기 때문에 Animal의 메서드를 사용할 수 없다.
//        return t;
//    }

    // 프로그래밍에서 모호한 것은 좋지 않기 때문에 제네릭 타입과 제네릭 메서드의 타입 매개변수명이 겹친다면 다른 이름으로 변경하는 것이 좋다.
    public <Z> Z printAndReturn(Z z) {
        System.out.println("animal.className: " + animal.getClass().getName());
        System.out.println("z.className: " + z.getClass().getName());
        // t.getName(); // 제네릭 타입과 별개로 제네릭 메서드의 상한이 Object이기 때문에 Animal의 메서드를 사용할 수 없다.
        return z;
    }
}
