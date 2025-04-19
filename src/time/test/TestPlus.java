package time.test;

import java.time.LocalDateTime;

public class TestPlus {
    public static void main(String[] args) {
        /*
        * 65강 문제와 풀이1
        * 문제1 - 날짜 더하기
        * */
        
        // 1. 날짜 생성
        LocalDateTime dateTime = LocalDateTime.of(2024, 01, 01, 00, 00, 00);

        // 2. 날짜 더하기
        LocalDateTime futureDateTime = dateTime.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);
        System.out.println("기준 시각: " + dateTime);
        System.out.println("1년 2개월 3일 4시간 후의 시각: " + futureDateTime);
    }
}
