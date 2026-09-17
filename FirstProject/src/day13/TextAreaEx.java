package day13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaEx extends JFrame{
	public TextAreaEx() {
		// TODO Auto-generated constructor stub
		setTitle("첫번째 화면!!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("입력 후 <Enter> 키를 입력해주세요.");
		JTextField field = new JTextField(20);
		JTextArea area = new JTextArea(7, 20);
		JScrollPane scroll = new JScrollPane(area);
		
		field.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println(field.getText());
				area.append(field.getText() + "\n");
				field.setText("");
			}
		});
		
		
		
		c.add(label);
		c.add(field);
		c.add(scroll);
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextAreaEx();
	}

}
