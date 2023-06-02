package Visitor;

public class CalculateSalaries implements Salaries {

    @Override
    public void visit(Developer developer) {
        System.out.println("salary of developer is 1000$");
    }

    @Override
    public void visit(Marketer marketer) {
        System.out.println("salary of marketer is 900$");
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("salary of manager is 800$");
    }
}
