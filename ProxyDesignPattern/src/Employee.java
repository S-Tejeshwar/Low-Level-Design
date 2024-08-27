public interface Employee {

    public void createEmployee(String client, int employeeId) throws Exception;
    public void deleteEmployee(String client, int employeeId) throws Exception;
    public Employee getEmployee(String client, int employeeId) throws Exception;
}
