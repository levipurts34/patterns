package Visitor;

public interface Salaries {
    void visit(Developer developer);
    void visit(Marketer marketer);
    void visit(Manager manager);
}

