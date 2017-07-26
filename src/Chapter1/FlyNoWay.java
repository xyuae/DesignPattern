package Chapter1;

/**
 * Created by Xiaojun YU on 2017-07-26.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!"); // implementation for the fly behavior for duck that can't fly
    }
}
