package PrototypeDesignPattern;

public class Main {
    public static void main(String[] args) {
     Student student = new Student("Nikhil", 23,25);
     Student copy = (Student) student.clone();
    }
}
