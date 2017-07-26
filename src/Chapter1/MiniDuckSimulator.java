package Chapter1;

/**
 * Created by Xiaojun YU on 2017-07-26.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack(); // This calls the inherited performQuack() method, and delegate the corresponding QuackBehavior object to perform behavior
        mallard.performFly();
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
