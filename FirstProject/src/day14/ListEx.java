package day14;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class ListEx extends JFrame{
	public ListEx() {
		// TODO Auto-generated constructor stub
		setTitle("리스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		String [] fruits = {"apple", "banana", "kiwi", "mango", "pear",
				"peach", "berry", "strawberry", "blackberry"};
		
		JList<String> list = new JList<String>(fruits);
		JScrollPane scroll = new JScrollPane(list);
		c.add(scroll);
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ListEx();
	}

}
