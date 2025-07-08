package thread;

/**
 * 1. HelloThread 스레드 객체를 생성한 다음에 start() 메서드를 호출하면 자바는 스레드를 위한 별도의 스택 공간을 할당한다.
 * 2. 스레드 객체를 생성하고, 반드시 start()를 호출해야 스택 공간을 할당 받고 스레드가 작동한다.
 * 3. 스레드에 이름을 주지 않으면 자바는 스레드에 Thread-0, Thread-1과 같은 임의의 이름을 부여한다.
 * 4. 새로운 Thread-0 스레드가 사용할 전용 스택 공간이 마련되었다.
 * 5. Thread-0 스레드는 run() 메서드의 스택 프레임을 스택에 올리면서 run() 메서드를 시작한다.
 */
public class HelloThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");

        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName() + ": start() 호출 전");
        helloThread.start(); // 반드시 run이 아니라 start를 호출해야 스택 공간을 할당 받은 뒤에 스레드가 작동한다.
        System.out.println(Thread.currentThread().getName() + ": start() 호출 후");

        System.out.println(Thread.currentThread().getName() + ": main() end");
    }
}
