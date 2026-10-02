package gummySupplement.lambda.Ex1;

public class FixDiscountPolicy implements DiscountPolicy {


    @Override
    public int discount(int price) {
        System.out.println("정액할인");
        return price - 1000;
    }
}
