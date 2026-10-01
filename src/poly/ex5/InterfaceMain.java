package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
        // 인터 페이스 생성 불가
        //InterfaceAnimal animal = new InterfaceAnimal();

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

    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물소리테스트시작");
        animal.sound();
        System.out.println("동물소리테스트종료");
        System.out.println("");
    }

    private static void moveAnimal(InterfaceAnimal animal) {
        System.out.println("동물이동시작");
        animal.move();
        System.out.println("동물이동종료");
        System.out.println("");
    }
}
