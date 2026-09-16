package day13;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseAdapterEx extends JFrame{
	public MouseAdapterEx() {
		// TODO Auto-generated constructor stub
		setTitle("마우스 이벤트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		JLabel label = new JLabel("Hello");
		label.setBounds(30, 30, 70, 50);
		c.add(label);
		Random ran = new Random();
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				label.setLocation(e.getX(), e.getY());
				c.setBackground(new Color(ran.nextInt(256), ran.nextInt(256), ran.nextInt(256)));
			}
		});
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseAdapterEx();
	}

}
