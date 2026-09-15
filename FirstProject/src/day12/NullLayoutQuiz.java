package day12;

import java.awt.Container;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NullLayoutQuiz extends JFrame{
	// 700 * 700 크기의 컨테이너 안에
	// 1부터 10까지 값을 가지는 버튼을 랜덤한 위치에 출력
	// 버튼의 크기는 200*20
	public NullLayoutQuiz() {
		// TODO Auto-generated constructor stub
		setTitle("첫번째 화면!!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		Random ran = new Random();
		for(int i=1; i<=10; i++) {
			JButton btn = new JButton(i+"");
			btn.setSize(50, 20);
			btn.setLocation(ran.nextInt(640), ran.nextInt(640));
			c.add(btn);
		}
		
		
		setSize(700, 700);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NullLayoutQuiz();
	}

}
