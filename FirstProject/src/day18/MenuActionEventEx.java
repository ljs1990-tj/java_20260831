package day18;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuActionEventEx extends JFrame{
	private JLabel imgLabel = new JLabel(); 
	MenuActionEventEx(){
		setTitle("첫번째 화면!!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.add(imgLabel);
		createMenu();
		
		setSize(500, 600);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar menuBar = new JMenuBar();
		JMenu screenMenu = new JMenu("Screen");
		JMenuItem[] menuItem = new JMenuItem[4];
		String itemTitle[] = {"Load", "Hide", "ReShow", "Exit"};
		
		for(int i=0; i<menuItem.length; i++) {
			menuItem[i] = new JMenuItem(itemTitle[i]);
			menuItem[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					System.out.println(e.getActionCommand());
					String cmd = e.getActionCommand();
					
					if(cmd.equals("Load")) {
						if(imgLabel.getIcon() != null) {
							return; 
						}
						imgLabel.setIcon(new ImageIcon("images/RYAN_1.jpg"));
					} else if(cmd.equals("Hide")) {
						imgLabel.setVisible(false);
					} else if(cmd.equals("ReShow")) {
						imgLabel.setVisible(true);
					} else if(cmd.equals("Exit")) {
						System.exit(0);
					}
					
				}
			});
			screenMenu.add(menuItem[i]);
		}
		
		
		menuBar.add(screenMenu);
		setJMenuBar(menuBar);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MenuActionEventEx();
	}

}
