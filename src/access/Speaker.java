package access;

public class Speaker {
    private int volume;

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량 증가 시킬 수 없음. 최대 음량");
        } else {
            volume += 10;
            System.out.println("음량 10 증가");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("음량 10 down");
    }

    void showVolume() {
        System.out.println("볼륨: " + volume);
    }
}
