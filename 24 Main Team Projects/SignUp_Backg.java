package design;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class SignUp_Backg extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp_Backg frame = new SignUp_Backg();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SignUp_Backg() {
		
		
		Font font = new Font("배달의민족 도현", Font.PLAIN, 14);

		setBounds(0, 0, 533, 950);
		
		JLabel idLabel = new JLabel("아이디");
		idLabel.setBounds(80, 181, 80, 30);
		idLabel.setFont(new Font("배달의민족 도현", Font.PLAIN, 20));
		
		JTextField idTextField = new JTextField();
		idTextField.setBounds(180, 182, 130, 30);
		
		JButton idDupCheck = new JButton("ID 중복확인");
		idDupCheck.setBounds(322, 181, 100, 30);
		
		JLabel pwLabel = new JLabel("비밀번호 (영문 + 숫자 조합 8 ~ 16자리)");
		pwLabel.setBounds(80, 216, 400, 30);
		pwLabel.setFont(new Font("배달의민족 도현", Font.PLAIN, 20));
		JLabel pwTextLabel = new JLabel("비밀번호");
		pwTextLabel.setBounds(80, 256, 120, 30);
		pwTextLabel.setFont(new Font("배달의민족 도현", Font.PLAIN, 20));
		JTextField pwTextField = new JTextField();
		pwTextField.setBounds(180, 257, 130, 30);
		JLabel pwCheckLabel = new JLabel("비밀번호 재확인");
		pwCheckLabel.setBounds(80, 296, 150, 30);
		pwCheckLabel.setFont(new Font("배달의민족 도현", Font.PLAIN, 20));
		JTextField pwCheckTextField = new JTextField();
		pwCheckTextField.setBounds(242, 297, 130, 30);
		
		JButton pwCheckButton = new JButton("비밀번호 확인");
		pwCheckButton.setBounds(322, 257, 110, 30);
		
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
		signUpButton.setBounds(205, 571, 85, 30);
		getContentPane().setLayout(null);
		
		getContentPane().add(idLabel);
		getContentPane().add(idTextField);
		getContentPane().add(idDupCheck);
		getContentPane().add(pwLabel);
		getContentPane().add(pwTextLabel);
		getContentPane().add(pwTextField);
		getContentPane().add(pwCheckLabel);
		getContentPane().add(pwCheckTextField);
		getContentPane().add(pwCheckButton);
		getContentPane().add(ageLabel);
		getContentPane().add(ageTextField);
		getContentPane().add(nameLabel);
		getContentPane().add(nameTextField);
		getContentPane().add(genderLabel);
		getContentPane().add(genderTextField);
		getContentPane().add(weightLabel);
		getContentPane().add(weightTextField);
		getContentPane().add(lengthLabel);
		getContentPane().add(lengthTextField);
		getContentPane().add(signUpButton);
		

		JLabel frameimg = new JLabel();
		frameimg.setBounds(-16, 0, 533, 950);
		frameimg.setIcon(new ImageIcon("image/signupbackground.png"));
		getContentPane().add(frameimg);
		
		
		frameimg.setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
