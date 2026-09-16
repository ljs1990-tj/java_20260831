package day13;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxItemEventEx extends JFrame{
	public CheckBoxItemEventEx() {
		// TODO Auto-generated constructor stub
		setTitle("체크박스 이벤트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JCheckBox fruits[] = new JCheckBox[3];
		String furitNames[] = {"사과", "배", "체리"};
		
		c.add(new JLabel("사과100원, 배500원, 체리20000원"));
		JLabel sumLabel= new JLabel("현재 0 원입니다.");
		
		for(int i=0; i<fruits.length; i++) {
			fruits[i] = new JCheckBox(furitNames[i]);
			c.add(fruits[i]);
		}
		
		c.add(sumLabel);
		
		
		setSize(250, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxItemEventEx();
	}

}
