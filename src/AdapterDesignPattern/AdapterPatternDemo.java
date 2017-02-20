package AdapterDesignPattern;

/**
 * Created by Xiaojun YU on 2017-02-19.
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "You don't know me anymore.vlc");
    }
}
