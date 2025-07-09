package thread;

import static util.MyLogger.log;

/**
 * 반복문을 사용하면 스레드의 숫자를 유동적으로 변경하면서 실행할 수 있다.
 * 스레드 실행 순서는 OS의 스케쥴링에 달려있다. → 실행 순서는 보장되지 않는다.
 */
public class ManyThreadMainV2 {
    public static void main(String[] args) {
        log("main() start");

        HelloRunnable runnable = new HelloRunnable();
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(runnable);
            thread.start();
        }

        log("main() end");
    }
}
