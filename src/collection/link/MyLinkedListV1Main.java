package collection.link;

public class MyLinkedListV1Main {
    public static void main(String[] args) {
        MyLinkedListV1 list = new MyLinkedListV1();
        System.out.println("==데이터 추가==");
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);

        System.out.println("==기능 사용==");
        System.out.println("list.size() = " + list.size()); // .soutv 붙이면 바로 출력 가능
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list.indexOf('c'') = " + list.indexOf("c"));
        System.out.println("list.set(2, 'z') = " + list.set(2, "z")); // 기존값을 반환
        System.out.println(list);

        System.out.println("==범위 초과==");
        list.add("d");
        System.out.println(list);
        list.add("e");
        System.out.println(list);
        list.add("f");
        System.out.println(list);
    }
}
