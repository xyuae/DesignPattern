package Observer_behavior;

/**
 * Created by Xiaojun YU on 2017-03-16.
 */
public class BinaryObserver_patternImpl extends Observer_pattern {

    public BinaryObserver_patternImpl(Subject subject) {
        super();
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: "
        + Integer.toBinaryString( subject.getState()));
    }
}
