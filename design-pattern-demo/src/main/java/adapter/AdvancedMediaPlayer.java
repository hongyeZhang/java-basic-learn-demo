package adapter;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-29
 **/
public interface AdvancedMediaPlayer {
    void playVlc(String audioType, String name);

    void playMp4(String audioType, String name);
}
