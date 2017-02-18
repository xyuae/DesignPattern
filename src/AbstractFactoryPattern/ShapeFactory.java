package AbstractFactoryPattern;

/**
 * Created by Xiaojun YU on 2017-02-18.
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        if (shape == null){
            return null;
        }
        if (shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shape.equalsIgnoreCase("RECTANGULAR")){
            return new Rectangle();
        }
        else if (shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
