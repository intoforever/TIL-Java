package exception.ex1;

/*
* disconnect()를 반드시 호출하게끔 로직 수정
* 네트워크 연결 자원이 고갈될 수 있다.
*
* ※ 참고:
* 자바의 경우 GC가 있기 때문에 JVM 메모리에 있는 인스턴스는 자동으로 해제할 수 있다.
* 하지만 외부 연결과 같은 자바 외부의 자원은 자동으로 해제가 되지 않는다.
* 따라서 외부 자원을 사용한 후에는 연결을 해제해서 외부 자원을 반드시 반납해야 한다.
* */
public class NetworkServiceV1_3 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data); // 추가

        String connectResult = client.connect();
        // 부정으로 비교하지 말고 메소드로 뽑기
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
        } else {
            String sendResult = client.send(data);
            if (isError(sendResult)) {
                System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
            }
        }

        client.disconnect();
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
