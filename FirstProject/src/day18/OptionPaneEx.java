package day18;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class OptionPaneEx extends JFrame{
	
	OptionPaneEx(){
		setTitle("첫번째 화면!!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JTextField tf = new JTextField(15);
		JButton inputBtn = new JButton("Input");
		inputBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String text = JOptionPane.showInputDialog("아무거나 입력!!");
				if(text != null) {
					tf.setText(text);
				}
			}
		});
		
		JButton confirmBtn = new JButton("Confirm");
		confirmBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 int result = JOptionPane.showConfirmDialog(null, 
						 "정말 삭제???", "Confirm", 
						 JOptionPane.YES_NO_OPTION);
				 if(result == JOptionPane.CLOSED_OPTION) {
					tf.setText("닫았음"); 
				 } else if(result == JOptionPane.YES_OPTION) {
					 tf.setText("YES 선택함");
				 } else {
					 tf.setText("NO 선택함");
				 }
				 
			}
		});
		
		JButton messageBtn = new JButton("Message");
		
		messageBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, 
						"조심하세요", "Message", 
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		
		c.add(inputBtn);
		c.add(confirmBtn);
		c.add(messageBtn);
		c.add(tf);
		
		setSize(600, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OptionPaneEx();
	}

}
