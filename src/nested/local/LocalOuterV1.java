package nested.local;

/*
* 지역클래스는 내부클래스의 한 종류이다.
* 지역변수에 접근할 수 있는 특징이 있다.
* 단, 지역 변수처럼 접근 제어자를 사용할 수는 없다.
* (※ 접근 제어자는 멤버 변수에만 쓸 수 있음, 지역 변수에는 쓸 수 없음 ※)
*
* 지역 클래스의 접근 범위
* 1. 자신의 인스턴스 변수인 value에 접근할 수 있다.
* 2. 자신이 속한 코드 블럭의 지역 변수인 localVar에 접근할 수 있다.
* 3. 자신이 속한 코드 블럭의 매개변수인 paramVar에 접근할 수 있다. 참고로 매개변수도 지역 변수의 한 종류이다.
* 4. 바깥 클래스의 인스턴스 멤버인 outInstanceVar에 접근할 수 있다. (지역 클래스도 내부 클래스의 한 종류이다.)
* */
public class LocalOuterV1 {
    private int outInstanceVar = 3; // 멤버 변수는 접근 제어자를 사용할 수 있다.

    public void process(int paramVar) {
//        private int localVar = 1; // 지역 변수는 접근 제어자를 사용할 수 없다.
        int localVar = 1;

        class LocalPrinter {
            int value = 0;

            public void printData() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        printer.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuter = new LocalOuterV1();
        localOuter.process(2);
    }
}
