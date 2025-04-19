package time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {
    public static void main(String[] args) {
        /*
         * 65강 문제와 풀이1
         * 문제2 - 날짜 간격 반복 출력하기
         * */

        // 1. 날짜 생성
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        
        // 2. 2주 간격으로 날짜 반복 출력
        System.out.println("======= 기본 plus로 처리 =======");
        for (int i = 0; i < 5; i++) {
            LocalDate nextDate = startDate.plus(2 * i, ChronoUnit.WEEKS);
            System.out.println("날짜 " + (i + 1) + ": " + nextDate);
        }

        // 3. 편의 메소드 사용
        System.out.println();
        System.out.println("======= 편의메소드 사용 방법으로 변경 =======");
        for (int i = 0; i < 5; i++) {
            LocalDate nextDate2 = startDate.plusWeeks(2 * i);
            System.out.println("날짜 " + (i + 1) + ": " + nextDate2);
        }
    }
}
