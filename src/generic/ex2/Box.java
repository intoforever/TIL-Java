package generic.ex2;

/**
 * 객체를 보관할 수 있는 간단한 제네릭 클래스
 */
public class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
