/**
 *   file: drawFontsJPanel_12_1.java
 */
package c12Examples;

import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.*;

/**
 * @author atmanning - atmanning@dbq.edu
 *
 */
public class drawFontsJPanel_12_1 extends JFrame {

	drawFontsJPanel_12_1() { // Constructor
		this.setTitle("draw fonts on a JPanel instead of an applet");
		this.setSize(400, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		// create a JPanel to handle the graphics paint()
		Container c = this.getContentPane();
		c.add(new myJPanel());

	}// end constructor

	class myJPanel extends JPanel {

		@Override
		public void paint(Graphics g) {
			// always call the superclass paint method first
			super.paint(g);

			// now do our work

			g.setFont(new Font("Courier", Font.BOLD, 24));
			g.drawString("Courier bold 24pt font", 30, 36);

			g.setFont(new Font("Arial", Font.PLAIN, 30));
			g.drawString("Arial plain 30pt font", 30, 70);

			g.setFont(new Font("Dialog", Font.BOLD + Font.ITALIC, 36));
			g.drawString("Dialog italic bold 36pt font", 30, 110);

			g.setFont(new Font("Serif", Font.ITALIC, 30));
			g.drawString("Serif italic 42pt font", 30, 156);

		}

	} // end class myJPanel

}
