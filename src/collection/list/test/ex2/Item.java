package collection.list.test.ex2;

/**
 * 문제와 풀이2
 * 문제 - 리스트를 사용한 쇼핑 카트
 *   - ShoppingCartMain 코드가 작동하도록 ShoppingCart 클래스를 완성해라.
 *   - ShoppingCart는 내부에 리스트를 사용해야 한다.
 */
public class Item {
    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getTotalPrice() {
        return price * quantity;
    }
}
