package bridgePattern;

public class Circuit implements Electronic {
    private Component com;
    public Circuit(Component com) {
        this.com=com;
    }
    public void printType(){
        System.out.print("i consist of "+com.getBreed()+" and its ");
        com.printInformation();
    }
}

