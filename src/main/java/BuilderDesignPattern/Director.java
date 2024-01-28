package BuilderDesignPattern;

public class Director {
    EmployeeBuilder employeeBuilder;

    public Director(EmployeeBuilder employeeBuilder) {
        this.employeeBuilder = employeeBuilder;
    }
     public Employee create(String type) {
        if(type.equals("software"))
        {
            return employeeBuilder.setSubjects().setAge(23).setFatherName("raj").build();
        } else {
            return employeeBuilder.setSubjects().setAge(20).setFatherName("raj").setName("uday").build();
        }
     }
}
