package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMain {

    public static void hello(Code code) {
        System.out.println("프로그램 시작");

        // 코드 조각 시작
        code.code();
        // 코드 조각 종료

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        // helloDice
        hello((Code) () -> {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        });

        // helloSum
        hello((Code) () -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        });
    }
}
