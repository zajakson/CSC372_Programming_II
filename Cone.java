// Class Cone extending Shape
public class Cone extends Shape {
    private double radius;
    private double height;

    // Constructor to initialize radius and height
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Method to calculate surface area of the cone
    @Override
    public double surfaceArea() {
        double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        return Math.PI * radius * (radius + slantHeight);
    }

    // Method to calculate volume of the cone
    @Override
    public double volume() {
        return (1.0 / 3) * Math.PI * Math.pow(radius, 2) * height;
    }

    // toString method to display the surface area and volume
    @Override
    public String toString() {
        return "Cone [Radius=" + radius + ", Height=" + height + ", Surface Area=" + surfaceArea() + ", Volume=" + volume() + "]";
    }
}
