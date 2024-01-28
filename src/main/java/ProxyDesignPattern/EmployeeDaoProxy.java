package ProxyDesignPattern;

// employee proxy object can be used for validation or encrypt or do caching for main object so client faces first this object.
public class EmployeeDaoProxy implements EmployeeData{
    EmployeeDao employeeDao;

    public EmployeeDaoProxy() {
        this.employeeDao = new EmployeeDao();
    }

    @Override
    public void create(String clientId, int data) throws Exception{
     if(clientId.equals("ADMIN"))
         employeeDao.create(clientId,data);
     else
         throw new RuntimeException("Invalid");
    }

    @Override
    public void delete(String clientId,int data) {
        if(clientId.equals("ADMIN"))
            employeeDao.delete(clientId,data);
        else
            throw new RuntimeException("Invalid");
    }
}
