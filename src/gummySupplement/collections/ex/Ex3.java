package gummySupplement.collections.ex;

import java.util.HashMap;
import java.util.Map;

public class Ex3 {
    public static void main(String[] args) {
        String text = "java spring java stream spring java";
        String[] splitTexts = text.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (String word : splitTexts) {
            map.put(word, map.getOrDefault(word, 0) + 1);

        }

        map.forEach((word, n) -> System.out.println(word + ": " + n));

    }
}
