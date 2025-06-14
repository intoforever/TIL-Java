package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Deque: (Double Ended Queue)의 약자로 양쪽 끝에서 요소를 추가하거나 제거할 수 있는 자료 구조
 * 일반적인 Queue와 Stack의 기능을 모두 포함하고 있어, 매우 유연한 자료 구조이다.
 *
 * Deque의 대표적인 구현체는 ArrayDeque와 LinkedList가 있다.
 */
public class DequeMain {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(); // LinkedList보다 더 빠르다.
        // Deque<Integer> deque = new LinkedList<>();

        // 데이터 추가
        deque.offerFirst(1);
        System.out.println(deque);
        deque.offerFirst(2);
        System.out.println(deque);
        deque.offerLast(3);
        System.out.println(deque);
        deque.offerLast(4);
        System.out.println(deque);

        // 다음 꺼낼 데이터 확인(꺼내지 않고 단순 조회만)
        System.out.println("deque.peekFirst() = " + deque.peekFirst());
        System.out.println("deque.peekLast() = " + deque.peekLast());

        // 데이터 꺼내기
        System.out.println("deque.pollFirst() = " + deque.pollFirst());
        System.out.println("deque.pollFirst() = " + deque.pollFirst());
        System.out.println("deque.pollLast() = " + deque.pollLast());
        System.out.println("deque.pollLast() = " + deque.pollLast());
        System.out.println(deque);
    }
}

/**
 * ※ Deque 구현체와 성능 테스트
 * ArrayDeque는 특별한 원형 큐 자료 구조를 사용하는 덕분에 앞/뒤 입력 모두 O(1)의 성능을 제공한다.
 * 물론 LinkedList도 앞/뒤 이력 모두 O(1)의 성능을 제공한다.
 *
 * 이론적으로 LinkedList가 삽입 삭제가 자주 발생할 때 더 효율적일 수 있지만,
 * 현대 컴퓨터 시스템의 메모리 접근 패턴, CPU 캐시 최적화 등을 고려할 때
 * 배열을 사용하는 ArrayList가 실제 사용 환경에서 더 나은 성능을 보여주는 경우가 많다.
 *
 * ==============================
 * ★ 100만 건 입력(앞,뒤 평균)
 *     - ArrayDeque: 110ms
 *     - LinkedList: 480ms
 *
 * ★ 100만 건 조회(앞, 뒤 평균)
 *     - ArrayDeque: 9ms
 *     - LinkedList: 20ms
 * ==============================
 */