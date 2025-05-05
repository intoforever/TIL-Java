package nested.anonymous.ex;

import java.util.Random;

/*
* 81강 익명 클래스 활용3
* 자바 8버전부터 도입된 람다를 이용해 리팩토링
*
* ※ 람다
* 자바 8버전 부터는 기본형, 참조형 외에 코드 블럭을 인수로 전달할 수 있게 되었다. = 람다
* (클래스나 인스턴스를 정의하지 않고 메서드(더 정확히는 함수)의 코드 블럭을 직접 전달)
*
* ※ 익명 클래스와 람다의 차이를 이해하고 구분하여 사용
* 익명 클래스: 클래스이기 때문에 멤버변수를 추가로 가질 수 있다.
* 람다: 메서드이기 때문에 지역변수는 가능하지만 멤버변수는 가질 수 없다.
* */
public class Ex1RefMainV5 {

    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        // 코드 조각 시작
        process.run();
        // 코드 조각 종료

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        System.out.println("===== hello 호출 시작! =====");

        // 1. dice
        hello(() -> {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        });

        // 2. sum
        hello(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        });
    }
}
