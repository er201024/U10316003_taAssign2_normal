import java.awt.event.*;

import javax.swing.*;

import java.awt.*;

import javax.swing.border.*;

public class Triangle extends JPanel{
	//variable
	double Side;
	//create two JPanel
	JPanel Triangle = new JPanel();
	JPanel tb = new JPanel();
	//TextField
	JTextField TriangleSide = new JTextField(2);
	JTextField Area = new JTextField(2);
	JTextField Perimeter = new JTextField(2);
	//button
	JButton jbtCalculate = new JButton("Calculate");
	JButton jbtClear = new JButton("Clear");
	
	Triangle(){
		// Panel Triangle to hold labels and text fields
		Triangle.setLayout(new GridLayout(3,2));
		Triangle.add(new JLabel("Side"));
		Triangle.add(TriangleSide);
		Triangle.add(new JLabel("Area"));
		Triangle.add(Area);
		Triangle.add(new JLabel("Perimeter"));
		Triangle.add(Perimeter);
		tb.add(jbtCalculate);
		tb.add(jbtClear);
		add(Triangle, BorderLayout.WEST);
		add(tb, BorderLayout.EAST);
		//set border title
		setBorder(new TitledBorder("Triangle"));
		//set cursor
		setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
		//set background
		setBackground(new Color(200,253,185));
		// Register listener
		jbtCalculate.addActionListener(new ActionListener(){	
			public void actionPerformed(ActionEvent e) {
				Side= Double.parseDouble(TriangleSide.getText());
				Area.setText(String.format("%.2f",getArea()));
				Perimeter.setText(String.format("%.2f",getPerimeter()));
			}
				
		});
		// Register listener	
		jbtClear.addActionListener(new ActionListener(){	
			public void actionPerformed(ActionEvent e) {
				TriangleSide.setText("");
				Area.setText("");
				Perimeter.setText("");
			}
		});	
			
	 }
	 //Return the area of this Triangle 
	 double getArea() {
	    return Side * Side  * Math.sqrt(3) / 4;
	 }
	 /** Return the perimeter of this Triangle */
	 double getPerimeter() {
		    return 3 * Side;
		  }
}
