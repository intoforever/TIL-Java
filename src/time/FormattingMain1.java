package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {
    public static void main(String[] args) {
        // 포맷팅: 날짜 → 문자 (날짜를 내가 원하는 형태의 문자로 변경)
        LocalDate date = LocalDate.of(2024, 12, 31);
        System.out.println("date = " + date);
        System.out.println(date.getYear() + "년 " + date.getMonthValue() + "월"); // 물론 이렇게 하는 것도 가능하지만 포맷터 제공

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"); // 대소문자 구분 필요
        String formattedDate = date.format(formatter);
        System.out.println("날짜와 시간 포맷팅 = " + formattedDate);

        // 파싱: 문자 → 날짜 (문자열을 읽어서 날짜와 시간 객체로 만드는 것)
        String input = "2030년 01월 01일";
        LocalDate parsedDate = LocalDate.parse(input, formatter); // ★ formatter와 input의 형태가 반드시 같아야 함!!
        System.out.println("문자열 파싱 날짜와 시간 = " + parsedDate);
    }
}
