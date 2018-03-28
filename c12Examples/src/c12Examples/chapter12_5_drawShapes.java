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
public class chapter12_5_drawShapes extends JFrame {

	chapter12_5_drawShapes() { // Constructor

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

			int shape;
			int numOfFigures;
			int x;
			int y;
			int width;
			int height;
			int red;
			int green;
			int blue;

			int i;

			// parent
			super.paint(g);

			// determine the number of figures
			numOfFigures = 5 + (int) (Math.random() * 10);

			for (i = 0; i < numOfFigures; i++) {
				red = (int) (Math.random() * 256); // red component
				green = (int) (Math.random() * 256);// green component
				blue = (int) (Math.random() * 256); // blue component

				g.setColor(new Color(red, green, blue)); // color for
															// this figure

				x = (int) (Math.random() * SIZE); // x value
				y = (int) (Math.random() * SIZE); // y value
				width = (int) (Math.random() * SIZE); // width
				height = (int) (Math.random() * SIZE); // height

				shape = (int) (Math.random() * 4);

				/**
				 * 0 : Rectangle 1 : Filled Rectangle 2 : Oval 3 : Filled Oval
				 *
				 **/

				switch (shape) {
				case 0:
					g.drawRect(x, y, width, height);
					break;

				case 1:
					g.fillRect(x, y, width, height);
					break;

				case 2:
					g.drawOval(x, y, width, height);
					break;

				case 3:
					g.fillOval(x, y, width, height);
				}// end switch
			} // end for
		}

	} // end class myJPanel

}
