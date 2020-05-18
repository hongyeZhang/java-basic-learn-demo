package adapter;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-29
 **/
public class VlcPlayer implements AdvancedMediaPlayer {
    public void playVlc(String audioType, String name) {
        System.out.println("playing vlc player, name : " + name);
    }

    public void playMp4(String audioType, String name) {
        // nothing
    }
}
