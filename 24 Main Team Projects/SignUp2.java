package teamProject;

import java.awt.Container;
// import java.awt.Font;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.swing.*;

public class SignUp2 extends LoginMenu2 {
	
	//List<Member> memberList = new ArrayList<>();
	LoginMenu2 menu = new LoginMenu2();
	Member checkMember;
	Member dupIDCheck;
	String idCheck = "";
	String pwCheck = "null";
	
	public SignUp2(LoginMenu2 menu) {
        this.menu = menu;
    }
	
	public void signUpStart() {
		
		JFrame signUpFrame = new JFrame("회원가입 창"); // 프레임 생성
		
		// Font defaultFont = new Font("", Font.PLAIN, 14);
		
		JLabel idLabel = new JLabel("아이디");
		idLabel.setBounds(20, 30, 80, 30);
		
		JTextField idTextField = new JTextField();	// ID 적는 란
		idTextField.setBounds(60, 36, 130, 30);
		
		JButton idDupCheck = new JButton("ID 중복확인");
		idDupCheck.setBounds(240, 36, 100, 30);
		
		idDupCheck.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(idTextField.getText().isBlank()) {
					JOptionPane.showMessageDialog(null, "ID 작성을 해주세요.", "ID 중복 확인", JOptionPane.ERROR_MESSAGE);
				}
				else if (id_DupCheck(idTextField.getText()) == true) {
					JOptionPane.showMessageDialog(null, "해당 ID는 중복되지 않습니다.", "ID 중복 확인", JOptionPane.PLAIN_MESSAGE);
					idCheck = idTextField.getText();
				}
				else {
					JOptionPane.showMessageDialog(null, "중복된 ID 입니다.", "ID 중복 확인", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		
	
		JLabel pwLabel = new JLabel("비밀번호 (영문 + 숫자 조합 8 ~ 16자리)");
		pwLabel.setBounds(20, 85, 400, 30);
		JLabel pwTextLabel = new JLabel("비밀번호");
		pwTextLabel.setBounds(20, 125, 120, 30);
		JTextField pwTextField = new JTextField();	// 비밀번호 적는 란
		pwTextField.setBounds(80, 130, 130, 30);
		JLabel pwCheckLabel = new JLabel("비밀번호 재확인");
		pwCheckLabel.setBounds(20, 165, 200, 30);
		JTextField pwCheckTextField = new JTextField();	// 비밀번호 재확인
		pwCheckTextField.setBounds(120, 170, 130, 30);
		JButton pwCheckButton = new JButton("비밀번호 확인");
		pwCheckButton.setBounds(250, 130, 110, 30);
		
		
		pwCheckButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if (getType(pwTextField.getText()) == true) {
					JOptionPane.showMessageDialog(null, "적합한 비밀번호 입니다.", "비밀번호 확인", JOptionPane.PLAIN_MESSAGE);
					pwCheck = pwTextField.getText();
				}
				else {
					JOptionPane.showMessageDialog(null, "적합하지 않은 비밀번호 입니다.", "비밀번호 확인", JOptionPane.ERROR_MESSAGE);
				}
				
			}
			
		});
		
		
		JLabel ageLabel = new JLabel("나이");
		ageLabel.setBounds(20, 200, 60, 30);
		JTextField ageTextField = new JTextField(); // 나이 적는 란
		ageTextField.setBounds(120, 205, 130, 30);
		
		JLabel nameLabel = new JLabel("이름");
		nameLabel.setBounds(20, 240, 60, 30);
		JTextField nameTextField = new JTextField(); // 이름 적는 란
		nameTextField.setBounds(120, 245, 130, 30);
		
		JLabel genderLabel = new JLabel("성별");
		genderLabel.setBounds(20, 280, 60, 30);
		JTextField genderTextField = new JTextField(); // 성별 적는 란
		genderTextField.setBounds(120, 285, 130, 30);
		
		JLabel weightLabel = new JLabel("몸무게");
		weightLabel.setBounds(20, 320, 80, 30);
		JTextField weightTextField = new JTextField(); // 몸무게 적는 란
		weightTextField.setBounds(120, 325, 130, 30);
		
		JLabel lengthLabel = new JLabel("키");
		lengthLabel.setBounds(20, 360, 40, 30);
		JTextField lengthTextField = new JTextField(); // 키 적는 란
		lengthTextField.setBounds(120, 365, 130, 30);
		
