package de;

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
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import data.MasterAccount;
import data.Member;
import data.SignUp2;

public class LoginMenu2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	public static List<Member> memberList = new ArrayList<Member>();
	SignUp2 signUp;
	static Member tempMember = new Member();
	static Member adminMember = new Member();
	
	
	MasterAccount admin;

//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					F_Backg frame = new F_Backg();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public LoginMenu2() {
		
		try {
			admin = new MasterAccount();
		} catch (Exception e) {
			// TODO: handle exception
		}

		adminMember = admin;

		memberList.add(adminMember);
		
		Font font = new Font("배달의민족 도현", Font.PLAIN, 14);

		setBounds(0, 0, 533, 950);
		
		JLabel idLabel = new JLabel("아이디 : ");
		idLabel.setBounds(165, 329, 80, 30);
		idLabel.setFont(new Font("배달의민족 도현", Font.PLAIN, 20));
		
		JTextField idTextField = new JTextField();
		idTextField.setBounds(266, 332, 100, 28);
		
		JLabel pwLabel = new JLabel("비밀번호 : ");
		pwLabel.setBounds(145, 389, 100, 30);
		pwLabel.setFont(new Font("배달의민족 도현", Font.PLAIN, 20));
		
		JPasswordField pwTextField = new JPasswordField();
		pwTextField.setBounds(266, 391, 100, 28);
		
		//JFrame 회원가입 버튼
		JButton signUpButton = new JButton("");
		signUpButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUp2 sign = new SignUp2();	
			}
		});
		signUpButton.setIcon(new ImageIcon(LoginMenu2.class.getResource("/image/signupbutton.png"))); //회원가입버튼 사진 삽입
		signUpButton.setBounds(210, 650, 110, 45);
		signUpButton.setContentAreaFilled(false); //버튼 배경선 false
		signUpButton.setBorderPainted(false); //버튼 배경 false
				
		getContentPane().setLayout(null);// 레이아웃 설정
		try {
			
		} catch (Exception e) {
		}
		
		// 라벨, 필드, 버튼 추가
		getContentPane().add(idLabel);
		getContentPane().add(idTextField);
		getContentPane().add(pwLabel);
		getContentPane().add(pwTextField);
		getContentPane().add(signUpButton);
		
		JButton loginButton = new JButton("");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 진입");
				String tempID = idTextField.getText();
				char[] tempPWCharArray = pwTextField.getPassword();
				String tempPW = new String(tempPWCharArray);

				if (masterLoginCheck(tempID, tempPW) == true) {
					new MainMenu();
					JOptionPane.showMessageDialog(null, "마스터 계정 로그인 성공", "로그인 확인", JOptionPane.PLAIN_MESSAGE);
					dispose();
				} else {
					if (loginCheck(tempID, tempPW) == true) {
						new MainMenu();
						JOptionPane.showMessageDialog(null, "로그인 성공", "로그인 확인", JOptionPane.PLAIN_MESSAGE);
						dispose();
					} else {
						JOptionPane.showMessageDialog(null, "로그인 실패", "로그인 확인", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		loginButton.setIcon(new ImageIcon(LoginMenu2.class.getResource("/image/loginbutton.png")));//로그인버튼 사진 삽입
		loginButton.setBounds(219, 477, 85, 35);
		loginButton.setVisible(true);
		loginButton.setContentAreaFilled(false); //버튼 배경선 false
		loginButton.setBorderPainted(false); //버튼 배경 false
		
		getContentPane().add(loginButton);
		JLabel frameimg = new JLabel();
		frameimg.setIcon(new ImageIcon(LoginMenu2.class.getResource("/image/background.png")));
		frameimg.setBounds(0, 0, 517, 950);
		getContentPane().add(frameimg);
		frameimg.setVisible(true);
		
		JLabel lblNewLabel2 = new JLabel("New label");
		setVisible(true);
		
	}
	
	boolean loginCheck(String tempID, String tempPW) {
		Iterator<Member> checkMember = memberList.iterator();
		while (checkMember.hasNext()) {
			Member member = checkMember.next();
			if (member.getMemberID().equals(tempID) && member.getMemberPW().equals(tempPW)) {
				tempMember = member;
				return true;
			}
		}
		return false;
	}

	boolean masterLoginCheck(String tempID, String tempPW) {
		admin.setMemberID(tempID);
		admin.setMemberPW(tempPW);
		if (admin.getMemberID().equals(tempID) && admin.getMemberPW().equals(tempPW)) {
			tempMember = adminMember;
			return true;
		}
		return false;
	}
}
