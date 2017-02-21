package PrototypeDesignPattern;

/**
 * Created by Xiaojun YU on 2017-02-20.
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        clonedShape.draw();

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        clonedShape2.draw();
    }
}
