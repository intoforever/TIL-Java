package nested.test;

/*
 * 82강 문제와 풀이1
 * 문제4 - 익명 클래스를 완성해라
 */
public class AnonymousMain {
    public static void main(String[] args) {
        Hello hello = new Hello() {
            @Override
            public void hello() {
                System.out.println("Hello.hello");
            }
        };
        hello.hello();
    }
}
