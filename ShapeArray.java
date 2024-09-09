// Driver class ShapeArray
public class ShapeArray {

    public static void main(String[] args) {
        // Instantiate one sphere, one cylinder, and one cone
        Shape sphere = new Sphere(5.0);
        Shape cylinder = new Cylinder(4.0, 7.0);
        Shape cone = new Cone(3.0, 6.0);

        // Store the class instances into an array
        Shape[] shapeArray = { sphere, cylinder, cone };

        // Loop through the array and print out the details using the toString method
        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
        }
    }
}
