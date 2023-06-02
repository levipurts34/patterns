package Memento;

public class MementoHolder {
    private Memento memento;
    public void saveMemento(Memento memento){
        this.memento=memento;
    }
    public Memento getSavedState(){
        return memento;
    }
}
