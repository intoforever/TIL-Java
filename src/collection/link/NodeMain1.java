package collection.link;

/**
 * 연결된 노드를 찾는 방법
 * Node first를 통해 첫 번째 노드를 구할 수 있다.
 * 첫 번째 노드의 node.next를 호출하면 두 번째 노드를 구할 수 있다.
 * 두 번째 노드의 node.next를 호출하면 세 번재 노드를 구할 수 있다.
 * 첫 번째 노드의 node.next.next를 호출하면 세 번째 노드를 구할 수 있다.
 */
public class NodeMain1 {
    public static void main(String[] args) {
        // 노드 생성하고 연결하기: A -> B -> C
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println("모든 노드 탐색하기");
        Node x = first;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }
}
