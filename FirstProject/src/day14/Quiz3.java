package day14;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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
		centerPanel.setLayout(new GridLayout(4, 4, 3, 3));
		String arr[] = {
				"7", "8", "9", "*",
				"4", "5", "6", "-",
				"1", "2", "3", "+",
				"/", "0", ".", "="
		};
		ArrayList<String> list = new ArrayList<>();
		list.add("*");
		list.add("-");
		list.add("+");
		list.add("/");
		list.add("=");
		list.add(".");
		
		
		for(int i=0; i<arr.length; i++) {
			JButton btn = new JButton(arr[i]);
			btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JButton b = (JButton) e.getSource();
					if(inputField.getText().length() == 0 && list.contains(b.getText())) {
						return;
					} else if(inputField.getText().length() != 0) {
						String currentText = inputField.getText();
						String lastText = currentText.substring(currentText.length()-1);
						if(list.contains(lastText) && list.contains(b.getText())) {
							return;
						}
					}
					
					String inputText = inputField.getText() + b.getText();
					inputField.setText(inputText);
					
				}
			});
			
			centerPanel.add(btn);
		}
		
		c.add(centerPanel, BorderLayout.CENTER);
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		bottomPanel.setBackground(Color.ORANGE);
		bottomPanel.add(new JLabel("계산 결과"));
		JTextField resultField = new JTextField(20);
		bottomPanel.add(resultField);
		c.add(bottomPanel, BorderLayout.SOUTH);
		
		setSize(400, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Quiz3();
	}

}
