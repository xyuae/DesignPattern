package AbstractFactoryPattern;

/**
 * Created by Xiaojun YU on 2017-02-18.
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside AbstractFactoryPattern.Green: fill()");
    }
}
