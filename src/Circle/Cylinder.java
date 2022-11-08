package Circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "A Cylinder with height = " + getHeight() + ", which is a subclass of " + super.toString();
    }

    public static class CylinderTest {
        public static void main(String[] args) {
            Cylinder cylinder = new Cylinder(10, 5, "yellow");
            System.out.println(cylinder.toString());
            System.out.println("The height is " + cylinder.getHeight());
            System.out.println("The cylinder volume is " + cylinder.getArea() * cylinder.getHeight());
        }
    }
}
