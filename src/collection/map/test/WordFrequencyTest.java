package collection.map.test;

import java.util.HashMap;
import java.util.Map;

/**
 * 문제3 - 같은 단어가 나타난 수
 * - 각각의 단어가 나타난 수를 출력해라.
 * - 실행 결과를 참고하자.
 */
public class WordFrequencyTest {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        
        // 코드 작성
        String[] words = text.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            Integer count = map.get(word);
            if (count == null) {
                count = 0;
            }
            count++;
            map.put(word, count);
        }

        System.out.println(map);
    }
}
