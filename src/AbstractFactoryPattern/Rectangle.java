package AbstractFactoryPattern;

/**
 * Created by Xiaojun YU on 2017-02-18.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside AbstractFactoryPattern.Rectangle:: draw() method");
    }
}
