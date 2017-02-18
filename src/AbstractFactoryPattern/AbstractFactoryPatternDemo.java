package AbstractFactoryPattern;

/**
 * Created by Xiaojun YU on 2017-02-18.
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args){
        // get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();
    }
}
