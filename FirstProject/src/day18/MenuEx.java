package day18;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuEx extends JFrame{
	
	MenuEx(){
		setTitle("첫번째 화면!!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		createMenu();
		
		setSize(300, 300);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar menuBar = new JMenuBar();
		JMenu screenMenu = new JMenu("Screen");
		
		JMenuItem load = new JMenuItem("Load");
		screenMenu.add(load);
		JMenuItem hide = new JMenuItem("Hide");
		screenMenu.add(hide);
		JMenuItem reShow = new JMenuItem("ReShow");
		screenMenu.add(reShow);
		screenMenu.addSeparator();
		JMenuItem exit = new JMenuItem("Exit");
		screenMenu.add(exit);
		
		menuBar.add(screenMenu);
		menuBar.add(new JMenu("Edit")); 
		menuBar.add(new JMenu("Source"));
		menuBar.add(new JMenu("Project"));
		menuBar.add(new JMenu("Run"));
		
		
		setJMenuBar(menuBar);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MenuEx();
	}

}
