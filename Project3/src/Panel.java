import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSlider;


public class Panel extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	JPanel gaget;
	JMenuItem Mode1;
	JMenuItem Mode2;
	JMenuItem Mode3;
	JMenuItem Mode4;
	JMenuItem Mode5;



	
	JMenuItem Color1;
	JMenuItem Color2;
	JMenuItem Color3;
	JMenuItem Color4;
	JMenuItem Color5;
	
	JSlider velocity;
	JSlider angel;
	JSlider delay;
	
	
	
	JMenu Mode;
	JMenu Color;
	JMenuBar bar;
	
	JButton fire;
	JButton focus;
	public Panel(){


		super("FIREWORK SHOW");
		setPreferredSize(new Dimension(1920,950));

		setLayout(new BorderLayout());
		add(bar,BorderLayout.SOUTH);

		super("FIREWORK SHOW");
		setPreferredSize(new Dimension(1920,950));
		setLayout(new BorderLayout());
		
		addMouseListener(this);
		addMouseMotionListener(this);

		
		bar = new JMenuBar();
		gaget = new JPanel();
		
		fire = new JButton("Fire");
		// build the Mode menu
		Mode = new JMenu("Modes");
		Mode1 = new JMenuItem("Mode1");
		Mode2 = new JMenuItem("Mode2");
		Mode3 = new JMenuItem("Mode3");
		Mode4 = new JMenuItem("Mode4");
		Mode5 = new JMenuItem("Mode5");
		Mode.add(Mode1);
		Mode.add(Mode2);
		Mode.add(Mode3);
		Mode.add(Mode4);
		Mode.add(Mode5);
		// build the Color menu
		Color = new JMenu("Colors");
		Color1 = new JMenuItem("Color1");
		Color2 = new JMenuItem("Color2");
		Color3 = new JMenuItem("Color3");
		Color4 = new JMenuItem("Color4");
		Color5 = new JMenuItem("Color5");
		Color.add(Color1);
		Color.add(Color2);
		Color.add(Color3);
		Color.add(Color4);
		Color.add(Color5);
		
		//Parameters
		velocity = new JSlider(0,100);
		angel = new JSlider(0,100);
		delay = new JSlider(0,100);
		
		//add bar to gaget
		gaget.add(bar);
		gaget.setLayout(new GridLayout(2,2));
		//add menus to bar
		bar.add(Mode);
		bar.add(Color);
		//add fire to gaget
		gaget.add(fire);
		gaget.add(velocity);
		gaget.add(angel);
		gaget.add(delay);
		add(bar,BorderLayout.EAST);*/


		
	
		add(gaget,BorderLayout.SOUTH);
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
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Mode){
			//Mode.setTitle(e);
			
		}
		else if (e.getSource()==Color){
			
		}
		
	}

	
public static void main(String[]args) {
	 JFrame frame = new JFrame("HW");
	 Panel canvas = new Panel();
	 frame.add(canvas);
	 frame.setSize(1000,500);
	 
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.setVisible(true);
}
	

	public static void main(String [] args){
		JFrame frame = new JFrame("Firework Show");
		Panel panel = new Panel();
		panel.setVisible(true);
		panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
	}
}
