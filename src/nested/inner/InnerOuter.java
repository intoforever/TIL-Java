package nested.inner;

/*
* 내부(Inner): 나의 내부에 있는 나를 구성하는 요소
* 나의 내부에서 나를 구성하는 요소로
* 바깥 클래스의 인스턴스 내부에 소속되어 구성하는 요소로 사용된다.
**/
public class InnerOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    // static이 안붙어서 인스턴스의 멤버가 된다.
    class Inner {
        private int innerInstanceValue = 1;
        
        public void print() {
            // 자기 자신에 접근
            System.out.println(innerInstanceValue);

            // 외부 클래스의 인스턴스 멤버에 접근 가능, private도 접근 가능
            System.out.println(outInstanceValue);

            // 외부 클래스의 클래스 멤버에 접근 가능, private도 접근 가능
            System.out.println(outClassValue);
        }
    }
}
