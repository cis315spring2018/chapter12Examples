/**
 *   file: drawFontsJPanel_12_1.java
 */
package c12Examples;

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
public class chapter12_Example_FlowLayout extends JFrame {

	   private static int WIDTH = 350;
	   private static int HEIGHT = 350;

	        //Variables to create GUI components
	   private JLabel labelJL;
	   private JTextField textFieldTF;
	   private JButton buttonJB;
	   private JCheckBox checkboxCB;
	   private JRadioButton radioButtonRB;
	   private JTextArea textAreaTA;

	   private FlowLayout flowLayoutMgr;

	chapter12_Example_FlowLayout() { // Constructor

		// Flow layout example from Malik Java page 840
		
		// basic visibility
		this.setTitle(this.getClass().getSimpleName());
		this.setSize(400, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	     setSize(WIDTH,HEIGHT);                          //Line 3

	     Container pane = this.getContentPane();
	     
	      flowLayoutMgr = new FlowLayout();               //Line 4
	      pane.setLayout(flowLayoutMgr);                  //Line 5

	      labelJL = new JLabel("First Component");        //Line 6
	      textFieldTF = new JTextField(15);               //Line 7
	      textFieldTF.setText("Second Component");        //Line 8
	      buttonJB = new JButton("Third Component");      //Line 9

	      checkboxCB = new JCheckBox("Fourth Component"); //Line 10

	      radioButtonRB =
	             new JRadioButton("Fifth Component");     //Line 11

	      textAreaTA = new JTextArea(10, 20);             //Line 12

	      textAreaTA.setText("Sixth Component.\n");       //Line 13

	      textAreaTA.append(
	           "Use the mouse to resize the window.");    //Line 14

	             //place the GUI components into the pane
	      pane.add(labelJL);                              //Line 15
	      pane.add(textFieldTF);                          //Line 16
	      pane.add(buttonJB);                             //Line 17
	      pane.add(checkboxCB);                           //Line 18
	      pane.add(radioButtonRB);                        //Line 19
	      pane.add(textAreaTA);                           //Line 20

	      setVisible(true);                               //Line 21
	      setDefaultCloseOperation(EXIT_ON_CLOSE);        //Line 22

	}// end constructor


}
