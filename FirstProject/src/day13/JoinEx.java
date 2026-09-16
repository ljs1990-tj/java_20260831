package day13;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;

public class JoinEx extends JFrame {

    public JoinEx() {
        setTitle("첫번째 화면!!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        JPanel namePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel label = new JLabel("이름");
        JTextField name = new JTextField(20);

        namePanel.add(label);
        namePanel.add(name);

        JPanel addrPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel label2 = new JLabel("주소");
        JTextField addr = new JTextField(20);

        addrPanel.add(label2);
        addrPanel.add(addr);

        JPanel hobbyPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel label3 = new JLabel("취미");

        JCheckBox hobby1 = new JCheckBox("게임");
        JCheckBox hobby2 = new JCheckBox("영화감상");
        JCheckBox hobby3 = new JCheckBox("독서");
        JCheckBox hobby4 = new JCheckBox("코딩");

        hobbyPanel.add(label3);
        hobbyPanel.add(hobby1);
        hobbyPanel.add(hobby2);
        hobbyPanel.add(hobby3);
        hobbyPanel.add(hobby4);

        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel label4 = new JLabel("성별");

        JRadioButton gender1 = new JRadioButton("남");
        JRadioButton gender2 = new JRadioButton("여");

        ButtonGroup group = new ButtonGroup();
        group.add(gender1);
        group.add(gender2);

        genderPanel.add(label4);
        genderPanel.add(gender1);
        genderPanel.add(gender2);

        mainPanel.add(namePanel);
        mainPanel.add(addrPanel);
        mainPanel.add(hobbyPanel);
        mainPanel.add(genderPanel);

        c.add(mainPanel);

        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JoinEx();
    }
}