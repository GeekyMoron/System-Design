package ProxyDesignPattern;

public class Main {
    public static void main(String[] args) throws Exception {
        EmployeeData employeeData = new EmployeeDaoProxy();
        employeeData.create("ADMIN",23);
    }
}
