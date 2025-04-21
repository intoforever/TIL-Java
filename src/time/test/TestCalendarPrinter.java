package time.test;

import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        /*
         * 66강 문제와 풀이2
         * 문제6 - 달력 출력하기
         * 실행 결과를 참고해서 달력을 출력해라.
         * 입력조건: 년도, 월
         * */

        // 1. 입력받기
        Scanner scanner = new Scanner(System.in);

        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();

        System.out.print("월을 입력하세요: ");
        int month = scanner.nextInt();

        // 2. 메소드 호출
        printCalender(year, month);
    }

    private static void printCalender(int year, int month) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);

        // 월요일 = 1 ... 일요일 = 7
        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;
        System.out.println("Su  Mo  Tu  We  Th  Fr  Sa  ");

        // 출력
        String indent = "   ";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if (offsetWeekDays > firstDayOfMonth.lengthOfMonth()) {
                    return;
                }
                if (offsetWeekDays >= 10) {
                    indent = "  ";
                }
                if (offsetWeekDays % 7 != j) {
                    System.out.print(indent + " ");
                    continue;
                }
                System.out.print(offsetWeekDays + indent);
                offsetWeekDays++;
            }
            System.out.println();
        }
    }
}
