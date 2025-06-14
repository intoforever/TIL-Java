package collection.map.test.member;

import java.util.Objects;

/**
 * 문제6 - 회원 관리 저장소
 * - Map을 사용해서 회원을 저장하고 관리하는 MemberRepository 코드를 완성하자.
 * - Member, MemberRepositoryMain 코드와 실행결과를 참고하자.
 */
public class Member {
    private String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(id, member.id) && Objects.equals(name, member.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
