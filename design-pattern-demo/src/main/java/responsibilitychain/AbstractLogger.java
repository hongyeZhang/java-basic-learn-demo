package responsibilitychain;

/**
 * @program: design-pattern-demo
 * @description: 责任链模式
 * @author: ZHQ
 * @create: 2019-06-30 15:31
 **/
public abstract class AbstractLogger {
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    protected int level;

    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    abstract void writeMessage(String message);

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            writeMessage(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }

    }

}
