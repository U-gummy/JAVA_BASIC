package gummySupplement.collections.ex;

import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 7, 2, 9, 5);
        // 코드 작성

        int sum = 0;
        double max = 0;

        for (Integer number : numbers) {
            sum += number;
            if (max < number) {
                max = number;
            }
        }
        System.out.println("합계: " + sum);
        System.out.println("최댓값: " + max);
        System.out.println("평균: " + (double) sum / numbers.size());
    }
}