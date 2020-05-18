package adapter;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-29
 **/
public class Mp4Player implements AdvancedMediaPlayer {
    public void playVlc(String audioType, String name) {
        // nothing
    }

    public void playMp4(String audioType, String name) {
        System.out.println("play mp4 file, name : " + name);
    }
}
