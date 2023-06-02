package Memento;

public class Student {
    private double GPA;
    public void setGPA(double GPA){
        this.GPA=GPA;
    }
    public double getGPA(){
        return GPA;
    }
    public Memento saveToMemento(){
        return new Memento(GPA);
    }
    public void setPreviousGPA(Memento memento){
        GPA=memento.getPreviousGPA();
    }
}
