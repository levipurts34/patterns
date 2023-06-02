package Visitor;

public class Developer implements Employee {

    @Override
    public void accept(Salaries salaries) {
        salaries.visit(this);
    }
}
