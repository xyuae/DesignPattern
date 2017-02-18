package AbstractFactoryPattern;

/**
 * Created by Xiaojun YU on 2017-02-18.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }
        else if (choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return  null;
    }
}
