public class DatabaseConnection {

    private static DatabaseConnection databaseConnection = null;

    private String url;
    // Making constructor private so that it cannot be accessed by external classes
    private DatabaseConnection(String url) {
       setUrl(url);
    }

    /*
    Double locking mechanism helps in achieving thread safety and its less expensive as locking
    will happen only in the first case of concurrency.
     */
    public static DatabaseConnection getInstance() {
        if (databaseConnection == null) {
            // To ensure thread safety
            synchronized (DatabaseConnection.class) {
               if (databaseConnection == null) {
                   databaseConnection = new DatabaseConnection("localhost:27017");
               }
            }
        }
        return databaseConnection;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String toString() {
        return "" + "url : " + this.url;
    }
}
