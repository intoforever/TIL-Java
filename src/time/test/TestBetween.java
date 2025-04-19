package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args) {
        /*
         * 65강 문제와 풀이1
         * 문제3 - 디데이 구하기
         * */

        // 1. 날짜 생성
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);

        // 2. 남은 기간
        Period period = Period.between(startDate, endDate); // 년 월 일 분리

        // 3. 디데이
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate); // 일자를 구함

        // 4. 출력
        System.out.println("시작 날짜: " + startDate);
        System.out.println("목표 날짜: " + endDate);
        System.out.println("남은 기간: " + period.getYears() + "년 " + period.getMonths() + "개월 " + period.getDays() + "일");
        System.out.println("디데이: " + daysBetween+ "일 남음");
    }
}
