package gummySupplement.ex;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex2 {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "apple", "cherry", "banana");

        Set<String> strings = new HashSet<>(fruits);
        System.out.println("중복 제거: " + strings);
        System.out.println("개수: " + strings.size());


    }


}
