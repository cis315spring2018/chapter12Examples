/**
 *   file: labelColorsJFrame12_2.java
 */
package c12Examples;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.*;

/**
 * @author atmanning - atmanning@dbq.edu
 *
 */
public class labelColorsJFrame12_2 extends JFrame {

	labelColorsJFrame12_2() {
		//basic appearance
		this.setTitle("labelColorsJFrame12_2 - Malik c12-2");
		this.setSize(600, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// make a few simple labels and work with colors
		JLabel lblRed = new JLabel("Red", SwingConstants.CENTER);
		lblRed.setForeground(Color.red);
		
		JLabel lblGreen = new JLabel("Green", SwingConstants.CENTER);
		lblGreen.setForeground(Color.green);
		
		JLabel lblBlue = new JLabel("Blue", SwingConstants.CENTER);
		lblBlue.setForeground(Color.green);
		
		JLabel lblRandom = new JLabel("Random", SwingConstants.CENTER);
		lblRandom.setForeground(
				new Color((float)Math.random(),
				(float)Math.random(),
				(float)Math.random()) );
		
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(3,2));
		c.add(lblRed);
		c.add(lblGreen);
		c.add(lblBlue);
		c.add(lblRandom);
		
		
	}
	
}
