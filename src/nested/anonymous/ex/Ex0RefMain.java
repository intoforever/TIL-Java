package nested.anonymous.ex;

/*
* 79강 - 익명 클래스 활용1
* 리팩토링의 핵심
* 1. 변하는 부분과 변하지 않는 부분을 분리
* 2. 변하는 부분은 외부에서 전달받아서 처리
* */
public class Ex0RefMain {

    public static void hello(String str) {
        System.out.println("프로그램 시작"); // 변하지 않는 부분
        System.out.println(str); // str: 변하는 부분
        System.out.println("프로그램 종료"); // 변하지 않는 부분
    }

    public static void main(String[] args) {
        hello("Hello Java");
        hello("Hello Spring");
    }
}
