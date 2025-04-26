package nested.inner.ex2;

/*
* 중첩 클래스를 사용하는 이유
* 1. 논리적 그룹화:
* 특정 클래스가 다른 하나의 클래스 안에서만 사용되는 경우, 해당 클래스 안에 포함하는 것이 논리적으로 더 그룹화가 된다.
* 패키지를 열었을 때 다른 곳에서 사용될 필요가 없는 중첩 클래스가 외부에 노출되지 않는 장점도 있다.
*
* 2. 캡슐화:
* 중첩 클래스는 바깥 클래스의 private 멤버에 접근할 수 있다.
* 이렇게 해서 둘을 긴밀하게 연결하고 불필요한 public 메소드를 제거할 수 있다.
* */

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        engine = new Engine(); // 바깥 클래스에서 내부 클래스의 인스턴스를 생성할 때는 바깥 클래스의 이름을 생략할 수 있다.
    }

    public void start() {
        engine.start();
        System.out.println(model + " 시작 완료");
    }

    // 내부 클래스
    private class Engine {
        /*
        * 바깥 클래스에서 내부 클래스의 인스턴스를 생성할 때
        * 내부 클래스의 인스턴스는 자신을 생성한 바깥 클래스의 인스턴스를 자동으로 참조한다.
        * */
        private void start() {
            System.out.println("충전 레벨 확인: " + chargeLevel);
            System.out.println(model + "의 엔진을 구동합니다.");
        }
    }
}
