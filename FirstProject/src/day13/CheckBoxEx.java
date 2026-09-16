package day13;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxEx extends JFrame{
	public CheckBoxEx() {
		// TODO Auto-generated constructor stub
		setTitle("체크박스");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배", true);
		
		ImageIcon img1 = new ImageIcon("images/cherry.jpg");
		ImageIcon img2 = new ImageIcon("images/selectedCherry.jpg");
		
		JCheckBox cherry = new JCheckBox("체리", img1);
		cherry.setSelectedIcon(img2);
		cherry.setBorderPainted(true);
		c.add(cherry);
		
		
		c.add(apple);
		c.add(pear);
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxEx();
	}

}
