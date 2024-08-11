public class Main {
    public static void main(String[] args) {
        DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
        DatabaseConnection databaseConnection2 =  DatabaseConnection.getInstance();

        System.out.println(databaseConnection);

        databaseConnection2.setUrl("localhost:27018");

        /*
        databaseConnection2 changes will be reflected
        in databaseConnection1 as both of them use same object.
         */
        System.out.println(databaseConnection);

    }
}