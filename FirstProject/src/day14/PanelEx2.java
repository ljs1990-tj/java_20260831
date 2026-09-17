package day14;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelEx2 extends JFrame{
	public PanelEx2() {
		// TODO Auto-generated constructor stub
		setTitle("PanelEx2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel topPanel = new JPanel();
		topPanel.setBackground(Color.YELLOW);
		topPanel.add(new JLabel("상단영역!!!"));
		c.add(topPanel, BorderLayout.NORTH);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(Color.CYAN);
//		centerPanel.add(new JLabel("센터영역!!!"));
		centerPanel.add(new JButton("버튼1"));
		centerPanel.add(new JButton("버튼2"));
		c.add(centerPanel, BorderLayout.CENTER);
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBackground(Color.ORANGE);
		bottomPanel.add(new JLabel("하단영역!!!"));
		c.add(bottomPanel, BorderLayout.SOUTH);
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PanelEx2();
	}

}
