package day14;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class ListChangeEx extends JFrame{
	public ListChangeEx() {
		// TODO Auto-generated constructor stub
		setTitle("리스트 추가");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JTextField text = new JTextField(20);
		
		Vector<String> v = new Vector<String>();
		v.add("홍길동");
		JList<String> list = new JList<String>(v);
		list.setVisibleRowCount(5); 
		list.setFixedCellWidth(100);
		JScrollPane scroll = new JScrollPane(list);
		
		text.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				JTextField t = (JTextField) e.getSource();
				v.add(text.getText());
				list.setListData(v);
				text.setText("");
			}
		});
		
		c.add(text);
		c.add(scroll);
		
		setSize(250, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ListChangeEx();
	}

}
