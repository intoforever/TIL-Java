package generic.ex5;

/**
 * 컴파일 된 후에는 타입 이레이져 되기 때문에
 * 런타임에서 T는 Object(혹은 상한이 되는 클래스)가 된다.
 *
 * 따라서 instanceof로 비교하면 항상 참을 반환하고
 * new T()는 항상 Object가 되어 개발자 의도와 다르기 때문에 컴파일 오류를 낸다.
 */
public class EraserBox<T> {

    public boolean instanceCheck(Object param) {
        // return param instanceof T; // 컴파일 오류
        return false;
    }

    public void create() {
        // new T(); // 컴파일 오류
    }
}
