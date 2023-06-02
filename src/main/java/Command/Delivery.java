package Command;

public class Delivery {
    private ComputerBuilder computerBuilder;
    public void setCommand(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }
    public void executeComm(){
        computerBuilder.buildComputer();
    }
}
