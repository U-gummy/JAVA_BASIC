package gummySupplement.lambda;

public class Lambda {
    public static void main(String[] args) {
        Calculator multiply = (a, b) -> {
            return a * b;
        };


        NumberCheck add = (a) -> {
            return a % 2 == 0;
        };

        System.out.println(add.check(1));
    }

}
