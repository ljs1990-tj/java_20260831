package day14;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Quiz2 extends JFrame{
	// 700 * 700 크기의 컨테이너 안에
	// 1부터 10까지 값을 가지는 버튼을 랜덤한 위치에 출력
	// 버튼의 크기는 200*20
	private int num = 1;
	public Quiz2() {
		// TODO Auto-generated constructor stub
		setTitle("Quiz2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		start(c);
		
		
		setSize(700, 700);
		setVisible(true);
	}
	
	void start(Container c) {
		Random ran = new Random();
		
		for(int i=1; i<=10; i++) {
			JButton btn = new JButton(i+"");
			btn.setSize(50, 20);
			btn.setLocation(ran.nextInt(640), ran.nextInt(640));
			btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JButton b = (JButton) e.getSource();
					if(Integer.parseInt(b.getText()) == num) {
						c.remove(b);
						num++;
						if(num == 11) {
							num = 1;
							start(c);
						}
					}
					c.repaint();
					
				}
			});
			
			c.add(btn);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Quiz2();
	}

}
