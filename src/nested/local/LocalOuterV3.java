package nested.local;

/*
* 이미 제거된 메서드의 스택프레임 속 지역변수(+ 매개변수도 포함)에 어떻게 접근이 가능한걸까?
*
* */
public class LocalOuterV3 {
    private int outInstanceVar = 3;

    public Printer process(int paramVar) {
        int localVar = 1;

        class LocalPrinter implements Printer {
            int value = 0; // 지역 변수는 스택 프레임이 종료되는 순간 함께 제거된다.

            @Override
            public void print() {
                // 나의 멤버 변수와 외부 클래스의 멤버 변수 접근은 이상 없음
                System.out.println("value = " + value);
                System.out.println("outInstanceVar = " + outInstanceVar);

                // 인스턴스는 지역 변수보다 더 오래 살아남는다.
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
//        printer.print(); // 여기서 실행하지 않고 Printer 인스턴스만 반환한다.
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuter = new LocalOuterV3();
        Printer printer = localOuter.process(2);

        /*
        * printer.print()를 나중에 실행한다.
        * process()의 스택 프레임이 사라진 이후에 실행
        * */
        printer.print(); // 하지만 localVar, paramVar가 출력되는 모습을 확인할 수 있다.
    }
}
