package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        ProductOrder product1 = new ProductOrder();
        product1.productName = "두부";
        product1.price = 2000;
        product1.quantity = 2;
        orders[0] = product1;


        ProductOrder product2 = new ProductOrder();
        product2.productName = "콜라";
        product2.price = 1500;
        product2.quantity = 2;
        orders[1] = product2;

        ProductOrder product3 = new ProductOrder();
        product3.productName = "김치";
        product3.price = 5000;
        product3.quantity = 1;
        orders[2] = product3;

        int sum = 0;
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + " 가격: " + order.price + " 수량: " + order.quantity);
            sum += order.price * order.quantity;
        }
        System.out.println("총 결제 금액: " + sum);
    }

}
