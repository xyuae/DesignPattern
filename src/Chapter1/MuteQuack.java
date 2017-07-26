package Chapter1;

/**
 * Created by Xiaojun YU on 2017-07-26.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}

