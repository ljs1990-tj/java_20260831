package day12;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame{
	
	public FlowLayoutEx() {
		// TODO Auto-generated constructor stub
		setTitle("FlowLayout!!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));
		
		JButton btn1 = new JButton("첫번째버튼");
		c.add(btn1);
		
		JButton btn2 = new JButton("두번째버튼");
		c.add(btn2);
		
		JButton btn3 = new JButton("세번째버튼");
		c.add(btn3);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlowLayoutEx();
	}

}
