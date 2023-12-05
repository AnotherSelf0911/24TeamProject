package teamProject;

import java.awt.Font;
import java.util.*;

import javax.swing.*;

public class SignUp2 {
	
	List<Member> memberList;
	SignUp2 signUp = new SignUp2();
	Member tempMember = new Member();
	
	public SignUp2() {
		
		
		JFrame signUpFrame = new JFrame("회원가입 창"); // 프레임 생성
		
		
		Font defaultFont = new Font("", Font.PLAIN, 14);
		
		JLabel idLabel = new JLabel("아이디");
		JTextField idTextField = new JTextField();	// ID 적는 란
		String tempID = idTextField.getText();
		JButton idDupCheck = new JButton("ID 중복확인");
		
	
		JLabel pwLabel = new JLabel("비밀번호");
		JTextField pwTextField = new JTextField();	// 비밀번호 적는 란
		JTextField pwCheckTextField = new JTextField();	// 비밀번호 재확인
		String tempPW = pwTextField.getText();
		String tempPWCheck = pwCheckTextField.getText();
		
		
		JLabel ageLabel = new JLabel("나이");
		JTextField ageTextField = new JTextField(); // 나이 적는 란
		
		JLabel nameLabel = new JLabel("이름");
		JTextField nameTextField = new JTextField(); // 이름 적는 란
		
		JLabel genderLabel = new JLabel("성별");
		JTextField genderTextField = new JTextField(); // 성별 적는 란
		
		JLabel weightLabel = new JLabel("몸무게");
		JTextField weightTextField = new JTextField(); // 몸무게 적는 란
		
		JLabel lengthLabel = new JLabel("키");
		JTextField lengthTextField = new JTextField(); // 키 적는 란
		
		signUpFrame.setLayout(null);
		
		
		
		signUpFrame.setSize(400, 550);
		signUpFrame.setVisible(true);
	}
	
	boolean id_DupCheck(String tempID) {
		Iterator<Member> id = memberList.iterator();
		
	}
	
}
