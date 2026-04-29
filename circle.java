public class circle {
    private double radius;
    public void setCircle(int radius) {
        this.radius = radius;
    }
    public  double getRadius() {
        return radius;
    }

    public double getArea() {
        double area = Math.PI * getRadius() * getRadius();
        return area;
    }

    public String toString() {
        return "radius is= "+getRadius()+" area is ="+ getArea();
    }
}
