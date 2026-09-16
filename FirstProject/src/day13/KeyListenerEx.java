package day13;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListenerEx extends JFrame{
	public KeyListenerEx() {
		// TODO Auto-generated constructor stub
		setTitle("키보드 이벤트!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel arr[] = new JLabel[3];
		
		arr[0] = new JLabel("keyCode");
		arr[1]  = new JLabel("keyChar");
		arr[2]  = new JLabel("getText");
		
		for(int i=0; i<arr.length; i++) {
			c.add(arr[i]);
			arr[i].setOpaque(true);
			arr[i].setBackground(Color.yellow);
		}
		
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				int keyCode = e.getKeyCode();
				arr[0].setText(keyCode + "");
				arr[1].setText(e.getKeyChar() + "");
				arr[2].setText(e.getKeyText(keyCode));
				
				JLabel label = new JLabel("New Text");
				c.add(label);
				JButton btn = new JButton("zz");
				c.add(btn);
				
			}
		});
		
		
		setSize(300, 300);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyListenerEx();
	}

}
