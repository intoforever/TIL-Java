package time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class ChangTimeWithMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
        System.out.println("dt = " + dt);

        /*
        * with는 보통 불변일 때 사용하는 키워드, 기존것은 두고 새로운 것을 추가하여 새객체를 반환
        * 불변이므로 반환 값을 받아야 함!!
        * with를 사용하면 날짜와 시간의 특정 필드의 값만 변경할 수 있다.
        * */
        LocalDateTime changedDt1 = dt.with(ChronoField.YEAR, 2020);
        System.out.println("changedDt1 = " + changedDt1);

        // 편의메서드 제공해줌
        LocalDateTime changedDt2 = dt.withYear(2020);
        System.out.println("changedDt2 = " + changedDt2);

        /*
        * 복잡한 시간 계산은 TemporalAdjusters 사용
        * I/F: TemporalAdjuster
        * Class: TemporalAdjusters
        * DayOfWeek: 월화수목금토일을 나타내는 열거형
        * */
        // 다음주 금요일
        LocalDateTime with1 = dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)); // Adjuster 아니고 Adjusters임!!!
        System.out.println("기준 날짜: " + dt);
        System.out.println("다음 금요일: " + with1);

        // 이번 달의 마지막 일요일
        LocalDateTime with2 = dt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY)); // Adjuster 아니고 Adjusters임!!!
        System.out.println("같은 달의 마지막 일요일 = " + with2);
    }
}
