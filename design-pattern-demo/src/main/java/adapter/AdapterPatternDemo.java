package adapter;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-29
 **/
public class AdapterPatternDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "mp3File");
        audioPlayer.play("mp4", "mp4File");
        audioPlayer.play("vlc", "vlcFile");
        audioPlayer.play("avi", "aviFile");
    }

}
