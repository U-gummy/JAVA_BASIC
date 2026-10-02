package gummySupplement.lambda.Ex2;

public class OrderService {
    private DiscountPolicy discount;

    OrderService(DiscountPolicy discount) {
        this.discount = discount;
    }

    void order(String item, int price) {
        int discountPrice = discount.discount(price);

        System.out.println(item + "가격: " + price + ", 할인: " + (price - discountPrice) + ", 결제: " + discountPrice);
    }
}

