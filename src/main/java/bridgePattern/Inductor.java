package bridgePattern;

public class
Inductor implements Component {
    private final static double price=3.0;
    private double x;
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

    public Inductor(double x) {
        this.x = x;
        this.name = new String("Inductor");
    }

    @Override
    public void printInformation() {
        System.out.println("inductance is: " + x);
    }

    @Override
    public String getBreed() {
        return name;
    }
    public double getPrice(){
        return price;
    }
}
