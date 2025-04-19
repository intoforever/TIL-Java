package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormattingMain2 {
    public static void main(String[] args) {
        // 포맷팅: 날짜와 시간 → 문자
        LocalDateTime now = LocalDateTime.of(2024, 12, 31, 13, 30, 59);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd a hh:mm:ss", Locale.ENGLISH);
        String formattedDateTime = now.format(formatter);
        System.out.println("원래 LocalDateTime 객체: " + now);
        System.out.println("날자와 시간 포맷팅: " + formattedDateTime);

        // 파싱: 문자 → 날짜와 시간
        String dateTimeString = "2030-01-01 PM 11:30:00";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeString, formatter);
        System.out.println("문자열 파싱 날짜와 시간: " + parsedDateTime);
    }
}
