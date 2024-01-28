package BuilderDesignPattern;

import java.util.List;

public abstract class EmployeeBuilder {
    int rollNumber;
    int age;
    String name;
    String fatherName;
    String motherName;

    public EmployeeBuilder setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }

    public EmployeeBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public EmployeeBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public abstract EmployeeBuilder setSubjects();

    List<String> subjects;

    public Employee build() {
        return new Employee(this);
    }
}
