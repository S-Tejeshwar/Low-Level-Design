public abstract class Logger {

    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;
    Logger nextLogger;
    public Logger(Logger logger) {
        this.nextLogger = logger;
    }

    public abstract void printlog(int severity, String message);

}
