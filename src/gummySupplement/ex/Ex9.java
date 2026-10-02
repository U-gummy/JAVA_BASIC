package gummySupplement.ex;

import java.util.LinkedHashMap;
import java.util.Map;

public class Ex9 {
    public static void main(String[] args) {
        String[] orders = {"americano", "latte", "americano", "mocha", "latte", "americano"};

        Map<String, Integer> orderCount = new LinkedHashMap<>();


        for (String order : orders) {

            orderCount.put(order, orderCount.getOrDefault(order, 0) + 1);


        }
        System.out.println(orderCount);

        int max = 0;
        String bestMenu = "";

        for (Map.Entry<String, Integer> entry : orderCount.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            if (max < value) {
                max = value;
                bestMenu = key;
            }
        }

        System.out.println("가장 많이 팔린 메뉴: " + bestMenu + " (" + max + ")");
    }
}
