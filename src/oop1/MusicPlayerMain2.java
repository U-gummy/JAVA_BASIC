package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        // 플레이어 켜기
        on(data);
        //볼륨 증가
        volumeUp(data);
        //볼륨 증가
        volumeUp(data);
        //볼륨 감소
        volumeDown(data);
        // 플레이어 상태
        showStats(data);
        // 플레이어 종료
        off(data);
    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악플레이어를 시작");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악플레이어를 종료");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨" + data.volume);
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨" + data.volume);
    }

    static void showStats(MusicPlayerData data) {

        System.out.println("음악플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악플레이어 On");
        } else {
            System.out.println("음악플레이어 Off");
        }
    }
}
