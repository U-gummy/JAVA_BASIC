package gummySupplement.exception.ex;

import java.util.HashMap;
import java.util.Map;

public class Ex3 {
    static Map<String, Integer> stock = new HashMap<>();

    public static void main(String[] args) {
        stock.put("apple", 10);
        stock.put("banana", 5);

        String[] items = {"apple", "banana", "grape"};
        int[] quantities = {3, 10, 1};

        for (int i = 0; i < items.length; i++) {
            try {
                order(items[i], quantities[i]);
            } catch (RuntimeException e) {
                System.out.println("주문실패: " + e.getMessage());
            }

        }

    }

    public static void order(String item, int quantity) {
        int max = stock.getOrDefault(item, 0);
        if (quantity > max) {
            throw new RuntimeException(item + " " + " 재고 부족 (재고: " + max + ", 요청: " + quantity + ")");
        } else {
            System.out.println(item + " " + quantity + "개 주문 완료 (남은 재고: " + (max - quantity) + ")");
        }
    }
}
