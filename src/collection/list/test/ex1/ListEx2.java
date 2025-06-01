package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 문제와 풀이1
 * 문제2 - 리스트의 입력과 출력
 * - 사용자에게 n개의 정수를 입력받아서 List에 저장하고, 입력 순서대로 출력하자.
 * - 0을 입력하면 입력을 종료하고 결과를 출력한다.
 * - 출력 시 출력 포매슨 1, 2 3, 4, 5와 같이 ,쉼표를 사용해서 구분하고, 마지막에는 쉼표를 넣지 않아야 한다.
 * - 실행 결과 계시를 참고하자
 */
public class ListEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        
        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        int input;
        while ((input = scanner.nextInt()) != 0) {
            list.add(input);
        }

        System.out.println("출력");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i == list.size() - 1) {
                break;
            }
            sb.append(", ");
        }
        System.out.println(sb.toString());
    }
}
