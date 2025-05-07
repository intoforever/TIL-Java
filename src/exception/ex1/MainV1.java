package exception.ex1;

import java.util.Scanner;

/*
* 86강 예외 처리가 필요한 이유2 - 오류 상황 만들기
* 외부 서버와 통신할 때 발생하는 다양한 문제들을 시뮬레이션 하는 코드 작성
* - 외부 서버와 연결에 실패한다. (네트워크 오류 등등)
* - 데이터 전송에 문제가 발생한다.
* */
public class MainV1 {
    public static void main(String[] args) {
        NetworkServiceV1_1 networkService = new NetworkServiceV1_1();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();
            if ("exit".equals(input)) {
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
