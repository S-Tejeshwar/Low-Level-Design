public class InfoLogger extends Logger{

    public InfoLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void printlog(int severity, String message) {
        if (severity == INFO) {
            System.out.println("INFO : " + message);
        } else {
            nextLogger.printlog(severity, message);
        }
    }
}
