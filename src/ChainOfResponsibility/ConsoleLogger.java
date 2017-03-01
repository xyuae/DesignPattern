package ChainOfResponsibility;

/**
 * Created by Xiaojun YU on 2017-02-28.
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console:: Logger: " + message);
    }
}
