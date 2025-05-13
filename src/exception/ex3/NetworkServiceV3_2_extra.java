package exception.ex3;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.SendExceptionV3;

/**
 * 예외를 함께 묶어서 잡을 수 있다.
 * 단, 이 경우 각 예외들의 공통 부모의 기능만 사용이 가능하다.
 * (getAddress, getSendData는 사용 불가)
 */
public class NetworkServiceV3_2_extra {
    public void sendMessage(String data) {
        String address = "http://example.com";

        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data); // throw new RuntimeException("ex");
        } catch (ConnectExceptionV3 | SendExceptionV3 e) { //
            System.out.println("[연결 또는 전송 오류] 주소, 메시지: " + e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}
