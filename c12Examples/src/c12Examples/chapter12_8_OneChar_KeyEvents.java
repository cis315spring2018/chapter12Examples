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

import javax.swing.*;

/**
 * @author atmanning - atmanning@dbq.edu
 *
 */
public class chapter12_8_OneChar_KeyEvents extends JFrame {

	chapter12_8_OneChar_KeyEvents() { // Constructor

		// basic visibility
		this.setTitle(this.getClass().getSimpleName());
		this.setSize(400, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container c = this.getContentPane();

		c.setLayout(new GridLayout(1, 1));
		// needed for proper display of myJPanel

	    JTextField oneLetter = new JTextField(1);

	    
	    // here's an example of writing the KeyAdaptor (Action event handler)
	    // as the parameter to the .addKeyListener() method
        oneLetter.addKeyListener(new KeyAdapter()
        {
            public void keyTyped(KeyEvent e)
            {
                float red, green, blue;

                Color fg, bg;

                oneLetter.setText(" ");

                red = (float) Math.random();
                green = (float) Math.random();
                blue = (float) Math.random();

                fg = new Color(red, green, blue);
                bg = Color.white;

                oneLetter.setForeground(fg);
                oneLetter.setBackground(bg);
                oneLetter.setCaretColor(bg);
                oneLetter.setFont(new Font("Courier",
                                           Font.BOLD, 200));
            }
        });

        c.setLayout(new GridLayout(1, 1));
        c.setBackground(Color.white);
        c.add(oneLetter);

        JOptionPane.showMessageDialog
           (null, "Click on the JFrame, then type a key ",
           "Information", JOptionPane.PLAIN_MESSAGE );


	}// end constructor


}
