package gummySupplement.exception.ex;

public class Ex1 {
    public static void main(String[] args) {
        String[] inputs = {"10", "abc", "30"};

        int sum = 0;
        for (String input : inputs) {
            try {
                int num = Integer.parseInt(input);
                sum += num;

            } catch (NumberFormatException e) {
                System.out.println("변환실패: " + input);
            }
        }
        System.out.println("합계: " + sum);

    }
}
