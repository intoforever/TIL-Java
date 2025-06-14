package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 문제2 - 공통의 합
 * - map1과 map2에 공통으로 들어가는 키를 찾고, 그 값의 합을 구해라.
 * - 실행 결과를 참고하자
 */
public class CommonKeyValueSum1 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);

        // 코드 작성
        Set<String> keySet = map1.keySet();
        keySet.retainAll(map2.keySet());

        Map<String, Integer> map3 = new HashMap<>();
        for (String key : keySet) {
            map3.put(key, (map1.get(key) + map2.get(key)));
        }
        
        System.out.println(map3);
    }
}
