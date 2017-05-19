import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldSwing {

	public static void main (String[] arg){
		
		createAndShow();
	}
	
	private static void createAndShow(){
	JFrame mainFrame = new JFrame("Hello World");
	mainFrame.setSize(200, 200);
	
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	JLabel label = new JLabel("Welcome to Java Swing");
	mainFrame.getContentPane().add(label);
	
		mainFrame.setVisible(true);
	
	}
}