		JButton signUpButton = new JButton("회원가입");	// 회원가입 버튼
		signUpButton.setBounds(145, 440, 85, 30);
		
		
		signUpButton.addActionListener(new ActionListener(){	// 회원가입 버튼 눌렀을때
			public void actionPerformed(ActionEvent e) {
				if (idCheck.isBlank()) {  // 중복확인을 하지 않은 경우
                    JOptionPane.showMessageDialog(null, "ID 중복확인을 해주세요.", "회원가입 확인", JOptionPane.ERROR_MESSAGE);
                }
				else if (!idTextField.getText().equals(idCheck)) {	// 만약에 ID 적는 텍스트란에 있는 값과 중복확인 한 tempID값이 같지 않으면
					JOptionPane.showMessageDialog(null, "중복확인한 ID와 값이 같지 않습니다.", "회원가입 확인", JOptionPane.ERROR_MESSAGE);
				}
				else if (idTextField.getText().isBlank()) {	// ID 입력칸이 비어있을때
					JOptionPane.showMessageDialog(null, "ID를 적지 않았습니다.", "회원가입 확인", JOptionPane.ERROR_MESSAGE);
				}
				else if (pwTextField.getText().isBlank()) {	// 비밀번호 입력칸이 비어있을때
					JOptionPane.showMessageDialog(null, "비밀번호를 적지 않았습니다.", "회원가입 확인", JOptionPane.ERROR_MESSAGE);
				}
				else if (!pwTextField.getText().equals(pwCheckTextField.getText())) {
					JOptionPane.showMessageDialog(null, "비밀번호 재확인이 다릅니다.", "회원가입 확인", JOptionPane.ERROR_MESSAGE);
				}
				else if (!pwTextField.getText().equals(pwCheck)) {
					JOptionPane.showMessageDialog(null, "적합한 비밀번호인지 확인을 하지 않았습니다.", "회원가입 확인", JOptionPane.ERROR_MESSAGE);
				}
				else if (ageTextField.getText().isBlank()) {
					JOptionPane.showMessageDialog(null, "나이를 적지 않았습니다.", "회원가입 확인", JOptionPane.ERROR_MESSAGE);
				}
				else if (nameTextField.getText().isBlank()) {
					JOptionPane.showMessageDialog(null, "이름을 적지 않았습니다.", "회원가입 확인", JOptionPane.ERROR_MESSAGE);
				}
				else if (genderTextField.getText().isBlank()) {
					JOptionPane.showMessageDialog(null, "성별을 적지 않았습니다.", "회원가입 확인", JOptionPane.ERROR_MESSAGE);
				}
				else if (weightTextField.getText().isBlank()) {
					JOptionPane.showMessageDialog(null, "몸무게를 적지 않았습니다.", "회원가입 확인", JOptionPane.ERROR_MESSAGE);
				}
				else if (lengthTextField.getText().isBlank()) {
					JOptionPane.showMessageDialog(null, "키를 적지 않았습니다.", "회원가입 확인", JOptionPane.ERROR_MESSAGE);
				}
				else {
					SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd");
					Date date = new Date();
					String startDate = sdFormat.format(date);
					float tempWeight = Float.parseFloat(weightTextField.getText());
					float tempLength = Float.parseFloat(lengthTextField.getText());
					float tempBMI = (float)tempWeight / (tempLength * tempLength);
					checkMember = new Member(nameTextField.getText(), genderTextField.getText(), Integer.parseInt(ageTextField.getText()), 
							tempWeight, tempWeight, tempLength, startDate, idTextField.getText(), pwTextField.getText(), 1, 0, "", "", tempBMI);
					
					memberList.add(checkMember);
					signUpFrame.dispose();
					JOptionPane.showMessageDialog(null, "회원가입에 성공했습니다.", "회원가입 확인", JOptionPane.PLAIN_MESSAGE);
				}
				
			}
		});
		
		signUpFrame.setLayout(null);
		
		signUpFrame.add(idLabel);
		signUpFrame.add(idTextField);
		signUpFrame.add(idDupCheck);
		signUpFrame.add(pwLabel);
		signUpFrame.add(pwTextLabel);
		signUpFrame.add(pwTextField);
		signUpFrame.add(pwCheckLabel);
		signUpFrame.add(pwCheckTextField);
		signUpFrame.add(pwCheckButton);
		signUpFrame.add(ageLabel);
		signUpFrame.add(ageTextField);
		signUpFrame.add(nameLabel);
		signUpFrame.add(nameTextField);
		signUpFrame.add(genderLabel);
		signUpFrame.add(genderTextField);
		signUpFrame.add(weightLabel);
		signUpFrame.add(weightTextField);
		signUpFrame.add(lengthLabel);
		signUpFrame.add(lengthTextField);
		signUpFrame.add(signUpButton);
		
		
		signUpFrame.setSize(400, 550);
		signUpFrame.setVisible(true);
	}
	
	
	boolean id_DupCheck(String tempID) {
		Iterator<Member> id = memberList.iterator();
		while(id.hasNext()) {
			dupIDCheck = id.next();
			if(dupIDCheck.getMemberID().equals(tempID)) {
				return false;
			}
		}
		return true;
	}
	
	
	public boolean getType(String tempPW) {	// 비밀번호 영어, 숫자 확인
		
		boolean numeric = false;	// 처음에는 숫자 값, 영어 값 둘다 false로
		boolean alpha = false;
		boolean other = false;
		
		for (int i = 0; i < tempPW.length(); i++) {	// 입력 받은 tempPW 길이 만큼 반복
			int index = tempPW.charAt(i);	// index에 예비 비밀번호 charAt i번째 문자 넣기
			
			if(index >= 48 && index <= 57) {	// 만약에 index 값이 0~9 까지 존재할때
				numeric = true;	// true 넣어주기
			}
			else if(index >= 65 && index <= 122) {	// 만약에 index 값이 a~Z 까지 존재 할때
				alpha = true;	// true 넣어주기
			}
			else if (index < 65 && index > 57) {
				other = true;
			}
			else if (index > 122) {
				other = true;
			}
			else if (index < 48) {
				other = true;
			}
			
		}
		
		if(numeric == true && alpha == true && other == false) {	// 영어 숫자 둘다 존재할때
			return true;	// 적합한 비밀번호 이므로 true 반환
		}
		else if (other == true) {
			return false;
		}
		else if (numeric == true) {	// 숫자만 존재할때
			return false;	// false 반환
		}
		else if (alpha == true) {	// 영어만 존재할때
			return false;	// false 반환
		}
		else {	// 둘 다 존재하지 않을때 (특수문자, 한글, 한자)
			return false;	// false 반환
		}
	} // getType();
	
	
}
