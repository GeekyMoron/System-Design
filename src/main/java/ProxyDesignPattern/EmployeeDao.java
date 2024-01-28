package ProxyDesignPattern;

public class EmployeeDao implements EmployeeData{

    @Override
    public void create(String clientId, int data) {
        System.out.println("Adding employee data");
    }

    @Override
    public void delete(String clientId, int data) {
        System.out.println("delete employee data");
    }
}
