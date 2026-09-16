package day13;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Repaint extends JFrame{
	public Repaint() {
		// TODO Auto-generated constructor stub
		setTitle("첫번째 화면!!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				JLabel label = new JLabel("Hello!");
				label.setSize(50, 30);
				label.setLocation(30, 30);
				c.add(label);
				
				c.revalidate();
				c.repaint();
				
			}
			
		});
		
		setSize(300, 300);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Repaint();
	}

}
