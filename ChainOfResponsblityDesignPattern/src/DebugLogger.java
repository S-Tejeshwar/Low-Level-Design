public class DebugLogger extends Logger{
    public DebugLogger(Logger logger) {
        super(logger);
    }
    @Override
    public void printlog(int severity, String message) {
        if (severity == DEBUG) {
            System.out.println("DEBUG : " + message);
        } else {
            nextLogger.printlog(severity, message);
        }
    }
}
