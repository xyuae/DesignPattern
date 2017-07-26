package Chapter2;

/**
 * Created by Xiaojun YU on 2017-07-26.
 */

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
