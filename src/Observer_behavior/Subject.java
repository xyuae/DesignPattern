package Observer_behavior;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Xiaojun YU on 2017-03-16.
 */
public class Subject {
    private List<Observer_pattern> observers = new ArrayList<>();
    private int state;


    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer_pattern observer) {
        observers.add(observer);
    }

    private void notifyAllObservers() {
        for (Observer_pattern observer : observers) {
            observer.update();
        }
    }
}
