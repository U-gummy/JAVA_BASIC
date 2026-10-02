package gummySupplement.exception;

public class ExceptionApp {
    public static void main(String[] args) {
        System.out.println(1);
        int[] scores = {10, 20, 30};

        try {
            System.out.println(2);
//            System.out.println(scores[3]);
            System.out.println(3);
            System.out.println(2 / 0);
            System.out.println(4);
        } catch (ArithmeticException e) {
            System.out.println("잘못된 계산임미다? " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("뭔가 이상해요. 오류가 발생했어요!!");
        }

//        catch (ArithmeticException e) {
//            System.out.println("잘못된 계산임미다? ");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("없는 값임미다?");
//        }
        System.out.println(5);

    }

}
