package collection.link;

/**
 * 배열 리스트: 데이터를 조회할 일이 많고, 뒷 부분에 데이터를 추가/삭제한다면 보통 더 좋은 성능을 제공
 * 연결 리스트: 앞쪽의 데이터를 추가하거나 삭제할 일이 많다면 보통 더 좋은 성능을 제공
 */
public class MyLinkedListV2Main {
    public static void main(String[] args) {
        MyLinkedListV2 list = new MyLinkedListV2();

        // 마지막에 추가 O(n)
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        // 첫 번째 항목에 추가, 삭제
        System.out.println("첫 번째 항목에 추가");
        list.add(0, "d"); // O(1)
        System.out.println(list);

        System.out.println("첫 번째 항목에 삭제");
        list.remove(0); // remove First O(1)
        System.out.println(list);

        // 중간 항목에 추가, 삭제
        System.out.println("중간 항목에 추가");
        list.add(1, "e"); // O(n)
        System.out.println(list);

        System.out.println("중간 항목에 삭제");
        list.remove(1); // remove O(n)
        System.out.println(list);
    }
}
