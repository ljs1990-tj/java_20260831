package day14;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Quiz1 extends JFrame{
	public Quiz1() {
		// TODO Auto-generated constructor stub
		setTitle("퀴즈1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		c.setBackground(Color.YELLOW);
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; 
		String [] text = {"오만원", "만원", "천원", "500원", "100원", "50원", "10원", "1원"}; 
		
		JTextField source = new JTextField(30);;
		JTextField tf[] = new JTextField[8];
		
		JLabel la = new JLabel("금액");
		la.setHorizontalAlignment(JLabel.RIGHT);
		la.setSize(50, 20);
		la.setLocation(20, 20);
		c.add(la);
		
		source.setSize(100, 20);
		source.setLocation(100, 20);
		c.add(source);
		
		JButton calcBtn = new JButton("계산");
		calcBtn.setSize(70, 20);
		calcBtn.setLocation(210, 20);
		c.add(calcBtn);
		
		for(int i=0; i<text.length; i++) {
			JLabel moneyText = new JLabel(text[i]);
//			moneyText.setHorizontalAlignment(JLabel.RIGHT);
			moneyText.setSize(50, 20);
			moneyText.setLocation(50, 50+i*20);
			c.add(moneyText);
			tf[i] = new JTextField(30);
			tf[i].setHorizontalAlignment(JTextField.CENTER);
			tf[i].setSize(70, 20);
			tf[i].setLocation(120, 50+i*20);
			
			add(tf[i]);
		}
		
		calcBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = source.getText(); 
				if(str.length() == 0) {
					return;
				}; 
				
				int money = Integer.parseInt(str); 
				int res;
				for(int i=0; i<unit.length; i++) {
					res = money/unit[i]; 
					tf[i].setText(Integer.toString(res));
					if(res > 0) {
						money = money%unit[i];
					}
				}
			}
		});
		
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Quiz1();
	}

}
