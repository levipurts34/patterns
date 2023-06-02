package Memento;

public class Memento {
    private double GPA;
    public Memento(double GPA){
        this.GPA=GPA;
    }
    public double getPreviousGPA(){
        return GPA;
    }
}
