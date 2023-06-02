package Visitor;

public class Manager implements Employee {

    @Override
    public void accept(Salaries salaries) {
        salaries.visit(this);
    }
}
