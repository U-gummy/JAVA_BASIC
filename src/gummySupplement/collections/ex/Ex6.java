package gummySupplement.collections.ex;

import java.util.ArrayList;
import java.util.List;

public class Ex6 {
    public static void main(String[] args) {
        List<String> menu = new ArrayList<>();
        menu.add("김밥");
        menu.add("떡볶이");
        menu.add("라면");
        System.out.println("전체메뉴: " + menu);
        System.out.println("1메뉴: " + menu.get(1));
        System.out.println("라면 있음: " + menu.contains("라면"));

        menu.remove("김밥");

        System.out.println("menu = " + menu);
        System.out.println("개수: " + menu.size());

    }

}
