package ProxyPattern;

/**
 * Created by Xiaojun YU on 2017-02-27.
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");
        // image loaded from disk
        image.display();
        // image not loaded from disk
        image.display();

    }
}
