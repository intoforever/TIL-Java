package collection.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Map은 같은 key를 put하면 새로운 갚으로 덮어씌운다.
 */
public class MapMain2 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        // 학생 성적 데이터 추가
        studentMap.put("studentA", 90);
        System.out.println("같은 키에 put1 = " + studentMap);

        studentMap.put("studentA", 100); // 같은 키에 저장시 기존 값 교체
        System.out.println("같은 키에 put2 = " + studentMap);

        // 특정 학생 존재 유무
        boolean containsKey = studentMap.containsKey("studentA");
        System.out.println("containsKey = " + containsKey);

        // 특정 학생의 값 삭제
        studentMap.remove("studentA"); // key를 지우면 value까지 포함해서 entry 전체가 삭제
        System.out.println(studentMap);
    }
}
