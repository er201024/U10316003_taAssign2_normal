import java.awt.event.*;

import javax.swing.*;

import java.awt.*;

import javax.swing.border.*;

public class Rectangle extends JPanel{
	//variable
	double Long;
	double Width;
	//create two JPanel
	JPanel Rectangle = new JPanel();
	JPanel tb = new JPanel();
	//TextField
	JTextField RectangleLong = new JTextField(2);
	JTextField RectangleWidth = new JTextField(2);
	JTextField Area = new JTextField(2);
	JTextField Perimeter = new JTextField(2);
	//button
	JButton jbtCalculate = new JButton("Calculate");
	JButton jbtClear = new JButton("Clear");
	 
	 Rectangle(){
		// Panel Rectangle to hold labels and text fields
		Rectangle.setLayout(new GridLayout(4,2));
		Rectangle.add(new JLabel("Long"));
		Rectangle.add(RectangleLong);
		Rectangle.add(new JLabel("Width"));
		Rectangle.add(RectangleWidth);
		Rectangle.add(new JLabel("Area"));
		Rectangle.add(Area);
		Rectangle.add(new JLabel("Perimeter"));
		Rectangle.add(Perimeter);
		tb.add(jbtCalculate);
		tb.add(jbtClear);
		add(Rectangle, BorderLayout.WEST);
		add(tb, BorderLayout.EAST);
		//set border title
		setBorder(new TitledBorder("Rectangle"));
		//set cursor
		setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
		//set background
		setBackground(new Color(173,198,239));
		// Register listener
		jbtCalculate.addActionListener(new ActionListener(){	
			public void actionPerformed(ActionEvent e) {
				Long= Double.parseDouble(RectangleLong.getText());
				Width= Double.parseDouble(RectangleWidth.getText());
				Area.setText(String.format("%.2f",getArea()));
				Perimeter.setText(String.format("%.2f",getPerimeter()));
			}
				
		});
		// Register listener	
		jbtClear.addActionListener(new ActionListener(){	
			public void actionPerformed(ActionEvent e) {
				RectangleLong.setText("");
				RectangleWidth.setText("");
				Area.setText("");
				Perimeter.setText("");
			}
		});	
			
	 }
	 //Return the area of this Rectangle
	 double getArea() {
	    return Width * Long;
	 }
	 /** Return the perimeter of this Rectangle */
	 double getPerimeter() {
		    return (Width + Long) * 2;
		  }
		  
}
