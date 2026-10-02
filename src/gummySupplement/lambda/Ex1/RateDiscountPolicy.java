package gummySupplement.lambda.Ex1;

public class RateDiscountPolicy implements DiscountPolicy {
    @Override
    public int discount(int price) {
        System.out.println("정율할인");
        double num = price * 0.1;
        return price - ((int) num);
    }
}
