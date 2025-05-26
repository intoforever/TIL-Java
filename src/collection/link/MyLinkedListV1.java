package collection.link;

/**
 * ※ 연결 리스트와 배열 리스트 둘 다 중간에 있는 항목을 추가하거나 삭제하는 경우 같은 O(n)이 걸린다.
 *
 * 연결 리스트와 빅오
 *
 * 1. get - O(n)
 * 인덱스로 원하는 위치의 데이터를 찾으려면 인덱스 숫자만큼 다음 노드를 반복해서 찾아야 한다.
 * 따라서 인덱스 조회 성능이 나쁘다.
 *
 * 2. add - O(n)
 * 마지막 노드를 찾는데 O(n)이 소요된다.
 *
 * 3. set - O(n)
 * 특정 위치에 있는 데이터를 찾는데 O(n)이 소요된다.
 *
 * 4. indexOf - O(n)
 * 모든 노드를 순회하면서 equals()를 사용해서 같은 데이터가 있는지 찾는다.
 */
public class MyLinkedListV1 {
    private Node first;
    private int size = 0;

    public void add(Object e) {
        Node newNode = new Node(e);
        if (first == null) {
            first = newNode;
        } else {
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node getLastNode() {
        Node x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    public Object set(int index, Object e) {
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item = e;
        return oldValue;
    }

    public Object get(int index) {
        Node node = getNode(index);
        return node.item;
    }

    private Node getNode(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public int indexOf(Object e) {
        int index = 0;
        for (Node x = first; x != null; x = x.next) {
            if (e.equals(x.item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
