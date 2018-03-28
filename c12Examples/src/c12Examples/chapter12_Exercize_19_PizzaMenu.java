/**
 *   file: chapter12_Exercize_19_PizzaMenu.java
 */
package c12Examples;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Label;
import java.awt.Panel;
import javax.swing.UIManager;
import java.awt.Font;

/**
 * @author atmanning - atmanning@dbq.edu
 *
 */
public class chapter12_Exercize_19_PizzaMenu extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chapter12_Exercize_19_PizzaMenu frame = new chapter12_Exercize_19_PizzaMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public chapter12_Exercize_19_PizzaMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 507, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Process Selection...");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JRadioButton rdbtnThinCrust = new JRadioButton("Thin Crust");
		buttonGroup_1.add(rdbtnThinCrust);
		rdbtnThinCrust.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnThinCrust.setBounds(291, 63, 119, 21);
		contentPane.add(rdbtnThinCrust);
		
		JRadioButton rdbtnMediumCrust = new JRadioButton("Medium Crust");
		buttonGroup_1.add(rdbtnMediumCrust);
		rdbtnMediumCrust.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnMediumCrust.setBounds(291, 86, 119, 21);
		contentPane.add(rdbtnMediumCrust);
		btnNewButton.setBounds(155, 159, 255, 21);
		contentPane.add(btnNewButton);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Small: $6.50");
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.LEFT);
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(155, 63, 119, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Medium: $8.50");
		rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(155, 86, 119, 21);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Large: $10.00");
		rdbtnNewRadioButton_2.setHorizontalAlignment(SwingConstants.LEFT);
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(155, 109, 119, 21);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnPan = new JRadioButton("Pan");
		buttonGroup_1.add(rdbtnPan);
		rdbtnPan.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnPan.setBounds(291, 109, 119, 21);
		contentPane.add(rdbtnPan);
		
		Label label = new Label("Pizza Type");
		label.setBounds(288, 41, 102, 21);
		contentPane.add(label);
		
		Label label_1 = new Label("Pizza Size");
		label_1.setBounds(156, 41, 102, 21);
		contentPane.add(label_1);
		
		Label label_2 = new Label("Welcome to Home Style PIzza Shop");
		label_2.setFont(new Font("Dialog", Font.BOLD, 21));
		label_2.setBounds(12, 12, 456, 24);
		contentPane.add(label_2);
	}
}
