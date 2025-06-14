package collection.deque;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * FIFO (선입선출) 자료구조 Queue
 * LIFO와 반대로 가장 먼저 넣은 것이 가장 먼저 나오는 자료 구조다.
 * 큐에 값을 넣는 것을 offer라고 하고 큐에서 값을 빼내는 것을 poll이라 한다.
 *
 * ※ 컬렉션 프레임워크 Queue
 *
 * Queue 인터페이스는 List, Set과 같이 Collection의 자식이다.
 * Queue의 대표적인 구현체는 ArrayDeque, LinkedList가 있다.
 * 참고로 LinkedList는 Deque와 List 인터페이스를 모두 구현한다.
 */
public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>(); // 더 빠름
        // Queue<Integer> queue = new LinkedList<>();

        // 데이터 추가
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue);

        // 다음 꺼낼 데이터 확인 (꺼내지 않고 단순 조회만)
        System.out.println("queue.peek() = " + queue.peek());

        // 데이터 꺼내기
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println(queue);
    }
}
