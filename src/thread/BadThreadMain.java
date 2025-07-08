package thread;

/**
 * start() vs run()
 * 1. run()을 직접 실행하면 main 스레드가 직접 실행한다.
 * 2. start()를 호출해야만 스택영역이 생기고, OS에 시스템 콜을 보내서 스레드를 생성해줄 수 있다.
 */
public class BadThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");

        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName() + ": start() 호출 전");
        helloThread.run(); // run() 직접 실행
        System.out.println(Thread.currentThread().getName() + ": start() 호출 후");

        System.out.println(Thread.currentThread().getName() + ": main() end");
    }
}
