package gummySupplement.ex;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Ex7 {
    public static void main(String[] args) {
        Map<String, Integer> scores = new LinkedHashMap<>();

        scores.put("kim", 80);
        scores.put("lee", 95);
        scores.put("park", 70);

        System.out.println("kim 점수: " + scores.get("kim"));
        System.out.println("choi 점수: " + scores.getOrDefault("choi", 0));

        scores.put("kim", 90);


        scores.forEach((name, score) -> System.out.println(name + ": " + score));


    }
}
