package data;

import java.awt.Font;
// import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import de.LoginMenu2;

public class SignUp2 {
	
	//List<Member> memberList = new ArrayList<>();
	Member checkMember;
	Member dupIDCheck;
	String idCheck = "";
	String pwCheck = "null";
	
	public SignUp2() {
		signUpStart();
    }
	
	public void signUpStart() {
		
		JFrame signUpFrame = new JFrame("회원가입 창"); // 프레임 생성
		signUpFrame.setBounds(0, 0, 533, 950);
		signUpFrame.getContentPane().setLayout(null);
		signUpFrame.setVisible(true);
		
		JLabel idLabel = new JLabel("아이디");
		idLabel.setBounds(80, 181, 80, 30);
		idLabel.setFont(new Font("배달의민족 도현", Font.PLAIN, 20));
		
		JTextField idTextField = new JTextField();
		idTextField.setBounds(180, 182, 130, 30);
		
		JButton idDupCheck = new JButton("ID 중복확인");
		idDupCheck.setFont(new Font("배달의민족 도현", Font.PLAIN, 10));
		idDupCheck.setBounds(322, 181, 100, 30);
		
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
		pwLabel.setBounds(80, 216, 400, 30);
		pwLabel.setFont(new Font("배달의민족 도현", Font.PLAIN, 20));
		JLabel pwTextLabel = new JLabel("비밀번호");
		pwTextLabel.setBounds(80, 256, 120, 30);
		pwTextLabel.setFont(new Font("배달의민족 도현", Font.PLAIN, 20));
		JTextField pwTextField = new JTextField();
		pwTextField.setBounds(180, 257, 130, 30);
		JLabel pwCheckLabel = new JLabel("비밀번호 재확인");
		pwCheckLabel.setFont(new Font("배달의민족 도현", Font.PLAIN,20));
		pwCheckLabel.setBounds(80, 296, 150, 30);
		pwCheckLabel.setFont(new Font("배달의민족 도현", Font.PLAIN, 20));
		JTextField pwCheckTextField = new JTextField();
		pwCheckTextField.setBounds(242, 297, 130, 30);
		JButton pwCheckButton = new JButton("비밀번호 확인");
		pwCheckButton.setFont(new Font("배달의민족 도현", Font.PLAIN,10));		
		pwCheckButton.setBounds(322, 257, 110, 30);
		
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
		ageLabel.setBounds(80, 331, 60, 30);
		ageLabel.setFont(new Font("배달의민족 도현", Font.PLAIN, 20));
		JTextField ageTextField = new JTextField();
		ageTextField.setBounds(180, 336, 130, 30);
		
		JLabel nameLabel = new JLabel("이름");
		nameLabel.setBounds(80, 371, 60, 30);
		nameLabel.setFont(new Font("배달의민족 도현", Font.PLAIN, 20));
		JTextField nameTextField = new JTextField();
		nameTextField.setBounds(180, 376, 130, 30);
		
		JLabel genderLabel = new JLabel("성별");
		genderLabel.setBounds(80, 411, 60, 30);
		genderLabel.setFont(new Font("배달의민족 도현", Font.PLAIN, 20));
		JTextField genderTextField = new JTextField();
		genderTextField.setBounds(180, 416, 130, 30);
		
		JLabel weightLabel = new JLabel("몸무게");
		weightLabel.setBounds(80, 451, 80, 30);
		weightLabel.setFont(new Font("배달의민족 도현", Font.PLAIN, 20));
		JTextField weightTextField = new JTextField();
		weightTextField.setBounds(180, 456, 130, 30);
		
		JLabel lengthLabel = new JLabel("키");
		lengthLabel.setBounds(80, 491, 40, 30);
		lengthLabel.setFont(new Font("배달의민족 도현", Font.PLAIN, 20));
		JTextField lengthTextField = new JTextField();
		lengthTextField.setBounds(180, 496, 130, 30);
		
		JButton signUpButton = new JButton("회원가입");
		signUpButton.setFont(new Font("배달의민족 도현", Font.PLAIN,15));
		signUpButton.setBounds(205, 571, 100, 30);
		
		
		
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
					
					LoginMenu2.memberList.add(checkMember);
					signUpFrame.dispose();
					JOptionPane.showMessageDialog(null, "회원가입에 성공했습니다.", "회원가입 확인", JOptionPane.PLAIN_MESSAGE);
				}
				
			}
		});
		
		signUpFrame.getContentPane().setLayout(null);
		
		signUpFrame.getContentPane().add(idLabel);
		signUpFrame.getContentPane().add(idTextField);
		signUpFrame.getContentPane().add(idDupCheck);
		signUpFrame.getContentPane().add(pwLabel);
		signUpFrame.getContentPane().add(pwTextLabel);
		signUpFrame.getContentPane().add(pwTextField);
		signUpFrame.getContentPane().add(pwCheckLabel);
		signUpFrame.getContentPane().add(pwCheckTextField);
		signUpFrame.getContentPane().add(pwCheckButton);
		signUpFrame.getContentPane().add(ageLabel);
		signUpFrame.getContentPane().add(ageTextField);
		signUpFrame.getContentPane().add(nameLabel);
		signUpFrame.getContentPane().add(nameTextField);
		signUpFrame.getContentPane().add(genderLabel);
		signUpFrame.getContentPane().add(genderTextField);
		signUpFrame.getContentPane().add(weightLabel);
		signUpFrame.getContentPane().add(weightTextField);
		signUpFrame.getContentPane().add(lengthLabel);
		signUpFrame.getContentPane().add(lengthTextField);
		signUpFrame.getContentPane().add(signUpButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(SignUp2.class.getResource("/image/signupbackground.png")));
		lblNewLabel.setBounds(-6, 0, 533, 950);
		signUpFrame.getContentPane().add(lblNewLabel);
		
		JLabel frameimg = new JLabel();
		frameimg.setBounds(-16, 0, 533, 950);
		frameimg.setIcon(new ImageIcon("image/signupbackground.png"));
		
		signUpFrame.setVisible(true);
	}
	
	
	private AbstractButton getContentPane() {
		// TODO Auto-generated method stub
		return null;
	}

	boolean id_DupCheck(String tempID) {
		Iterator<Member> id = LoginMenu2.memberList.iterator();
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
