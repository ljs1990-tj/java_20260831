package day13;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlyingTextEx extends JFrame {
	public FlyingTextEx() {
		// TODO Auto-generated constructor stub
		setTitle("키보드 이벤트!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel label = new JLabel("Hello");
		label.setBounds(50, 50, 100, 20);
		c.add(label);
		final int FLYING_UNIT = 10;
		
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				int keyCode = e.getKeyCode();
				System.out.println("키 코드 : " + keyCode);
				System.out.println("상수 : " + KeyEvent.VK_RIGHT);
			}
		});
		
	
		
		setSize(300, 300);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlyingTextEx();
	}

}
