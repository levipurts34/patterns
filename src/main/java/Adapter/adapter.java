package Adapter;

public class adapter implements Volume{
    private Area area;
    private double length;
    private double width;
    private double height;
    public adapter(double length, double width, double height) {
        this.area = new Area();
        this.length=length;
        this.height=height;
        this.width=width;
    }
    @Override
    public double countVolume() {
        return area.countArea(length,width)*height;
    }
}
