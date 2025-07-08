package thread;

/**
 * 자바는 예외를 객체로 다루듯이, 스레드도 객체로 다룬다.
 */
public class HelloThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": run()");
    }
}
