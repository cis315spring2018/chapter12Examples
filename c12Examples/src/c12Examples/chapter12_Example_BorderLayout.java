/**
 *   file: drawFontsJPanel_12_1.java
 */
package c12Examples;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.*;

/**
 * @author atmanning - atmanning@dbq.edu
 *
 */
public class chapter12_Example_BorderLayout extends JFrame {

	private static int WIDTH = 350;
	private static int HEIGHT = 300;

	// GUI components
	private JLabel labelJL;
	private JTextField textFieldTF;
	private JButton buttonJB;
	private JCheckBox checkboxCB;
	private JRadioButton radioButtonRB;
	private JTextArea textAreaTA;

	private BorderLayout borderLayoutMgr;

	chapter12_Example_BorderLayout() { // Constructor

		// Flow layout example from Malik Java page 843

		// basic visibility
		this.setTitle(this.getClass().getSimpleName());
		this.setSize(400, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container pane = getContentPane();
		setSize(WIDTH, HEIGHT);

		borderLayoutMgr = new BorderLayout(10, 10);
		pane.setLayout(borderLayoutMgr);

		labelJL = new JLabel("North Component");
		textAreaTA = new JTextArea(10, 20);
		textAreaTA.setText("South Component.\n");
		textAreaTA.append("Use the mouse to change the size of the window.");
		buttonJB = new JButton("West Component");
		checkboxCB = new JCheckBox("East Component");
		radioButtonRB = new JRadioButton("Center Component");

		pane.add(labelJL, BorderLayout.NORTH);
		pane.add(textAreaTA, BorderLayout.SOUTH);
		pane.add(buttonJB, BorderLayout.EAST);
		pane.add(checkboxCB, BorderLayout.WEST);
		pane.add(radioButtonRB, BorderLayout.CENTER);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}// end constructor

}
