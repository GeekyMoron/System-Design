package BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class SoftwareEmployeeBuilder extends EmployeeBuilder{
    @Override
    public EmployeeBuilder setSubjects() {
        List<String> subs = new ArrayList<>();
        subs.add("DSA");
        subs.add("OS");
        subs.add("Computer Architecture");
        this.subjects = subs;
        return this;
    }
}
