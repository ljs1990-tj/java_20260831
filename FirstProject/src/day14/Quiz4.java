package day14;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Quiz4 extends JFrame {
	public Quiz4() {
		super("체크박스 연습문제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JCheckBox a = new JCheckBox("버튼 비활성화");
		JCheckBox b = new JCheckBox("버튼 감추기");
		
		c.add(a);
		c.add(b);	
		
		JButton btn = new JButton("test button");
		c.add(btn);
		
		a.addItemListener(new ItemListener() { 
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					btn.setEnabled(false);
				} else {
					btn.setEnabled(true);
				}
			}
		});
		
		b.addItemListener(new ItemListener() { 
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					btn.setVisible(false);
				} else {
					btn.setVisible(true);
				}
			}
		});

		setSize(250,130);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Quiz4();
	}
}
