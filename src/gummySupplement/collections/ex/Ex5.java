package gummySupplement.collections.ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex5 {
    public static void main(String[] args) {
        Map<String, Integer> stock = new HashMap<>();
        stock.put("apple", 10);
        stock.put("banana", 5);

        List<String> orders = List.of("apple", "grape");
        List<String> soldOut = new ArrayList<>();

        for (String item : orders) {
            int count = stock.getOrDefault(item, 0);
            if (count == 0) {
                soldOut.add(item);
            }
        }
        System.out.println("품절: " + soldOut);
    }

}
