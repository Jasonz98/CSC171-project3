import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class main extends JComponent {

   public main() {
	   //setSize(1000,100);
	   setLayout(new BorderLayout());
	   
	   JButton button = new JButton("Click me");
	   add(button);
   }
	
	
	
	
	
public static void main (String[]args) {
	 JFrame frame = new JFrame("HW");
	 main canvas = new main();
	 frame.add(canvas);
	 frame.setSize(1000,500);
	 
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.setVisible(true);
     }	
	
}
