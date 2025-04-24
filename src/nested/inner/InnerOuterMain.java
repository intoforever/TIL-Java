package nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        /*
         * 내부 클래스는 바깥 클래스의 인스턴스에 소속된다. (static이 아니기 때문에 참조가 있어야 함)
         * 따라서 바깥 클래스의 인스턴스 정보를 알아야 생성할 수 있다.
         * 즉, 바깥 클래스의 인스턴스를 먼저 생성해야 내부 클래스의 인스턴스를 생성할 수 있다.
         *
         * 내부 클래스는 바깥클래스의 인스턴스 참조. new 내부클래스()로 생성할 수 있다.
         */
        InnerOuter outer = new InnerOuter();

        // 따라서 outer로 먼저 참조를 만들고 그 안에서 new Inner()와 같은식으로 처리 해야 함
        InnerOuter.Inner inner = outer.new Inner();
        inner.print();

        System.out.println("innerClass = " + inner.getClass());
    }
}
