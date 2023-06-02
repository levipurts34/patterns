package Decorator;

public class CPU extends MyComputerDecorator{

    public CPU(Computer myComp) {
        super(myComp);

    }
    @Override
    public String getDescription() {
        return getMyComp().getDescription()+" CPU";
    }
}
