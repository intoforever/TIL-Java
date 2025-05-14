package exception.ex4;

import exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV5 {
    public static void main(String[] args) {
        // NetworkServiceV4 networkService = new NetworkServiceV4();
        NetworkServiceV5 networkService = new NetworkServiceV5();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();
            if ("exit".equals(input)) {
                break;
            }

            try {
                networkService.sendMessage(input);
            } catch (Exception e) { // 모든 예외를 잡아서 처리
                exceptionHandler(e);
            }

            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }

    // 공통 예외 처리
    private static void exceptionHandler(Exception e) {
        // 공통 처리
        System.out.println("사용자 메시지: 죄송합니다. 알 수 없는 문제가 발생했습니다.");
        System.out.println("=== 개발자용 디버깅 메시지 ===");
        // e.printStackTrace(System.err); // 사실 System.err를 명시적으로 써주지 않아도 e.printStackTrace()로 하면 기본적으로 err로 출력됨
        e.printStackTrace(System.out); // err와 out은 출력 스트림이 다르기 때문에 동시에 사용 시 출력순서를 보장하지 않는다. 때문에 여기서는 표준 출력으로 처리

        // 필요 시, 예외 별로 별도의 추가 처리 가능 (예외도 객체이므로 instanceof와 같이 타입 확인 가능)
        if (e instanceof SendExceptionV4 sendEx) { // 다운캐스팅
            System.out.println("[전송 오류] 전송 데이터: " + sendEx.getSendData());
        }
    }
}
