package gummySupplement.lambda.Ex1;

public class DiscountMain {
    public static void main(String[] args) {
        OrderService fixDiscount = new OrderService(new FixDiscountPolicy());
        fixDiscount.order("노트북", 20000);

        OrderService ReteDiscount = new OrderService(new RateDiscountPolicy());
        ReteDiscount.order("노트북", 20000);
    }
}
