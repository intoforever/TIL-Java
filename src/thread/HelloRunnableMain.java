package thread;

/**
 * 실행 결과는 기존과 같다.
 * 차이가 있다면, 스레드와 해당 스레드가 실행할 작업이 서로 분리되어 있다는 점이다.
 *
 * Runnable 인터페이스를 구현하는 방식을 사용하자.
 * 스레드와 실행할 작업을 명확히 분리하고, 인터페이스를 사용하므로 Thread 클래스를 직접 상속하는 방식보다 유연하고 유지보수 하기 쉬운 코드를 만들 수 있다.
 */
public class HelloRunnableMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");

        HelloRunnable runnable = new HelloRunnable();
        Thread thread = new Thread(runnable); // 스레드 객체 생성시에 실행할 작업을 생성자로 전달
        thread.start();

        System.out.println(Thread.currentThread().getName() + ": main() end");
    }
}

/**
 * Thread 상속 vs Runnable 구현
 *
 * 1. Thread 상속 방식
 * - 장점
 *     - 간단한 구현: Thread 클래스를 상속받아 run() 메서드만 재정의하면 된다.
 * - 단점
 *     - 상속의 제한: 자바는 단일 상속만을 허용하므로 이미 다른 클래스를 상속받고 있는 경우 Thread 클래스를 상속받을 수 없다.
 *     - 유연성 부족: 인터페이스를 사용하는 방법에 비해 유연성이 떨어진다.
 *
 * 2. Runnable 인터페이스 구현 방식
 * - 장점
 *     - 상속의 자유로움: Runnable 인터페이스 방식은 다른 클래스를 상속받아도 문제없이 구현할 수 있다.
 *     - 코드의 분리: 스레드와 실행할 작업을 분리하여 코드의 가독성을 높일 수 있다.
 *     - 여러 스레드가 동일한 Runnable 객체를 공유할 수 있어 자원 관리를 효율적으로 할 수 있다.
 * - 단점
 *     - 코드가 약간 복잡해질 수 있다.
 *     (Runnable 객체를 생성하고 이를 Thread에 전달하는 과정이 추가된다.)
 */