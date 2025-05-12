package exception.ex2;

/**
 * 자바는 어떤 경우라도 반드시 호출되는 finally 기능을 제공한다.
 * try~catch 안에서 처리할 수 없는 예외가 발생해도 finally는 반드시 호출된다.
 *
 * ※ catch 없이 try~finally만 사용할 수도 있다.
 * 예외를 직접 잡아서 처리할 일이 없다면 이렇게 사용하면 됨
 *
 * 1. 정상흐름 → finally
 * 2. 예외 catch → finally
 * 3. 예외 던짐 → finally
 *    (finally 코드 블럭이 끝나고 나서 이후에 예외가 밖으로 던져짐)
 */
public class NetworkServiceV2_5 {
    public void sendMessage(String data) {
        String address = "http://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); // 추가

        // 자바 예외 처리는 try~catch~finally 구조를 사용해서 처리함으로써
        // 정상 흐름과 예외 흐름을 분리해서 코드의 가독성을 높여주고
        // 사용한 자원을 항상 반환할 수 있도록 보장해준다.
        try {
            client.connect();
            client.send(data); // throw new RuntimeException("ex");
        } catch (NetworkClientExceptionV2 e) {
            System.out.println(e.getMessage() + " / [오류] 코드: " + e.getErrorCode());
        } finally {
            client.disconnect();
        }
    }
}
