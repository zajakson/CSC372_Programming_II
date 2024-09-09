// Class Sphere extending Shape
public class Sphere extends Shape {
    private double radius;

    // Constructor to initialize radius
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Method to calculate surface area of the sphere
    @Override
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    // Method to calculate volume of the sphere
    @Override
    public double volume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }

    // toString method to display the surface area and volume
    @Override
    public String toString() {
        return "Sphere [Radius=" + radius + ", Surface Area=" + surfaceArea() + ", Volume=" + volume() + "]";
    }
}
