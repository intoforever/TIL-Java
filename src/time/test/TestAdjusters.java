package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {
    public static void main(String[] args) {
        /*
         * 65강 문제와 풀이1
         * 문제4 - 시작 요일, 마지막 요일 구하기
         * 입력 받은 월의 첫날 요일과 마지막 요일을 구해라.
         * */

        // 1. 날짜 생성
        int year = 2024;
        int month = 1;

        // 2. 날짜 생성
        LocalDate date = LocalDate.of(year, month, 1);
        DayOfWeek firstDayOfWeek = date.getDayOfWeek();
        DayOfWeek lastDayOfWeek = date.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();

        // 3. 출력
        System.out.println("firstDayOfWeek = " + firstDayOfWeek);
        System.out.println("lastDayOfWeek = " + lastDayOfWeek);
    }
}
