package Decorator;

public class RAM extends MyComputerDecorator{
    public RAM(Computer myComp) {
        super(myComp);
    }
    @Override
    public String getDescription() {
        return getMyComp().getDescription()+" RAM";
    }
}
