package day14;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Quiz3 extends JFrame{
	public Quiz3() {
		// TODO Auto-generated constructor stub
		setTitle("퀴즈3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel topPanel = new JPanel();
		topPanel.setBackground(Color.YELLOW);
		topPanel.add(new JLabel("수식"));
		JTextField inputField = new JTextField(20);
		topPanel.add(inputField);
		
		
		c.add(topPanel, BorderLayout.NORTH);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(Color.CYAN);
//		centerPanel.add(new JLabel("센터영역!!!"));
		centerPanel.add(new JButton("버튼1"));
		centerPanel.add(new JButton("버튼2"));
		c.add(centerPanel, BorderLayout.CENTER);
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		bottomPanel.setBackground(Color.ORANGE);
		bottomPanel.add(new JLabel("계산 결과"));
		JTextField resultField = new JTextField(20);
		bottomPanel.add(resultField);
		c.add(bottomPanel, BorderLayout.SOUTH);
		
		setSize(500, 500);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Quiz3();
	}

}
