/**
 *   file: drawFontsJPanel_12_1.java
 */
package c12Examples;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.*;

/**
 * @author atmanning - atmanning@dbq.edu
 *
 */
public class chapter12_3_drawtext extends JFrame {

	chapter12_3_drawtext() { // Constructor
		
		// basic visibility
		this.setTitle("chapter12_3_drawtext not an applet!");
		this.setSize(400, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		// create a JPanel to handle the graphics paint()
		Container c = this.getContentPane();
		
		c.setLayout(new GridLayout(1,1) );  
		// needed for proper display of myJPanel
		
		
		c.add(new myJPanel());

	}// end constructor

	class myJPanel extends JPanel {

		@Override
		public void paint(Graphics g) {
			// always call the superclass paint method first
			super.paint(g);

			// now do our work

			// Graphics g = this.getGraphics(); // needed for any graphics in a JFrame
	        g.setColor(Color.red);
	        g.setFont(new Font("Courier", Font.BOLD, 24));
	        g.drawString("Welcome to Java Programming", 30, 40);


		}

	} // end class myJPanel

}
