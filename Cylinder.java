// Class Cylinder extending Shape
public class Cylinder extends Shape {
    private double radius;
    private double height;

    // Constructor to initialize radius and height
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Method to calculate surface area of the cylinder
    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // Method to calculate volume of the cylinder
    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    // toString method to display the surface area and volume
    @Override
    public String toString() {
        return "Cylinder [Radius=" + radius + ", Height=" + height + ", Surface Area=" + surfaceArea() + ", Volume=" + volume() + "]";
    }
}
