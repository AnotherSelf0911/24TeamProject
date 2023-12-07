package design;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class F_Backg extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					F_Backg frame = new F_Backg();
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
	public F_Backg() {
		
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
			}
		});
		signUpButton.setIcon(new ImageIcon("image/signupbutton.png")); //회원가입버튼 사진 삽입
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
		loginButton.setIcon(new ImageIcon("image/loginbutton.png"));//로그인버튼 사진 삽입
		loginButton.setBounds(219, 477, 85, 35);
		loginButton.setVisible(true);
		loginButton.setContentAreaFilled(false); //버튼 배경선 false
		loginButton.setBorderPainted(false); //버튼 배경 false
		
		getContentPane().add(loginButton);
		JLabel frameimg = new JLabel();
		frameimg.setIcon(new ImageIcon("image/background.png"));
		frameimg.setBounds(0, 0, 533, 950);
		getContentPane().add(frameimg);
		frameimg.setVisible(true);
		
		JLabel lblNewLabel2 = new JLabel("New label");
		setVisible(true);
		
	}
}
