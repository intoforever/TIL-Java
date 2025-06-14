package collection.map.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 문제4 - 값으로 검색
 * - 다음 예제에서 Map에 들어있는 데이터 중에 값이 1000원인 모든 상품을 출력해라.
 * - 실행 결과를 참고하자.
 */
public class ItemPriceTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);

        // 코드 작성
        List<String> list = new ArrayList<>();
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1000) {
                list.add(entry.getKey());
            }
        }

        System.out.println(list);
    }
}
