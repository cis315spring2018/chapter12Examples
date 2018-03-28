/**
 *   file: drawFontsJPanel_12_1.java
 */
package c12Examples;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

/**
 * @author atmanning - atmanning@dbq.edu
 *
 */
public class chapter12_9_MouseExample extends JFrame implements MouseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int WIDTH = 350;
	private static int HEIGHT = 250;

	// GUI components
	private JLabel[] labelJL;

	chapter12_9_MouseExample() { // Constructor

		// basic visibility
		this.setTitle(this.getClass().getSimpleName());
		this.setSize(400, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container pane = getContentPane();
		setSize(WIDTH, HEIGHT);

		
		GridLayout gridMgr = new GridLayout(6, 1, 10, 10); // ( rows, cols, hgap, vgap )
		pane.setLayout(gridMgr);

		labelJL = new JLabel[6];

		labelJL[0] = new JLabel("Mouse Clicked", SwingConstants.CENTER);
		labelJL[1] = new JLabel("Mouse Entered", SwingConstants.CENTER);
		labelJL[2] = new JLabel("Mouse Exited", SwingConstants.CENTER);
		labelJL[3] = new JLabel("Mouse Pressed", SwingConstants.CENTER);
		labelJL[4] = new JLabel("Mouse Released", SwingConstants.CENTER);
		labelJL[5] = new JLabel("", SwingConstants.CENTER);

		for (int i = 0; i < labelJL.length; i++) {
			labelJL[i].setForeground(Color.gray);
			pane.add(labelJL[i]);
		}

		pane.addMouseListener(this);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	} // end constructor

	@Override
	public void mouseClicked(MouseEvent event) {
		for (int i = 0; i < labelJL.length; i++) {
			if (i == 0)
				labelJL[i].setForeground(Color.yellow);
			else
				labelJL[i].setForeground(Color.gray);
		}

		labelJL[5].setText("[" + event.getX() + "," + event.getY() + "]");

	}

	@Override
	public void mouseEntered(MouseEvent event) {
		for (int i = 0; i < labelJL.length; i++) {
			if (i == 1)
				labelJL[i].setForeground(Color.green);
			else
				labelJL[i].setForeground(Color.gray);
		}

		labelJL[5].setText("[" + event.getX() + "," + event.getY() + "]");
	}

	@Override
	public void mouseExited(MouseEvent event) {
		for (int i = 0; i < labelJL.length; i++) {
			if (i == 2)
				labelJL[i].setForeground(Color.red);
			else
				labelJL[i].setForeground(Color.gray);
		}

		labelJL[5].setText("[" + event.getX() + "," + event.getY() + "]");
	}

	@Override
	public void mousePressed(MouseEvent event) {
		for (int i = 0; i < labelJL.length; i++) {
			if (i == 3)
				labelJL[i].setForeground(Color.blue);
			else
				labelJL[i].setForeground(Color.gray);
		}

		labelJL[5].setText("[" + event.getX() + "," + event.getY() + "]");
	}

	@Override
	public void mouseReleased(MouseEvent event) {
		for (int i = 0; i < labelJL.length; i++) {
			if (i == 4)
				labelJL[i].setForeground(Color.pink);
			else
				labelJL[i].setForeground(Color.gray);
		}

		labelJL[5].setText("[" + event.getX() + "," + event.getY() + "]");
	}

}
