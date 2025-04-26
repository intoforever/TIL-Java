package nested;

public class ShadowingMain {
    public int value = 1;

    class Inner {
        public int value = 2;

        /*
        * 프로그래밍에서 우선순위는 대부분 더 가깝거나, 더 구체적인 것이 우선권을 가진다.
        * go 안에서는 지역변수 value가 가장 높은 우선순위를 가지기 때문에 value를 출력하면 3이 나온다.
        *
        * 이렇게 다른 변수들을 가려서 보이지 않게 하는 것을 섀도잉(Shadowing)이라 한다.
        * 다른 변수를 가리더라도 인스턴스의 참조를 사용하면 외부의 변수에 접근할 수 있다.
        * */
        void go() {
            int value = 3;
            System.out.println("ShadowingMain.value = " + ShadowingMain.this.value);
            System.out.println("this.value = " + this.value);
            System.out.println("value = " + value);
        }
    }

    public static void main(String[] args) {
        ShadowingMain main = new ShadowingMain();
        Inner inner = main.new Inner();
        inner.go();
    }
}
