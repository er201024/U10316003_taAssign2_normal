import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Geometry extends JFrame{
	//new object
	SimpleCircle Circle= new SimpleCircle();
	Rectangle SimpleRectangle= new Rectangle();
	Triangle SimpleTriangle= new Triangle();
	
	public Geometry() {
		//add panel
		add(Circle,BorderLayout.NORTH);
		add(SimpleRectangle,BorderLayout.CENTER);
		add(SimpleTriangle,BorderLayout.SOUTH);
		
	}
	/** Main method */
	public static void main(String[] args) {
		JFrame frame = new Geometry();
		frame.setTitle("U10316003_GeoCalculate");
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		}
}
