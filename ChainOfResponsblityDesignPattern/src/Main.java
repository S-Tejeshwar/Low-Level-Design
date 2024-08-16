public class Main {
    public static void main(String[] args) {
        Logger logger =
                new InfoLogger(new DebugLogger(new ErrorLogger(null)));

        logger.printlog(Logger.DEBUG, "debugging");
        logger.printlog(Logger.INFO, "info");
        logger.printlog(Logger.ERROR, "error");
    }
}