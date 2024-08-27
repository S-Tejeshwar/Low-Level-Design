public class EmployeeImpl implements Employee{
    @Override
    public void createEmployee(String client, int employeeId) throws Exception{
        System.out.println("Employee created for id" + employeeId);
    }

    @Override
    public void deleteEmployee(String client, int employeeId) {
         System.out.println("Employee deleted for id" + employeeId);
    }

    @Override
    public Employee getEmployee(String client, int employeeId) {
        System.out.println("Fetching employee details for id" + employeeId);
        return new EmployeeImpl();
    }
}
