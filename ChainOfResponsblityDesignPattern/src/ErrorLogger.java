public class ErrorLogger extends Logger {

    public ErrorLogger(Logger logger) {
        super(logger);
    }


    @Override
    public void printlog(int severity, String message) {
        if (severity == ERROR) {
            System.out.println("ERROR :  " + message);
        }
    }
}
