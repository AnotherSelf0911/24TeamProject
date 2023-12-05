package teamProject;

import java.awt.Font;

import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.*;

public class LoginMenu2 {
	
	List<Member> memberList = new ArrayList<Member>(); 
	SignUp signUp = new SignUp();
	Member tempMember = new Member();
	Member adminMember;
	MasterAccount admin;
	
	
	public LoginMenu2() {
		
		try {
            admin = new MasterAccount();
        } catch (Exception e) {
            // 예외 처리 로직 추가
            e.printStackTrace();
        }
		
		adminMember = new Member(admin.getMemberName(), admin.getMemberGender(), admin.getMemberAge(), admin.getStartweight(), admin.getMemberWeight(), 
				admin.getMemberLength(), admin.getStartDate(), admin.getMemberID(), admin.getMemberPW(), admin.getDays(), admin.getExerciseDays(), 
				admin.getMemberGrade(), admin.getMemberExerciseDiff(), admin.getMemberBMI());
		
		memberList.add(adminMember);
		
		JFrame loginFrame = new JFrame("로그인 창"); // 프레임 생성
		Font defaultFont = new Font("", Font.PLAIN, 14);
		//.setBounds(x, y, 양옆, 위아래);
		
		JLabel idLabel = new JLabel("아이디 : ");
		idLabel.setBounds(20, 320, 80, 30);
		idLabel.setFont(defaultFont);
		
		JTextField idTextField = new JTextField();
		idTextField.setBounds(100, 322, 150, 28);
		
		JLabel pwLabel = new JLabel("비밀번호 : ");
		pwLabel.setBounds(20, 375, 80, 30);
		pwLabel.setFont(defaultFont);
		
		JPasswordField pwTextField = new JPasswordField();
		pwTextField.setBounds(100, 378, 150, 28);
		
		JButton loginButton = new JButton("로그인");
		loginButton.setBounds(275, 334, 80, 60);
		
		JButton signUpButton = new JButton("회원가입");
		signUpButton.setBounds(145, 440, 85, 30);
		
		
		loginFrame.setLayout(null);	// 레이아웃 설정
		
		// 라벨, 필드, 버튼 추가
		loginFrame.add(idLabel);
		loginFrame.add(idTextField);
		loginFrame.add(pwLabel);
		loginFrame.add(pwTextField);
		loginFrame.add(loginButton);
		loginFrame.add(signUpButton);
		
		loginFrame.setSize(400, 550);	// 로그인창 크기 설정
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// X버튼 눌러도 꺼지게 설정
		loginFrame.setVisible(true);	// 보이게 설정
		
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame login = new JFrame();
				login.setSize(200, 150);
				login.setVisible(false);
				
				String tempID = idTextField.getText();
				char[] tempPWCharArray = pwTextField.getPassword();
				String tempPW = new String(tempPWCharArray);
				
				if(masterLoginCheck(tempID, tempPW) == true) {
					JLabel loginLabel = new JLabel("마스터 계정 로그인 성공");
					loginLabel.setBounds(100, 75, 200, 0);
					login.add(loginLabel);
					login.setVisible(true);
					new MainMenu();
					loginFrame.dispose();
				}
				else {
					if(loginCheck(tempID, tempPW) == true) {
						JLabel loginLabel = new JLabel("로그인 성공");
						loginLabel.setBounds(100, 75, 100, 0);
						login.add(loginLabel);
						login.setVisible(true);
						new MainMenu();
						loginFrame.dispose();
					}
					else {
						JLabel loginLabel = new JLabel("로그인 실패");
						loginLabel.setBounds(100, 75, 100, 0);
						login.add(loginLabel);
						login.setVisible(true);
					}
				}
				
			}
		});
		
		signUpButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SignUp2();
			}
		});
		
	}
	
	boolean loginCheck(String tempID, String tempPW) {
		Iterator<Member> checkMember = signUp.memberList.iterator();
		while(checkMember.hasNext()) {
			Member member = checkMember.next();
			if(member.memberID.equals(tempID) && member.memberPW.equals(tempPW)) {
				tempMember = checkMember.next();
				return true;
			}
		}
		return false;
	}
	
	boolean masterLoginCheck(String tempID, String tempPW) {
		if(admin.memberID.equals(tempID) && admin.memberPW.equals(tempPW)) {
			tempMember = adminMember;
			return true;
		}
		return false;
	}
	
}
