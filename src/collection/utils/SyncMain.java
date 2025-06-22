package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 멀티스레드 동기화
 *
 * Collections.synchronizedList를 사용하면
 * 일반 리스트를 멀티스레드 상황에서 동기화 문제가 발생하지 않는 안전한 리스트로 만들 수 있다.
 *
 * 동기화 작업으로 인해 일반 리스트보다 성능은 더 느리다.
 */
public class SyncMain {

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        // 쓰레드1
        list.add(1);
        list.add(2);
        list.add(3);

        // 쓰레드2
        list.remove(1);

        System.out.println("list class = " + list.getClass());
        List<Object> synchronizedList = Collections.synchronizedList(list); // 첫 번째 작업이 다 끝나야지만 두 번째 작업이 시작됨
        System.out.println("synchronizedList class = " + synchronizedList.getClass());
    }
}
