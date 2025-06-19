package collection.compare;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 비교자(Comparator)를 사용하면 정렬의 기준을 자유롭게 변경할 수 있다.
 *
 * Arrays.sort()를 사용할 때 비교자(Comparator)를 넘겨주면
 * 알고리즘에서 어떤 값이 더 큰지 두 값을 비교할 때 비교자를 사용한다.
 *
 * ※ reversed()
 * 정렬을 반대로 하고 싶으면 reversed() 메소드를 사용하면 된다.
 * 이렇게 하면 비교의 결과를 반대로 변경한다. (-1을 곱한 것과 같은 결과)
 */
public class SortMain2 {
    public static void main(String[] args) {
        Integer[] array = {3, 2, 1};
        System.out.println(Arrays.toString(array));
        System.out.println("Comparator 비교");
        Arrays.sort(array, new AscComparator());
        System.out.println("AscComparator: " + Arrays.toString(array));

        Arrays.sort(array, new DescComparator());
        System.out.println("DescComparator: " + Arrays.toString(array));
        Arrays.sort(array, new AscComparator().reversed()); // DescComparator와 같다.
        System.out.println("AscComparator.reversed: " + Arrays.toString(array));
    }

    static class AscComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1=" + o1 + " o2=" + o2);
            return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1);
        }
    }

    static class DescComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1=" + o1 + " o2=" + o2);
            return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1) * -1;
        }
    }
}
