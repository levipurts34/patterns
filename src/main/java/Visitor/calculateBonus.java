package Visitor;

public class calculateBonus implements Salaries {

    @Override
    public void visit(Developer developer) {
        System.out.println("developer bonus is 300$");
    }

    @Override
    public void visit(Marketer marketer) {
        System.out.println("marketer bonus is 200$");
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("manager bonus is 100$");
    }
}
