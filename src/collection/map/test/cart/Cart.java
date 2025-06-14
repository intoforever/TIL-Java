package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> cartMap = new HashMap<>();
    
    // 코드 작성
    public void add(Product product, int amount) {
        cartMap.put(product, cartMap.getOrDefault(product, 0) + amount);
    }

    public void minus(Product product, int amount) {
        if (cartMap.get(product) <= amount) {
            cartMap.remove(product);
            return;
        }
        cartMap.put(product, cartMap.get(product) - amount);
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Product product : cartMap.keySet()) {
            System.out.println("상품: " + product + " 수량: " + cartMap.get(product));
        }
    }
}
