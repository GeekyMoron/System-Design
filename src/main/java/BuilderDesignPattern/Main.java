package BuilderDesignPattern;

public class Main {
    public static void main(String[] args) {
        Employee e = new Director(new FinanceEmployeeBuilder()).create("finance");
        System.out.println(e.fatherName);
        System.out.println(e.motherName);
    }
}
