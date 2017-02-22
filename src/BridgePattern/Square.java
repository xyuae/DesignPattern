package BridgePattern;

/**
 * Created by Xiaojun YU on 2017-02-21.
 */
public class Square extends Shape{
    private int x, y;
    public Square(int x, int y, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawAPI.drawSquare(x, y);
    }
}
