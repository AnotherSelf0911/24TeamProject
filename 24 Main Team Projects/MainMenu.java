package teamProject;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MainMenu {
	public MainMenu() {
		
		JFrame mainMenuFrame = new JFrame();
		Font defaultFont = new Font("", Font.PLAIN, 14);
		
		//.setBounds(x, y, 양옆, 위아래);
		JButton memberInfoButton = new JButton("사용자 정보");
		memberInfoButton.setBounds(50, 300, 100, 40);
		
		JButton healthButton = new JButton("운동 도우미");
		healthButton.setBounds(250, 300, 100, 40);
		
		mainMenuFrame.add(memberInfoButton);
		mainMenuFrame.add(healthButton);
		
		mainMenuFrame.setLayout(null);
		mainMenuFrame.setSize(450, 550);
		mainMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainMenuFrame.setVisible(true);
		
		memberInfoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 사용자 정보로 들어가도록 디폴트 생성자
				// new MemberInfo(); 이렇게 적기?
			}
		});
		
		healthButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 사용자 정보로 들어가도록 디폴트 생성자
				// new healthTraining(); 이렇게 적기?
			}
		});
		
		
	}
}
