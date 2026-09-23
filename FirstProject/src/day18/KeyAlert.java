package day18;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyAlert extends JFrame {
	public KeyAlert() {
		super("숫자가 아닌 키가 입력되는 경우 경고창 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("학번 : "));
		JTextField tf = new JTextField(10);
		c.add(tf);
		
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyChar() < '0' || e.getKeyChar() > '9') {// 숫자 키 아님
					char c = e.getKeyChar();
					JOptionPane.showMessageDialog(
							null, 
							c + "는 숫자 키가 아닙니다.\n숫자를 입력하세요.", 
							"경고", 
							JOptionPane.ERROR_MESSAGE
					);
					e.consume(); 
				}
			}
		});
		
		setSize(500,100);
		setVisible(true);
	}

	static public void main(String[] arg) {
		new KeyAlert();
	}
}
