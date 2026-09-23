package day18;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyDialog extends JDialog{
	private JTextField tf = new JTextField(10);
	private JButton okButton = new JButton("OK");
	
	MyDialog(JFrame frame, String title){
		super(frame, title, true);
		setLayout(new FlowLayout());
		add(tf);
		add(okButton);
		okButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
			}
		});
		
		setSize(200, 100);
	}
	
	public String getInput() {
		if(tf.getText().length() == 0) {
			return null;
		} else {
			return tf.getText();
		}
	}
}
