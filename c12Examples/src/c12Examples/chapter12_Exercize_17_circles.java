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
public class chapter12_Exercize_17_circles extends JFrame {

	chapter12_Exercize_17_circles() { // Constructor

		// basic visibility
		this.setTitle(this.getClass().getSimpleName());
		this.setSize(400, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		// create a JPanel to handle the graphics paint()
		Container c = this.getContentPane();

		c.setLayout(new GridLayout(1, 1));
		// needed for proper display of myJPanel

		c.add(new myJPanel());

	}// end constructor

	class myJPanel extends JPanel {

		private final int SIZE = 200;

		@Override
		public void paint(Graphics g) {

			// draw the graphics as specified in 
			// Malik Java book chapter 12 Exercise 17
			// parent
			super.paint(g);

			// determine filled oval locations from 
			// dimensions of this JPanel
			// set the size of the outermost circle based
			// on the size of this JPanel 
			// use g.getClipBounds() 
			// draw large outer red filled oval, then 
			// subsequent filled ovals will alternate in color
			// Color.RED and Color.WHITE
			
			
		} // end paint()

	} // end class myJPanel

}
