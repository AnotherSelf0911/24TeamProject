package teamProject;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginMenu2_1 {
	
	List<Member> memberList = new ArrayList<Member>();
	SignUp2 signup;
	Member tempMember = new Member();
	Member adminMember;
	MasterAccount admin;
	ImageIcon icon;
	
	
	public LoginMenu2_1() {
		
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

		
		loginFrame.setBounds(100, 100, 730, 1300);
		loginFrame.setLocationRelativeTo(null);
		
		
		JLabel idLabel = new JLabel("아이디 : ");
		idLabel.setBounds(218, 563, 80, 30);
		idLabel.setFont(defaultFont);
		
		JTextField idTextField = new JTextField();
		idTextField.setBounds(343, 566, 150, 28);
		
		JLabel pwLabel = new JLabel("비밀번호 : ");
		pwLabel.setBounds(218, 616, 80, 30);
		pwLabel.setFont(defaultFont);
		
		JPasswordField pwTextField = new JPasswordField();
		pwTextField.setBounds(343, 619, 150, 28);
		
		//JFrame 로그인 버튼
		JButton loginButton = new JButton("");
		loginButton.setIcon(new ImageIcon("./image/loginButton.png"));//로그인버튼 사진 삽입
		loginButton.setBounds(325, 750, 90, 50);
		loginButton.setContentAreaFilled(false); //버튼 배경선 false
		loginButton.setBorderPainted(false); //버튼 배경 false
		
		//JFrame 회원가입 버튼
		JButton signUpButton = new JButton("");
		signUpButton.setIcon(new ImageIcon("./image/signupbutton.png")); //회원가입버튼 사진 삽입
		signUpButton.setBounds(315, 950, 110, 50);
		signUpButton.setContentAreaFilled(false); //버튼 배경선 false
		signUpButton.setBorderPainted(false); //버튼 배경 false
		
		loginFrame.getContentPane().setLayout(null);// 레이아웃 설정
		
		JLabel lblNewLabel2 = new JLabel("New label");

		// 라벨, 필드, 버튼 추가
		loginFrame.getContentPane().add(idLabel);
		loginFrame.getContentPane().add(idTextField);
		loginFrame.getContentPane().add(pwLabel);
		loginFrame.getContentPane().add(pwTextField);
		loginFrame.getContentPane().add(loginButton);
		loginFrame.getContentPane().add(signUpButton);
		
		ImageIcon back = new ImageIcon("./image/background.png");
		JLabel lblNewLabel = new JLabel(back);
		lblNewLabel.setBounds(0, 0, 730, 1300);
		loginFrame.getContentPane().add(lblNewLabel);
		
		//loginFrame.setSize(400, 550);	// 로그인창 크기 설정
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// X버튼 눌러도 꺼지게 설정
		loginFrame.setVisible(true);	// 보이게 설정
		
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String tempID = idTextField.getText();
				char[] tempPWCharArray = pwTextField.getPassword();
				String tempPW = new String(tempPWCharArray);
				
				if(masterLoginCheck(tempID, tempPW) == true) {
					new MainMenu();
					JOptionPane.showMessageDialog(null, "마스터 계정 로그인 성공", "로그인 확인", JOptionPane.PLAIN_MESSAGE);
					loginFrame.dispose();
				}
				else {
					if(loginCheck(tempID, tempPW) == true) {
						new MainMenu();
						JOptionPane.showMessageDialog(null, "로그인 성공", "로그인 확인", JOptionPane.PLAIN_MESSAGE);
						loginFrame.dispose();
					}
					else {
						JOptionPane.showMessageDialog(null, "로그인 실패", "로그인 확인", JOptionPane.ERROR_MESSAGE);
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
		Iterator<Member> checkMember = signup.memberList.iterator();
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
