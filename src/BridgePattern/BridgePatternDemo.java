package BridgePattern;

/**
 * Created by Xiaojun YU on 2017-02-21.
 */
public class BridgePatternDemo {
    public static void main(String[] args){
        Shape redCirle = new Circle(100, 100, 10, new RedCircle());
        redCirle.draw();
        Shape blueSquare = new Square(100, 1000, new BlueSquare());
        blueSquare.draw();
    }
}
