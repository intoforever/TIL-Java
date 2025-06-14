package collection.map.test;

import java.util.HashMap;
import java.util.Map;

/**
 * Map을 생성할 때 Map.of()를 사용하면 편리하게 Map을 생성할 수 있다.
 * Map.of()를 사용해서 생성한 Map은 불변이다. 따라서 내용을 변경할 수 없다.
 */
public class CommonKeyValueSum2 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("A", 1,
                                            "B", 2,
                                            "C", 3);

        Map<String, Integer> map2 = Map.of("B", 4,
                                            "C", 5,
                                            "D", 6);

        // 코드 작성
        Map<String, Integer> result = new HashMap<>();
        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                result.put(key, map1.get(key) + map2.get(key));
            }
        }
        System.out.println(result);
    }
}
