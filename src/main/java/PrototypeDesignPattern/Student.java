package PrototypeDesignPattern;

public class Student implements Prototype{
    public Student(String name, int rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }

    private String name;
    private int rollNumber;
    private int age;

    @Override
    public Prototype clone() {
        return new Student(name,rollNumber,age);
    }
}
