import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class NepaliMarksheet {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JTextField tf5;
	private JTextField tf6;
	private JTextField tf7;
	private JTextField tf8;
	private JTextField tf9;
	private JTextField tf10;
	private JTextField tf11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NepaliMarksheet window = new NepaliMarksheet();
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
	public NepaliMarksheet() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Nepali Marksheet");
		frame.setBounds(100, 100, 628, 559);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(tf1.getText());
				double b = Double.parseDouble(tf2.getText());
				double c = Double.parseDouble(tf3.getText());
				double d = Double.parseDouble(tf4.getText());
				double f = Double.parseDouble(tf5.getText());
				double g = Double.parseDouble(tf6.getText());
				double h = Double.parseDouble(tf7.getText());
				
				double total = a + b+ c+ d+ f+ g+ h;
				
				tf8.setText(Double.toString(total));
				
				double i = Double.parseDouble(tf8.getText());
				
				double percent = (i/700) * 100;				
				
				tf9.setText(new DecimalFormat("##.##").format(percent));
				
				//tv.setText(new DecimalFormat("##.##").format(i2));
				
				double p = Double.parseDouble(tf9.getText());
				
				if(p<40){
					//setting color in red to warn
					tf10.setForeground(new Color(0xff0000 ));
					tf10.setText("Failed");
					
					tf11.setText("Work Hard!");
				}
				
				else if (p == 40 || p < 50) {
					tf10.setText("Third Division");
					tf11.setText("Work Hard!");
				}
				else if(p<60){
					tf10.setText("Second Division");
					tf11.setText("You can do better");
				}
				else if (p<80){
					tf10.setText("First Division");
					tf11.setText("Very good!");
				}
				else if (p<=100){
					tf10.setText("Distinction");
					tf11.setText("Great! Keep it up!");
				}
				else {
					tf10.setForeground(new Color(0xff0000 ));
					tf10.setText("Wrong Input!");
					
					tf11.setForeground(new Color(0xff0000 ));
					
					tf11.setText("Check and do again!");
					
				}
																				
				
				
			}
		});
		btnCalculate.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCalculate.setBounds(250, 403, 99, 30);
		frame.getContentPane().add(btnCalculate);
		
		JLabel lblSubjects = new JLabel("Science");
		lblSubjects.setBounds(61, 48, 56, 19);
		frame.getContentPane().add(lblSubjects);
		
		JLabel lblNepali = new JLabel("Nepali");
		lblNepali.setBounds(61, 110, 56, 19);
		frame.getContentPane().add(lblNepali);
		
		JLabel lblEnglish = new JLabel("English");
		lblEnglish.setBounds(61, 167, 56, 19);
		frame.getContentPane().add(lblEnglish);
		
		JLabel lblComputer = new JLabel("Computer");
		lblComputer.setBounds(61, 219, 56, 19);
		frame.getContentPane().add(lblComputer);
		
		JLabel lblEnvironment = new JLabel("Environment");
		lblEnvironment.setBounds(61, 281, 74, 19);
		frame.getContentPane().add(lblEnvironment);
		
		JLabel lblSanskrit = new JLabel("Sanskrit");
		lblSanskrit.setBounds(61, 338, 56, 19);
		frame.getContentPane().add(lblSanskrit);
		
		JLabel lblHistory = new JLabel("History");
		lblHistory.setBounds(61, 403, 56, 19);
		frame.getContentPane().add(lblHistory);
		
		JLabel lblMarkSheet = new JLabel("MARK SHEET");
		lblMarkSheet.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMarkSheet.setBounds(260, 11, 109, 30);
		frame.getContentPane().add(lblMarkSheet);
		
		tf1 = new JTextField();
		tf1.setBounds(134, 47, 56, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(134, 109, 56, 20);
		frame.getContentPane().add(tf2);
		
		tf3 = new JTextField();
		tf3.setColumns(10);
		tf3.setBounds(134, 166, 56, 20);
		frame.getContentPane().add(tf3);
		
		tf4 = new JTextField();
		tf4.setColumns(10);
		tf4.setBounds(134, 218, 56, 20);
		frame.getContentPane().add(tf4);
		
		tf5 = new JTextField();
		tf5.setColumns(10);
		tf5.setBounds(134, 280, 56, 20);
		frame.getContentPane().add(tf5);
		
		tf6 = new JTextField();
		tf6.setColumns(10);
		tf6.setBounds(134, 337, 56, 20);
		frame.getContentPane().add(tf6);
		
		tf7 = new JTextField();
		tf7.setColumns(10);
		tf7.setBounds(134, 402, 56, 20);
		frame.getContentPane().add(tf7);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTotal.setBounds(391, 254, 142, 14);
		frame.getContentPane().add(lblTotal);
		
		tf8 = new JTextField();
		tf8.setColumns(10);
		tf8.setBounds(447, 251, 86, 20);
		frame.getContentPane().add(tf8);
		
		tf9 = new JTextField();
		tf9.setColumns(10);
		tf9.setBounds(447, 296, 62, 20);
		frame.getContentPane().add(tf9);
		
		JLabel lblPercent = new JLabel("Percent");
		lblPercent.setBounds(391, 299, 46, 14);
		frame.getContentPane().add(lblPercent);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setBounds(338, 355, 46, 14);
		frame.getContentPane().add(lblResult);
		
		tf10 = new JTextField();
		tf10.setColumns(10);
		tf10.setBounds(394, 354, 86, 20);
		frame.getContentPane().add(tf10);
		
		tf11 = new JTextField();
		tf11.setColumns(10);
		tf11.setBounds(391, 109, 163, 103);
		frame.getContentPane().add(tf11);
		
		
		JLabel lblMessage = new JLabel("Message");
		lblMessage.setBounds(310, 112, 56, 14);
		frame.getContentPane().add(lblMessage);
	}
}
