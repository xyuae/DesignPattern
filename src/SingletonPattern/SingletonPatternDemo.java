package SingletonPattern;

/**
 * Created by Xiaojun YU on 2017-02-18.
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {

        // illegal construct
        // SingleObject object = new SingleObject();
        //Get the only object avaialble
        SingleObject object = SingleObject.getInstance();

        object.showMessage();
    }
}
