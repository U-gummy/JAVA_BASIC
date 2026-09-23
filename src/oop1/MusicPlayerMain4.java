package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer data = new MusicPlayer();

        // 플레이어 켜기
        data.on();
        //볼륨 증가
        data.volumeUp();
        //볼륨 증가
        data.volumeUp();
        //볼륨 감소
        data.volumeDown();
        // 플레이어 상태
        data.showStats();
        // 플레이어 종료
        data.off();
    }

}
