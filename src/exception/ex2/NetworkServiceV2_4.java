package exception.ex2;

/**
 * disconnect를 try~catch 밖으로 빼내면 당장은 disconnect()가 항상 호출되겠지만
 * catch에서 잡을 수 없는 예외가 발생하면 disconnect가 되지 않는 문제가 발생
 */
public class NetworkServiceV2_4 {
    public void sendMessage(String data) {
        String address = "http://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); // 추가

        try {
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println(e.getMessage() + " / [오류] 코드: " + e.getErrorCode());
        }
        client.disconnect();
    }
}
