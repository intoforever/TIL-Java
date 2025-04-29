package nested.local;

import java.lang.reflect.Field;

/*
* 지역 클래스가 접근하는 지역 변수는 절대로 중간에 값이 변하면 안된다.
* (람다에서도 똑같은 개념이 적용됨, 잘 이해 필요!!)
*
* 따라서 "final"로 선언하거나 또는 "사실상 final"이어야 한다.
* 이것은 자바 문법이고 규칙이다. (컴파일 오류가 남)
*
* 
* ★ 캡처 변수의 값을 변경하지 못하는 이유 ★
* 아래의 모든 문제는 캡처한 지역 변수의 값을 바꾸지 못하게 막음으로써 근본적으로 차단할 수 있다.
*
* 1. 지역 변수의 값을 변경하면 인스턴스에 캡처한 변수의 값도 변경해야 한다.
* 2. 반대로 인스턴스에 있는 캡처 변수의 값을 변경하면 해당 지역 변수의 값도 다시 변경해야 한다.
* 3. 개발자 입장에서 보면 예상하지 못한 곳에서 값이 변경될 수 있다. 이는 디버깅을 어렵게 한다.
* 4. 지역 변수의 값과 인스턴스에 있는 캡처 변수의 값을 서로 동기화 해야 하는데, 멀티쓰레드 상황에서 이런 동기화는 매우 어렵고, 성능에 나쁜 영향을 줄 수 있다.
*
*
* ※ 용어정리: 사실상 final
* 영어로 effectively final이라 한다.
* 사실상 final 지역 변수는 지역 변수에 final 키워드를 사용하지는 않았지만, 값을 변경하지 않는 지역 변수를 뜻한다.
* final 키워드를 넣지 않았을 뿐이지, 실제로는 final 키워드를 넣은 것처럼 중간에 값을 변경하지 않은 지역 변수이다.
* 따라서 사실상 final 지역 변수는 final 키워드를 넣어도 동일하게 작동해야 한다.
*
* */
public class LocalOuterV4 {
    private int outInstanceVar = 3;

    public Printer process(int paramVar) {
        int localVar = 1;
//        localVar = 2; // 수정하는 순간 print 메소드 안의 출력문이 !!!컴파일 오류!!! 남, 생성 시점에 캡처하기 때문에 다시 캡처할 수 없음 (동기화 문제 발생)

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("outInstanceVar = " + outInstanceVar);

                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
            }
        }

        Printer printer = new LocalPrinter();
        // 만약 localVar의 값을 변경한다면? 다시 캡처해야 하나??
//        localVar = 10; // 컴파일 오류
//        paramVar = 20; // 컴파일 오류
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuter = new LocalOuterV4();
        Printer printer = localOuter.process(2);

        printer.print();
        
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}
