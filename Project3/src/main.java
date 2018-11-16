import javax.swing.JComponent;
import javax.swing.JFrame;

public class main extends JComponent {


	
	
	
	
	
public static void main (String[]args) {
	 JFrame frame = new JFrame("HW");
	 main canvas = new main();
	 frame.add(canvas);
	 frame.setSize(1000,500);
	 
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.setVisible(true);
     }	
	
}
