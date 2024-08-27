public class EmployeeProxy implements Employee{

    Employee employee = new EmployeeImpl();
    @Override
    public void createEmployee(String client, int employeeId) throws Exception {
        if (client.equals("ADMIN")) {
            employee.createEmployee(client, employeeId);
        } else {
            throw  new Exception("Access denied");
        }
    }

    @Override
    public void deleteEmployee(String client, int employeeId) throws Exception {
        if (client.equals("ADMIN")) {
            employee.deleteEmployee(client, employeeId);
        } else {
            throw  new Exception("Access denied");
        }
    }

    @Override
    public Employee getEmployee(String client, int employeeId) throws Exception {
        if (client.equals("ADMIN") || client.equals("USER")) {
            return employee.getEmployee(client, employeeId);
        } else {
            throw  new Exception("Access denied");
        }
    }

}
