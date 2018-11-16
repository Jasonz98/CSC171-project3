import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Shape extends JComponent {
    int xOne;
    int yOne;
    int v = 100;
    
	@Override
	public void paintComponent(Graphics g) {
		/*g.drawLine(500, 250, 400, (int)(250 - 100 * Math.sqrt(3)));
		g.drawLine(400, (int)(250 - 100 * Math.sqrt(3)), 300, 250);
		g.drawLine(300,250,500,250);
		g.drawLine(400, (int)(250 + 25 * Math.sqrt(3)), 500, (int)(250 - 75 * Math.sqrt(3)));
		g.drawLine(500, (int)(250 - 75 * Math.sqrt(3)), 300, (int)(250 - 75 * Math.sqrt(3)));
		g.drawLine(300, (int)(250 - 75 * Math.sqrt(3)), 400, (int)(250 + 25 * Math.sqrt(3)));*/
		
	    g.drawOval(500, 250, 60, 60); 	
	    g.drawLine(530, 240, 530, 200);
		g.drawLine(530, 320, 530, 360);
		g.drawLine(490, 280, 450, 280);
		g.drawLine(570, 280, 610, 280);
		g.drawLine(500, 250, (int)(500 - 25 * Math.sqrt(2)), (int)(250 - 25 * Math.sqrt(2)));
		g.drawLine(560, 250, (int)(560 + 25 * Math.sqrt(2)), (int)(250 - 25 * Math.sqrt(2)));
		g.drawLine(500, 310, (int)(500 - 25 * Math.sqrt(2)), (int)(310 + 25 * Math.sqrt(2)));
		g.drawLine(560, 310, (int)(560 + 25 * Math.sqrt(2)), (int)(310 + 25 * Math.sqrt(2)));
	}
	
	
	
	
	
	public static void main(String[]args) {
		 JFrame frame = new JFrame("HW");
		 Shape canvas = new Shape();
		 frame.add(canvas);
		 frame.setSize(1000,500);
		 
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setVisible(true);
	}
}
