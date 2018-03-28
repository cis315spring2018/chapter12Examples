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
public class chapter12_4_drawRectangle extends JFrame {

	chapter12_4_drawRectangle() { // Constructor
		
		// basic visibility
		// exploring Eclipse, I found a way to display this class name
		this.setTitle(this.getClass().getSimpleName());
		
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

			// test rectangle
			g.drawRect(10, 10,420, 20);

			// draw more lines just for practice!
			int x1,y1;
			x1=20;
			y1=30;
			
			// can you tell what this will look like?
			for( int x2=x1; x2<400; x2+= 20 ) {
				g.drawLine(x1, y1, x2, y1+100 );
				g.drawLine(x1, y1+100, x2, y1);
			}
			

		}

	} // end class myJPanel

}
