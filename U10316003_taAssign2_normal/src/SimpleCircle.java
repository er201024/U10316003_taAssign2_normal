import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class SimpleCircle extends JPanel{
	//variable
	double radius;
	//create two JPanel
	JPanel circle = new JPanel();
	JPanel tb = new JPanel();
	//TextField
	JTextField circleradius = new JTextField(2);
	JTextField Area = new JTextField(2);
	JTextField Perimeter = new JTextField(2);
	//button
	JButton jbtCalculate = new JButton("Calculate");
	JButton jbtClear = new JButton("Clear");
	  
	SimpleCircle(){
		// Panel circle to hold labels and text fields
		circle.setLayout(new GridLayout(3,2));
		circle.add(new JLabel("Radius"));
		circle.add(circleradius);
		circle.add(new JLabel("Area"));
		circle.add(Area);
		circle.add(new JLabel("Perimeter"));
		circle.add(Perimeter);
		tb.add(jbtCalculate);
		tb.add(jbtClear);
		add(circle, BorderLayout.WEST);
		add(tb, BorderLayout.EAST);
		//set border title
		setBorder(new TitledBorder("Circle"));
		//set cursor
		setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
		//set background
		setBackground(new Color(248,190,247));
		// Register listener
		jbtCalculate.addActionListener(new ActionListener(){	
			public void actionPerformed(ActionEvent e) {
				radius= Double.parseDouble(circleradius.getText());
				Area.setText(String.format("%.2f",getArea()));
				Perimeter.setText(String.format("%.2f",getPerimeter()));
			}
			
		});
		// Register listener
		jbtClear.addActionListener(new ActionListener(){	
			public void actionPerformed(ActionEvent e) {
				circleradius.setText("");
				Area.setText("");
				Perimeter.setText("");
			}
			
		});
		
	}
	  //Return the area of this circle 
	  double getArea() {
	    return  radius * radius * Math.PI;
	  }

	  /** Return the perimeter of this circle */
	  double getPerimeter() {
	    return  2 * radius * Math.PI;
	  }

}
	