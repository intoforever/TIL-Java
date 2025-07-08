package thread;

public class DaemonThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");

        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true); // 데몬 스레드 여부 , start() 실행 전에 결정해야 한다. 이후에는 변경되지 않는다.
        daemonThread.start();

        System.out.println(Thread.currentThread().getName() + ": main() end");
    }

    static class DaemonThread extends Thread {
        @Override
        public void run() { // 예외 상위로 던질 수 없음 (위에서 예외 정의 안해놓음)
            System.out.println(Thread.currentThread().getName() + ": run()");
            try {
                Thread.sleep(10000); // 10초간 실행
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + ": run() end"); // 사용자 스레드가 종료되어서 여기까지 실행되지 않고 JVM 종료
        }
    }
}

/**
 * 스레드는 사용자(user) 스레드와 데몬(daemon) 스레드 2가지 종류로 구분할 수 있다.
 *
 * 1. 사용자 스레드(non-daemon 스레드)
 * - 프로그램의 주요 작업을 수행한다.
 * - 작업이 완료될 때까지 실행된다.
 * - 모든 user 스레드가 종료되면 JVM도 종료된다.
 *
 * 2. 데몬 스레드
 * - 백그라운드에서 보조적인 작업을 수행한다.
 * - 모든 user 스레드가 종료되면 데몬 스레드는 자동으로 종료된다.
 *
 * 3. JVM은 데몬 스레드의 실행 완료를 기다리지 않고 종료된다. 데몬 스레드가 아닌 모든 스레드가 종료되면, 자바 프로그램도 종료된다.
 */