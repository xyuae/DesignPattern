package ChainOfResponsibility;

/**
 * Created by Xiaojun YU on 2017-02-28.
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console:: Logger: " + message);
    }
}
