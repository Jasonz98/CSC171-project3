import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Panel extends JFrame implements ActionListener,MouseMotionListener,MouseListener{
	JPanel Modes;
	JButton Mode1, Mode2, Mode3,Color1,Color2,Color3;
	
	JPanel bar;
	
	JButton fire;

	JButton focus;
	
	JLabel colorL,modeL,speedL;
	
	
	
	public Panel(){
		super("FIREWORK SHOW");
		// setPreferredSize(new Dimension(950,950));
		setLayout(new BorderLayout());
		
		addMouseListener(this);
		addMouseMotionListener(this);
		
		Modes = new JPanel();
		Mode1 = new JButton("Mode 1");
		
		colorL = new JLabel("The current color is random");
		
		bar.add(Mode1);
		bar.add(Mode2);
		bar.add(Mode3);
	
		billy niubi
		
		
		
		bar.setBackground(Color.WHITE);
		Modes.setBackground(Color.WHITE);
		add(bar,BorderLayout.EAST);
		pack();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub	
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub	
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub	
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub	
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub	
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub	
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
public static void main(String[]args) {
	 JFrame frame = new JFrame("HW");
	 Panel canvas = new Panel();
	 frame.add(canvas);
	 frame.setSize(450,450);
	 
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.setVisible(true);
}
	
}
