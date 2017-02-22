package BridgePattern;

/**
 * Created by Xiaojun YU on 2017-02-21.
 */
public class BlueSquare implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        // do nothing
    }

    @Override
    public void drawSquare(int x, int y) {
        System.out.print("PLot blue square!");
    }
}
