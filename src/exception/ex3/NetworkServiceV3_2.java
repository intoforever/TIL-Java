package exception.ex3;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;

/**
 * 예외를 계층화 해서 특정 예외 ~ 상위 예외를 다르게 처리해보자.
 */
public class NetworkServiceV3_2 {
    public void sendMessage(String data) {
        String address = "http://example.com";

        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data); // throw new RuntimeException("ex");
        } catch (ConnectExceptionV3 e) { // 항상 세분화 된 오류를 맨 위에 놓아야 한다. (안그러면 컴파일 오류)
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메시지: " + e.getMessage());
        } catch (NetworkClientExceptionV3 e) {
            System.out.println("[네트워크 오류] 메시지: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("[알 수 없는 오류] 메시지: " + e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}
