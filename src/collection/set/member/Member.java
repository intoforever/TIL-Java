package collection.set.member;

import java.util.Objects;

/**
 * Member의 경우 회원의 id가 같으면 논리적으로 같은 회원으로 표현할 수 있다.
 * 따라서 회원 id를 기반으로 동등성을 비교하도록 equals를 재정의해야 한다.
 *
 * 여기에 hashCode()도 같은 원리가 적용된다.
 * 회원의 id가 같으면 같은 회원으로 표현할 수 있다.
 * 따라서 회원 id를 기반으로 해서 해시코드를 생성해야 한다.
 */
public class Member {
    private String id;

    public Member(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(id, member.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                '}';
    }
}
