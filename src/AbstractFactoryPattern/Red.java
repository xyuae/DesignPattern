package AbstractFactoryPattern;

/**
 * Created by Xiaojun YU on 2017-02-18.
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside AbstractFactoryPattern.Red: fill()");
    }
}
