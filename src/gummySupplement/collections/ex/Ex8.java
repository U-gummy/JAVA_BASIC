package gummySupplement.collections.ex;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Ex8 {
    public static void main(String[] args) {
        List<String> visitors = List.of("park", "kim", "lee", "kim", "park", "choi");

        Set<String> visitorsNameSort = new TreeSet<>(visitors);
        Set<String> visitorsSort = new LinkedHashSet<>(visitors);

        System.out.println("방문자 수: " + visitorsNameSort.size());
        System.out.println("이름순: " + visitorsNameSort);
        System.out.println("방문순: " + visitorsSort);
    }
}
