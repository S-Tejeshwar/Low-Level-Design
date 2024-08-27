public class Main {
    public static void main(String[] args) throws Exception {

        Employee employee = new EmployeeProxy();
        employee.createEmployee("ADMIN", 1);
        employee.getEmployee("USER", 1);
        employee.deleteEmployee("ADMIN", 1);
        employee.deleteEmployee("USER", 1);
    }
}