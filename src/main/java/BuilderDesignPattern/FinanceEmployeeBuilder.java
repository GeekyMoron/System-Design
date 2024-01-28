package BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class FinanceEmployeeBuilder extends EmployeeBuilder{
    @Override
    public EmployeeBuilder setSubjects() {
        List<String> subs = new ArrayList<>();
        subs.add("Micro Economics");
        subs.add("Business Studies");
        subs.add("Operations Management");
        this.subjects = subs;
        return this;
    }
}
