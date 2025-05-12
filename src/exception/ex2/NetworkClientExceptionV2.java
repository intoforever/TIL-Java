package exception.ex2;

/**
 * 예외도 객체이기 때문에 필요한 필드와 메서드를 가질 수 있다.
 */
public class NetworkClientExceptionV2 extends Exception{
    private String errorCode;

    public NetworkClientExceptionV2(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
