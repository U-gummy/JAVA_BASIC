package gummySupplement.exception.ex;

public class Ex2 {
    public static void main(String[] args) {
        // setAge(25), setAge(-5)를 순서대로 호출

        try {
            setAge(25);
            setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("에러: " + e.getMessage());
        }


    }

    static void setAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("나이는 0~150 사이여야 합니다: " + age);
        } else {
            System.out.println("나이 설정: " + age);
        }


    }
}
