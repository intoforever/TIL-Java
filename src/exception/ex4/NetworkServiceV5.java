package exception.ex4;

/**
 * try~with~resources는 try문이 끝나면 자동으로 해제된다.
 * 중간에 catch로 잡히는 경우 catch 전에 끝남 유의
 *
 * try~with~resources 장점
 * 1. 리소스 누수 방지:
 * 모든 리소스가 제대로 닫히도록 보장한다.
 * 실수로 finally 블록을 적지 않거나, finally 블럭 안에서 자원 해제 코드를 누락하는 문제들을 예방할 수 있다.
 * 2. 코드 간결성 및 가독성 향상:
 * 명시적인 close() 호출이 필요 없어 코드가 더 간결하고 읽기 쉬워진다.
 * 3. 스코프 범위 한정:
 * 예를 들어 리소스로 사용되는 client 변수의 스코프가 try 블럭 안으로 한정된다. 따라서 코드 유지보수가 더 쉬워진다.
 * 4. 조금 더 빠른 자원 해제:
 * 기존에는 try→catch→finally로 catch 이후에 자원을 반납했으나 try~with~resources 구문은 try 블럭이 끝나면 즉시 close()를 호출한다.
 */
public class NetworkServiceV5 {
    public void sendMessage(String data) {
        String address = "http://example.com";

        try (NetworkClientV5 client = new NetworkClientV5(address)) {
            client.initError(data);
            client.connect();
            client.send(data);
        } catch (Exception e) {
            System.out.println("[예외 확인]: " + e.getMessage());
            throw e;
        }
    }
}
