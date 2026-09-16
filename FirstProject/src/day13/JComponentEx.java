package day13;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JComponentEx extends JFrame{

	public JComponentEx() {
		// TODO Auto-generated constructor stub
		setTitle("컴포넌트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("Button1");
		btn1.setBackground(Color.YELLOW);
		btn1.setForeground(Color.MAGENTA);
		btn1.setFont(new Font("궁서", Font.BOLD, 20));
		JButton btn2 = new JButton("Button2");
		btn2.setEnabled(false);
		JButton btn3 = new JButton("Button3");
		
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JComponentEx();
	}

}
