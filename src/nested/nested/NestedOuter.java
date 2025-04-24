package nested.nested;

/*
* 중첩(Nested): 어떤 다른 것이 내부에 위치하거나 포함되는 구조적인 관계
* 나의 안에 있지만 내것이 아닌 것
* (단순히 위치만 안에 있는 것)
* 
**/
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
