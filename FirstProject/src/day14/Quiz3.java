package day14;

import java.awt.Container;

import javax.swing.JFrame;

public class Quiz3 extends JFrame{
	public Quiz3() {
		// TODO Auto-generated constructor stub
		setTitle("퀴즈3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Quiz3();
	}

}
