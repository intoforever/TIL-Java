package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 1. Map의 key는 중복을 허용하지 않는다.
 * 2. Map은 Collection 인터페이스와 관련이 없다.
 *    (선형 자료구조인 Collection과 다른 자료구조임)
 * 3. Entry: key-value를 하나의 쌍으로 묶은 객체
 *    (Entry는 Map 내부에 있는 인터페이스다. 우리는 못보는 구현체로 구현되어 있다.)
 */
public class MapMain1 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        // 학생 성적 데이터 추가
        studentMap.put("studentA", 90);
        studentMap.put("studentB", 80);
        studentMap.put("studentC", 80);
        studentMap.put("studentD", 100);
        System.out.println(studentMap);

        // 특정 학생의 값 조회
        Integer result = studentMap.get("studentD");
        System.out.println("result = " + result);

        // keySet 활용
        Set<String> keySet = studentMap.keySet(); // key는 고유하고, 순서는 중요하지 않다. => Set
        for (String key : keySet) {
            Integer value = studentMap.get(key);
            System.out.println("key = " + key + ", value = " + value);
        }

        // entrySet 활용
        Set<Map.Entry<String, Integer>> entrySet = studentMap.entrySet(); //
        for (Map.Entry<String, Integer> entry : entrySet) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key = " + key + ", value = " + value);
        }

        // values 활용
        Collection<Integer> values = studentMap.values(); // Collection을 반환 (중복이 될 수도 있고, 순서를 보장하지도 않아서 set/list 둘 다 지정하기가 애매)
        for (Integer value : values) {
            System.out.println("value = " + value);
        }
    }
}
