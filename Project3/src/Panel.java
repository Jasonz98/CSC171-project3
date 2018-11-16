import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class Panel extends JFrame implements ActionListener,MouseMotionListener,MouseListener{
	JPanel Modes;
	JButton Mode1, Mode2, Mode3,Mode4,Mode5,Color1,Color2,Color3;
	
	JPanel bar;
	
	//JButton fire;

	//JButton focus;
	
	//JLabel colorL,modeL,speedL;
	
	
	
	public Panel(){
		super("FIREWORK SHOW");
		setPreferredSize(new Dimension(950,950));
		setLayout(new BorderLayout());
		
		addMouseListener(this);
		addMouseMotionListener(this);
		
		Modes = new JPanel();
		Mode1 = new JButton("Mode 1");
		Mode2 = new JButton("Mode 2");
		Mode3 = new JButton("Mode 3");
		Mode4 = new JButton("Mode 4");
		Mode5 = new JButton("Mode 5");
		
		//colorL = new JLabel("The current color is random");
		
		bar=new JPanel();
		bar.setLayout(new GridLayout(2,3,2,2));
		bar.add(Mode1);
		bar.add(Mode2);
		bar.add(Mode3);
		bar.add(Mode4);
		bar.add(Mode5);
	
		
		
		
		
		bar.setBackground(Color.WHITE);
		Modes.setBackground(Color.WHITE);
		add(bar,BorderLayout.SOUTH);
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
}
