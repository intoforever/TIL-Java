package collection.compare;

/**
 * Comparable을 통해 구현한 순서를 자연 순서(Natural Ordering)라 한다.
 */
public class MyUser implements Comparable<MyUser> {
    private String id;
    private int age;

    public MyUser(String id, int age) {
        this.id = id;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(MyUser o) {
        // System.out.println(this + " vs " + o);
        return this.age < o.age ? -1 : (this.age == o.age ? 0 : 1);
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "id='" + id + '\'' +
                ", age=" + age +
                '}';
    }
}
