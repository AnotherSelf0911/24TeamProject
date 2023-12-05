package teamProject;

import java.awt.Font;

import javax.swing.*;

public class SignUp2 {
	public SignUp2() {
		JFrame signUpFrame = new JFrame("회원가입 창"); // 프레임 생성
		Font defaultFont = new Font("", Font.PLAIN, 14);
		JScrollPane scroll = new JScrollPane();
		
		JLabel idLabel = new JLabel("아이디 : ");
		idLabel.setBounds(20, 20, 80, 30);
		idLabel.setFont(defaultFont);
		
		JTextField idTextField = new JTextField();
		idTextField.setBounds(100, 22, 150, 28);
		
		
		signUpFrame.setLayout(null);
		
		scroll.add(idLabel);
		
		
		signUpFrame.setSize(400, 550);
		signUpFrame.setVisible(true);
	}
}
