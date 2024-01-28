package ProxyDesignPattern;

public interface EmployeeData {
    abstract void create(String clientId, int data) throws Exception;
    abstract void delete(String clientId, int data) throws Exception;
}
