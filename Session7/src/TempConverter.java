import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TempConverter {
	 

	private JFrame frame;
	private JTextField userInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TempConverter window = new TempConverter();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TempConverter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Celsius to Farhenheit Converter");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel heading = new JLabel("Temperature Converter");
		heading.setFont(new Font("Tahoma", Font.BOLD, 14));
		heading.setBounds(130, 11, 221, 30);
		frame.getContentPane().add(heading);

		JLabel lblC = new JLabel("C");
		lblC.setBounds(279, 100, 46, 14);
		frame.getContentPane().add(lblC);
		
		JButton convertButton = new JButton("Convert");
		convertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double temp = Double.parseDouble(userInput.getText());
				double farhenheit = (temp * 1.8)+32;
				userInput.setText(Double.toString(farhenheit));
				lblC.setText("F");
		
			}
		});
		convertButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		convertButton.setBounds(181, 144, 89, 23);
		frame.getContentPane().add(convertButton);
		
		userInput = new JTextField();
		userInput.setBounds(181, 97, 86, 20);
		frame.getContentPane().add(userInput);
		userInput.setColumns(10);
		
		
	}
	
}
