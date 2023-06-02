package Visitor;

public class Marketer implements Employee {

    @Override
    public void accept(Salaries salaries) {
        salaries.visit(this);
    }
}
