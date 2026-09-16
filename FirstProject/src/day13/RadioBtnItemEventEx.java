package day13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class RadioBtnItemEventEx extends JFrame{
	int sum = 0;
	public RadioBtnItemEventEx() {
		// TODO Auto-generated constructor stub
		setTitle("체크박스 이벤트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ButtonGroup group = new ButtonGroup();
		JRadioButton fruits[] = new JRadioButton[3];
		String furitNames[] = {"사과", "배", "체리"};
		
		c.add(new JLabel("사과100원, 배500원, 체리20000원"));
		JLabel sumLabel= new JLabel("현재 0 원입니다.");
		
		for(int i=0; i<fruits.length; i++) {
			fruits[i] = new JRadioButton(furitNames[i]);
			fruits[i].addItemListener(new ItemListener() {
				@Override
				public void itemStateChanged(ItemEvent e) {
					// TODO Auto-generated method stub
					if(e.getStateChange() == ItemEvent.SELECTED) {
						// 체크됐을 때 로직 처리
						System.out.println("체크 됨!");
						if(e.getItem() == fruits[0]) {
							sum += 100;
						} else if(e.getItem() == fruits[1]) {
							sum += 500;
						} else {
							sum += 20000;
						}
					} else {
						// 체크 해제 됐을 때 로직 처리
						System.out.println("해제 됨!");
						if(e.getItem() == fruits[0]) {
							sum -= 100;
						} else if(e.getItem() == fruits[1]) {
							sum -= 500;
						} else {
							sum -= 20000;
						}
					}
					sumLabel.setText("현재 " + sum + "원입니다.");
				}
			});
			group.add(fruits[i]);
			c.add(fruits[i]);
		}
		
		c.add(sumLabel);
		
		
		setSize(250, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RadioBtnItemEventEx();
	}

}
