package bridgePattern;

public class Resistor implements Component {
    private final static double price=5.0;
    double x;
    private String name;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Resistor(double x) {
        this.x = x;
        this.name = new String("Resistor");
    }

    @Override
    public void printInformation() {
        System.out.println("resistence is: " + x);
    }

    @Override
    public String getBreed() {
        return name;
    }
    public double getPrice(){
        return price;
    }
}
