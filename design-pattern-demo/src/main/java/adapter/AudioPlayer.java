package adapter;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-29
 **/
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    public void play(String audioType, String fieldName) {
        if ("mp3".equalsIgnoreCase(audioType)) {
            System.out.println("playing mp3 file, name = " + fieldName);
        } else if ("mp4".equalsIgnoreCase(audioType) || "vlc".equalsIgnoreCase(audioType)) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fieldName);
        } else {
            throw new RuntimeException(audioType + " format not supported");
        }
    }
}
