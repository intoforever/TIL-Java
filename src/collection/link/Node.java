package collection.link;

/**
 * 노드는 내부에 데이터와 다음 노드에 대한 참조를 가지고 있다.
 */
public class Node {
    Object item; // 현재 노드의 데이터
    Node next; // 다음 노드의 참조

    public Node(Object item) {
        this.item = item;
    }
/*
    // IDE 생성 toString()
    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next + // ★next는 또한 Node임, 따라서 내부의 toString이 다시 호출됨★
                "}";
    }
*/

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node x = this;
        sb.append("[");
        while (x != null) {
            sb.append(x.item);
            if (x.next != null) {
                sb.append("->");
            }
            x = x.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
