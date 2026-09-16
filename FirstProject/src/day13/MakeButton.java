package day13;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MakeButton extends JFrame{
	public MakeButton() {
		// TODO Auto-generated constructor stub
		setTitle("F1키 누르면 랜덤위치에 버튼 생성");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		Random ran = new Random();
		
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyCode() == KeyEvent.VK_F1) {
					JButton btn = new JButton("버튼!");
					btn.setSize(70, 70);
					btn.setLocation(ran.nextInt(500), ran.nextInt(500));
					c.add(btn);
					
					c.repaint();
					
				}
			}
		});
		
		
		setSize(600, 600);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MakeButton();
	}

}
