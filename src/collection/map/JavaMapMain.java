package collection.map;

import java.util.*;

/**
 * 해시를 사용해서 키와 값을 저장하는 자료 구조를 일반적으로 해시 테이블(딕셔너리)이라 한다.
 * (자료에서는 Map이라고 부른다.)
 *
 * 앞서 학습한 HashSet은 해시 테이브르이 주요 원리를 사용하지만,
 * 키-값 저장 방식 대신 키만 저장하는 특수한 형태의 해시 테이블로 이해하면 된다.
 *
 * ※ 주의
 * Map의 Key로 사용되는 객체는 hashCode(), equals()를 반드시 구현해야 한다!!!
 */
public class JavaMapMain {
    public static void main(String[] args) {
        run(new HashMap<>());       // O(1) 입력한 순서를 보장하지 않는다.
        run(new LinkedHashMap<>()); // O(1) 키를 기준으로 입력한 순서를 보장한다.
        run(new TreeMap<>());       // O(log N) 키 자체의 데이터 값을 기준으로 정렬한다.
    }

    private static void run(Map<String, Integer> map) {
        System.out.println("map = " + map.getClass());
        map.put("C", 10);
        map.put("B", 20);
        map.put("A", 30);
        map.put("1", 40);
        map.put("2", 50);

        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.print(key + "=" + map.get(key) + " ");
        }
        System.out.println();
        System.out.println();
    }
}
