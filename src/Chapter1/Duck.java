package Chapter1;

/**
 * Created by Xiaojun YU on 2017-07-26.
 */
public abstract class Duck {
    // behavior variable declared as interface
    QuackBehavior quackBehavior; // Every duck will reference an object that implement the QuackBehavior interface
    FlyBehavior flyBehavior;

    public Duck() {
        // pass
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys");
    }
    public void performQuack() {
        quackBehavior.quack(); // The duck object delegate the quack behavior to the QuackBehavior interface
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}


