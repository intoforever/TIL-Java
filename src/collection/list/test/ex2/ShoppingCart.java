package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    /**
     * 유지보수성을 가져가는 쪽으로 출력과 합계 분리
     *
     * 장바구니 상품 출력
     * 상품명:마늘, 합계:4000
     * 상품명:상추, 합계:12000
     * 전체 가격 합:16000
     */
    public void displayItems() {
        // 출력
        System.out.println("장바구니 상품 출력");
        for (Item item : items) {
            System.out.println("상품명:" + item.getName() + ", 합계:" + item.getTotalPrice());
        }

        // 합계
        System.out.println("전체 가격 합:" + calculateTotalPrice());
    }

    // 합계는 메소드 뽑기 (Ctrl + Alt + M)
    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
