package nested.nested;

public class NestedOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    static class Nested {
        private int nestedInstanceValue = 1;

        public void print() {
            // 자신의 멤버에 접근
            System.out.println(nestedInstanceValue);

            // static class 이기 때문에 바깥 클래스의 인스턴스 멤버에는 접근할 수 없다.
//            System.out.println(outInstanceValue);

            // 바깥 클래스의 클래스 멤버는 private 이더라도 접근할 수 있다.
            System.out.println(NestedOuter.outClassValue);
            System.out.println(outClassValue);
        }
    }
}
