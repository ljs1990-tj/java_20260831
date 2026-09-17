package day14;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelEx1 extends JFrame{
	public PanelEx1() {
		// TODO Auto-generated constructor stub
		setTitle("PanelEx1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(2,1));
		
		panel1.setBackground(Color.YELLOW);
		panel2.setBackground(Color.CYAN);
		
		panel1.add(new JButton("버튼1"));
		panel1.add(new JButton("버튼2"));
		
		panel2.add(new JButton("버튼3"));
		panel2.add(new JButton("버튼4"));
		
		c.add(panel1);
		c.add(panel2);
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PanelEx1();
	}

}
