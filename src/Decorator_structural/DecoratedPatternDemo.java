package Decorator_structural;

/**
 * Created by Xiaojun YU on 2017-03-16.
 */
public class DecoratedPatternDemo {
    public static void main(String[] args) {
        Shape rec = new Rectangle();
        rec.draw();

        Shape redCircle = new RedShapeDecoratorImpl(rec);

        redCircle.draw();
    }
}
