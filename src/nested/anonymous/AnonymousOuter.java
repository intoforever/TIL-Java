package nested.anonymous;

import nested.local.Printer;

/*
* 78강 익명 클래스 - 시작
*
* 지역 클래스가 일회성으로 사용되는 경우나 갇난한 구현을 제공할 때 사용한다.
*
* 익명 클래스는 클래스의 본문(body)을 정의하면서 동시에 생성한다.
* new 다음에 바로 상속받으면서 구현 할 부모 타입을 입력하면 된다. => new Printer() {body}
*
* 이 코드는 마치 인터페이스 Printer를 생성하는 것처럼 보인다.
* 하지만 자바에서 인터페이스를 생성하는 것은 불가능하다.
* 이 코드는 인터페이스를 생성하는 것이 아니고, Printer라는 이름의 인터페이스를 구현한 익명 클래스를 생성하는 것이다.
* {body} 부분에 Printer 인터페이스를 구현한 코드를 작성하면 된다.
* 이 부분이 바로 익명 클래스의 본문이 된다.
*
* 쉽게 이야기해서 Printer를 상속(구현)하면서 바로 생성하는 것이다.
* 익명 클래스는 부모 클래스를 상속 받거나, 또는 인터페이스를 구현해야 한다.
* 익명 클래스를 사용할 때는 상위 클래스나 인터페이스가 꼭 필요하다.
*
* ★★★ 익명 클래스는 이름이 없기 때문에 생성자를 가질 수 없다. (기본 생성자만 사용됨) ★★★
* */
public class AnonymousOuter {
    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;

        Printer printer = new Printer() {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        };
        printer.print();
        // 익명클래스는 이름이 없기 때문에 AnonymousOuter$1과 같이 자바 내부에서 바깥 클래스 이름 + $ + 숫자로 정의된다.
        // 익명 클래스가 여러개면 $1, $2, $3으로 숫자가 증가하면서 구분된다.

        System.out.println("printer.class = " + printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter localOuter = new AnonymousOuter();
        localOuter.process(2);
    }
}
