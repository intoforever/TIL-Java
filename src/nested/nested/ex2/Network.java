package nested.nested.ex2;

public class Network {

    public void sendMessage(String text) {
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }

    /*
    * 중첩 클래스(내부 클래스 포함)는 그 용도가 자신이 소속된 바깥 클래스 안에서 사용되는 것이다.
    *
    * 따라서 자신이 소속된 바깥 클래스가 아닌 외부에서 생성하고 사용하고 있다면,
    * 아마도 중첩 클래스의 용도에 맞지 않을 수 있다. (대부분)
    *
    * 이때는 중첩 클래스를 바깥으로 빼는 것이 더 나은 선택이다.
    * */
    private static class NetworkMessage {
        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }

        public void print() {
            System.out.println(content);
        }
    }
}
