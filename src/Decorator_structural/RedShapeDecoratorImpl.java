package Decorator_structural;

/**
 * Created by Xiaojun YU on 2017-03-16.
 */
public class RedShapeDecoratorImpl extends ShapeDecorator {
    public RedShapeDecoratorImpl(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
