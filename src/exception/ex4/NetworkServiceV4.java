package exception.ex4;

/**
 * Connect/SendException 모두 오류를 잡아도 복구할 수 없는 오류이기 때문에 예외를 밖으로 던진다.
 * 언체크 예외이므로 throws를 사용하지 않는다.
 * 해결할 수 없는 예외들은 다른 곳에서 공통으로 처리된다.
 * 이런 방식 덕분에 NetworkSerivceV4는 해결할 수 없는 예외보다는 본인 스스로의 코드에 더 집중할 수 있고, 코드가 깔끔해진다.
 */
public class NetworkServiceV4 {
    public void sendMessage(String data) {
        String address = "http://example.com";

        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } finally {
            client.disconnect();
        }
    }
}
