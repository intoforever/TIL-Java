package exception.basic.unchecked;

/**
 * throws를 명시적으로 적지 않아도 자동으로 throws됨
 */
public class Client {
    public void call() {
        throw new MyUncheckedException("ex");
    }
}
