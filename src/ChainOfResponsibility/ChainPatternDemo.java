package ChainOfResponsibility;

import java.util.AbstractCollection;

/**
 * Created by Xiaojun YU on 2017-02-28.
 */
public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

    public static void main(String[] args){
        AbstractLogger loggerChian = getChainOfLoggers();

        loggerChian.logMessage(AbstractLogger.INFO, "This is an information");
        loggerChian.logMessage(AbstractLogger.ERROR, "This is an error");
    }



}
