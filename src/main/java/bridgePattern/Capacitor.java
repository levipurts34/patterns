package bridgePattern;

public class Capacitor implements Component{
    private final static double price=6.0;
    private double x;
    public double getPrice(){
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    public Capacitor(double x) {
        this.x=x;
        this.name=new String("Capacitor");
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    @Override
    public void printInformation() {
        System.out.println("capacity is: "+x);
    }

    @Override
    public String getBreed() {
        return name;
    }
}
