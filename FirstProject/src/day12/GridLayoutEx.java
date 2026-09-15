package day12;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutEx extends JFrame{
	public GridLayoutEx() {
		// TODO Auto-generated constructor stub
		setTitle("첫번째 화면!!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(4,2,5,5));
		
		c.add(new JLabel("이름"));
		c.add(new JTextField());
		c.add(new JLabel("학번"));
		c.add(new JTextField());
		c.add(new JLabel("학과"));
		c.add(new JTextField());
		c.add(new JLabel("과목"));
		c.add(new JTextField());
		
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayoutEx();
	}

}
