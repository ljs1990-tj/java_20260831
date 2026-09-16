package day13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerMotionEx extends JFrame{
	public MouseListenerMotionEx() {
		// TODO Auto-generated constructor stub
		setTitle("마우스 모션!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Mouse Event!");
		c.add(label);
		
		c.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				label.setText("mouseDragged! " + e.getX() + ", " + e.getY());
			}
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				label.setText("mouseMoved! " + e.getX() + ", " + e.getY());
			}
		});
		
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				label.setText("드래그 끝!");
			}
		});
		
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseListenerMotionEx();
	}

}
