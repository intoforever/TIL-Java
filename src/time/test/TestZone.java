package time.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {
    public static void main(String[] args) {
        /*
         * 65강 문제와 풀이1
         * 문제5 - 국제 회의 시간
         * 서울의 회의 시간은 2024년 1월 1일 오전 9시앋. 이때 런던, 뉴옥의 회의 시간을 구해라.
         * */

        // 1. 날짜 생성
        LocalDateTime date = LocalDateTime.of(2024, 1, 1, 9, 0, 0);
        ZonedDateTime seoul = ZonedDateTime.of(date, ZoneId.of("Asia/Seoul"));
        ZonedDateTime london = seoul.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime newYork = seoul.withZoneSameInstant(ZoneId.of("America/New_York"));

//        ZonedDateTime seoul = date.atZone(ZoneId.of("Asia/Seoul"));
//        ZonedDateTime london = seoul.withZoneSameInstant(ZoneId.of("Europe/London"));
//        ZonedDateTime newYork = seoul.withZoneSameInstant(ZoneId.of("America/New_York"));

        // 2. 출력
        System.out.println("서울의 회의 시간: " + seoul);
        System.out.println("런던의 회의 시간: " + london);
        System.out.println("뉴욕의 회의 시간: " + newYork);
    }
}