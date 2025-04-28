package nested.local;

/*
* 지역클래스든 중첩클래스든 클래스이기 때문에
* 인터페이스를 구현하거나 부모 클래스를 상속받을 수 있다.
*
* */
public class LocalOuterV2 {
    private int outInstanceVar = 3; // 멤버 변수는 접근 제어자를 사용할 수 있다.

    public void process(int paramVar) {
//        private int localVar = 1; // 지역 변수는 접근 제어자를 사용할 수 없다.
        int localVar = 1;

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        printer.print();
    }

    public static void main(String[] args) {
        LocalOuterV2 localOuter = new LocalOuterV2();
        localOuter.process(2);
    }
}
