package poly.ex4;

public class AbstractMain {
    public static void main(String[] args) {
        // 추상클래스 생성 불가
        //abstractAnimal animal = new AbstractAnimal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        cat.sound();
        cat.move();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
        
        moveAnimal(dog);
        moveAnimal(cat);
        moveAnimal(caw);
    }

    // 변하지 않는 부분
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물소리테스트시작");
        animal.sound();
        System.out.println("동물소리테스트종료");
        System.out.println("");
    }

    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("동물이동시작");
        animal.move();
        System.out.println("동물이동종료");
        System.out.println("");
    }


}
