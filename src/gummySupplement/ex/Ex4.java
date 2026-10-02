package gummySupplement.ex;

import com.sun.tools.jconsole.JConsoleContext;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex4 {
    public static void main(String[] args) {
        String[][] students = {
                {"2반", "lee"},
                {"1반", "kim"},
                {"3반", "choi"},
                {"1반", "park"},
                {"2반", "jung"}
        };

        Map<String, List<String>> byClass = new HashMap<>();

        for (String[] student : students) {
            String className = student[0];
            String name = student[1];


            if (!byClass.containsKey(className)) {
                byClass.put(className, new ArrayList<>());
            }
            byClass.get(className).add(name);
        }

        System.out.println(byClass);
    }
}
