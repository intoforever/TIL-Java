package nested.nested;

public class NestedOuterMain {
    public static void main(String[] args) {
        /*
        * ※ 정적 중첩 클래스는 private 변수에 접근할 수 있다는 것 제외, 사실 서로 다른 클래스를 중첩해둔 것일 뿐 아무런 관계가 없다.
        * 
        * 1. 정적 중첩 클래스는 new 바깥 클래스.중첩클래스()로 생성할 수 있다.
        * 2. 중첩 클래스는 NestedOuter.Nested와 같이 바깥 클래스.중첩클래스로 접근할 수 있다.
        * 3. 여기서 new NestedOuter()로 만든 바깥 클래스의 인스턴스와 new NestedOuter.Nested()로 만든 정적 중첩 클래스의 인스턴스는
        * 서로 아무 관계가 없는 인스턴스이다.
        * 단지 클래스 구조상 중첩해 두었을 뿐이다.
        * */

        NestedOuter outer = new NestedOuter(); // 외부클래스는 그냥 클래스 생성하듯이 하면 됨 (nested와 상관X)
        NestedOuter.Nested nested = new NestedOuter.Nested(); // 중첩클래스만 따로 만들 수 있음 (outer와 상관X)
        nested.print();

        System.out.println("nestedClass = " + nested.getClass());
    }
}
