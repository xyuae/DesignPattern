package Chapter2;

public interface Observer {
    public void update(float temp, float humidity, float pressure);
    // all observers must implement update() method to implement the Observer interface
}
