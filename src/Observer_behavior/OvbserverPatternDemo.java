package Observer_behavior;

/**
 * Created by Xiaojun YU on 2017-03-16.
 */
public class OvbserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new BinaryObserver_patternImpl(subject);
        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
