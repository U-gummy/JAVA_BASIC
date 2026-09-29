package static2.ex;

public class Car {
    private String name;
    private static int count;

    Car(String name) {
        System.out.println("이름: " + name);
        this.name = name;
        count++;
    }

    static void showTotalCars() {
        System.out.println(count);

    }
}
