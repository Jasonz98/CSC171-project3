import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel extends JComponent implements ActionListener{
	
	JButton Mode1, Mode2, Mode3,Color1,Color2,Color3;
	
	JPanel bar;
	
	JButton fire;

	JButton focus;
	
	JLabel colorL,modeL,speedL;
	
	
	
	public Panel(){
	
		setLayout(new BorderLayout());
		add(bar,BorderLayout.SOUTH);
		bar.setBackground(Color.GREEN);
	
	
		
		
		
		
		/*bar.setBackground(Color.WHITE);
		
		add(bar,BorderLayout.EAST);*/
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
public static void main(String[]args) {
	 JFrame frame = new JFrame("HW");
	 Panel canvas = new Panel();
	 frame.add(canvas);
	 frame.setSize(1000,500);
	 
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.setVisible(true);
}
	
}
