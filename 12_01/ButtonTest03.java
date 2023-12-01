package layout;

import java.awt.*;

import javax.swing.*;

public class ButtonTest03 extends JFrame{
	JPanel main_Panel;
	JButton bt_img;
	ImageIcon img1 = new ImageIcon("btn1.jpg");
	ImageIcon img2 = new ImageIcon("btn1_1.jpg");
	
	public ButtonTest03() {
		
		setTitle("JButton 이미지 넣기");
		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		main_Panel = new JPanel(); // 패널 객체화. 기본 배치 FlowLayout
		main_Panel.setBackground(Color.white);
		
		bt_img = new JButton(img1);
		bt_img.setRolloverIcon(img2); // 버튼에 마우스 올라갈 때 이미지 변환
		bt_img.setBorderPainted(false); // 버튼 테두리 해제
		bt_img.setPreferredSize(new Dimension(150, 50));
		
		main_Panel.add(bt_img);
		add(main_Panel);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ButtonTest03();
	}
}
