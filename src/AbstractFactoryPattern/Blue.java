package AbstractFactoryPattern;

/**
 * Created by Xiaojun YU on 2017-02-18.
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside AbstractFactoryPattern.Blue: fill()");
    }
}
