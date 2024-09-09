import javax.swing.*;
import java.awt.*;

public class ShapePanel {
    public static void main(String[] args) {

        // Create a frame
        JFrame frame = new JFrame("Shape Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel to hold the menu and text box
        JPanel panel = new JPanel();
        frame.add(panel, BorderLayout.CENTER);

        //Input Fields

        // Create a radius instruction text box
        JTextArea radiusInstructionArea = new JTextArea(1, 15);
        radiusInstructionArea.setEditable(false); // Static text box, unchangeable.

        // Create a radius text box
        JTextArea radiusArea = new JTextArea(1, 15);
        radiusArea.setEditable(true); // Static text box, unchangeable.

        // Create a height text box
        JTextArea heightInstructionArea = new JTextArea(1, 15);
        heightInstructionArea.setEditable(false); // Static text box, unchangeable.

        // Create a height text box
        JTextArea heightText = new JTextArea(1, 15);
        heightText.setEditable(true); // Static text box, unchangeable.

        //output fields
        
        //sphere
        JTextArea sphereHeader = new JTextArea(1,10);
        sphereHeader.setEditable(false);
        JTextArea sphereOutput = new JTextArea(1, 20); 
        sphereOutput.setEditable(false);

        //cylinder
        JTextArea cylinderHeader = new JTextArea(1,10);
        cylinderHeader.setEditable(false);
        JTextArea cylinderOutput = new JTextArea(1, 20); 
        cylinderOutput.setEditable(false);
        
        //cone
        JTextArea coneHeader = new JTextArea(1,10);
        coneHeader.setEditable(false);
        JTextArea coneOutput = new JTextArea(1, 20); 
        coneOutput.setEditable(false);

        // Add components to panel
        //radius 
        panel.add(radiusInstructionArea);
        radiusInstructionArea.setText("Enter the radius:");
        panel.add(radiusArea);

        //height 
        panel.add(heightInstructionArea);
        heightInstructionArea.setText("Enter the height (if applicable):");
        panel.add(heightText);

        //sphere
        panel.add(sphereHeader);
        sphereHeader.setText("sphere data:");
        panel.add(sphereOutput);

        //cylinder
        panel.add(cylinderHeader);
        cylinderHeader.setText("cylinder data:");
        panel.add(cylinderOutput);
    
        //cone
        panel.add(coneHeader);
        coneHeader.setText("Cone data:");
        panel.add(coneOutput);

        // Create a menu bar
        JMenuBar menubar = new JMenuBar();
        frame.setJMenuBar(menubar);

        // Create menus and add options
        JMenu fileMenu = new JMenu("File");
        menubar.add(fileMenu);
        JMenuItem menuItem1 = new JMenuItem("Calculate Shape");
        JMenuItem menuItem4 = new JMenuItem("Exit");

        fileMenu.add(menuItem1);
        fileMenu.addSeparator();
        fileMenu.add(menuItem4);

        // Date and Time
        menuItem1.addActionListener(e -> {
        // Instantiate one sphere, one cylinder, and one cone

        double radius = Double.parseDouble(radiusArea.getText());
        double height = Double.parseDouble(heightText.getText());

        Shape sphere = new Sphere(radius);
        Shape cylinder = new Cylinder(radius, height);
        Shape cone = new Cone(radius, height);

        
        // Store the class instances into an array
        Shape[] shapeArray = { sphere, cylinder, cone };

        //MAP - OUTPUTS IN TERMINAL
        // Loop through the array and print out the details using the toString method
        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
        }   

        //OUTPUTS IN J PANEL
        sphereOutput.setText(shapeArray[0] + "");
        cylinderOutput.setText(shapeArray[1] + "");
        coneOutput.setText(shapeArray[2]+"");

        });

        // Exit the JFrame
        menuItem4.addActionListener(e -> {
            System.exit(0);
        });

        // Overall frame size
        frame.setSize(400, 220);
        frame.setVisible(true);
    }
}
