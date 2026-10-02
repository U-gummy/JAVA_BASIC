package gummySupplement.lambda.Ex2;

public class DiscountMain {
    public static void main(String[] args) {
        System.out.println("정액할인");
        OrderService fixDiscount = new OrderService(price -> price - 1000);
        fixDiscount.order("노트북", 20000);

        System.out.println("정율할인");
        OrderService reteDiscount = new OrderService(price -> {
            double num = price * 0.1;
            return price - ((int) num);
        });
        reteDiscount.order("노트북", 20000);


        System.out.println("할인없음");
        OrderService noDiscount = new OrderService(price -> price);
        noDiscount.order("노트북", 20000);
    }
}
