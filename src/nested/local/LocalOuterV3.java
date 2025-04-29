package nested.local;

import java.lang.reflect.Field;

/*
* Q: 이미 제거된 메서드의 스택프레임 속 지역변수(+ 매개변수도 포함)에 어떻게 접근이 가능한걸까?
* A: 자바에서는 지역변수와 인스턴스의 생명주기가 달라 발생하는 문제를 해결하기 위해서
* 인스턴스 생성 시점에 내부 클래스에서 사용하는 지역 변수들을 "캡쳐"해서 클래스에 포함시켜 인스턴스를 생성한다.
*
* 때문에 사실상 지역변수를 참조할 때, 메서드 스택 프레임에 있는 지역변수를 참조하는 것이 아니라 캡쳐되어 인스턴스에 포함된 변수를 참조하는 것!!
* (이런 필드들은 자바가 내부에서 만들어서 사용하는 필드들이다.)
*
* ★정리★
* 1. 지역 클래스는 인스턴스를 생성할 때 필요한 지역 변수를 먼저 캡쳐해서 인스턴스에 보관한다.
* 2. 그리고 지역 클래스의 인스턴스를 통해 지역 변수에 접근하면, 실제로는 지역 변수에 접근하는 것이 아니라 인스턴스에 있는 캡쳐한 캡쳐 변수에 접근한다.
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
        
        // (추가): 필드를 출력해보면 지역변수 localVar, paramVar가 있고 뿐만 아니라 외부 클래스 정보 LocalOuterV3의 참조값도 가지고 있다.
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}
