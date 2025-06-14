package collection.map.test.member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {
    private Map<String, Member> memberMap = new HashMap<>();

    public void save(Member member) {
        // 코드 작성
        memberMap.put(member.getId(), member);
    }

    public void remove(String id) {
        // 코드 작성
        memberMap.remove(id);
    }

    public Member findById(String id) {
        // 코드 작성
        return memberMap.get(id);
    }

    public Member findByName(String name) {
        // 코드 작성
        for (Map.Entry<String, Member> entry : memberMap.entrySet()) {
            if (entry.getValue().getName().equals(name)) {
                return memberMap.get(entry.getKey());
            }
        }
        return null;
    }
}
