package collection.array;

/**
 * 배열 리스트는 마지막에 데이터를 추가하거나 마지막에 있는 데이터를 삭제할 때는 O(1)로 매우 빠르지만,
 * 중간에 데이터를 추가하거나 삭제하는 경우에는 O(n)으로 느리다.
 *
 * 배열 리스트는 보통 데이터를 중간에 추가하고 삭제하는 변경 보다는, 데이터를 순서대로 입력하고 (데이터를 마지막에 추가하고)
 * 순서대로 출력하는 경우에 가장 효율적이다.
 *
 * ※ 배열 리스트의 빅오
 * 1. 데이터 추가
 *     - 마지막에 추가: O(1)
 *     - 앞, 중간에 추가: O(n)
 * 2. 데이터 삭제
 *     - 마지막에 삭제: O(1)
 *     - 앞, 중간에 삭제: O(n)
 * 3. 인덱스 조회: O(1)
 * 4. 데이터 검색: O(n)
 */
public class MyArrayListV3Main {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();

        // 마지막에 추가 // O(1)
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        // 원하는 위치에 추가
        System.out.println("addLast");
        list.add(3, "addLast"); // O(1)
        System.out.println(list);

        System.out.println("addFirst");
        list.add(0, "addFirst"); // O(n)
        System.out.println(list);

        // 삭제
        Object removed1 = list.remove(4);// remove Last O(1)
        System.out.println("removed(4) = " + removed1);
        System.out.println(list);

        Object removed2 = list.remove(0);// remove Frist O(n)
        System.out.println("removed(O) = " + removed2);
        System.out.println(list);
    }
}
