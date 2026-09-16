package day13;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseAdapterEx2 extends JFrame{
	public MouseAdapterEx2() {
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
			// 더블클릭했을 때 label 이동
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
//				if(e.getClickCount() == 2) {
//					label.setLocation(e.getX(), e.getY());
//				}
				if(e.getButton() == MouseEvent.BUTTON3) {
					label.setLocation(e.getX(), e.getY());
				}
			}
		});
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseAdapterEx2();
	}

}
