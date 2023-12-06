package teamProject;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame_Design {
	
	public void frameD() {
		
		JFrame framed = new JFrame();
		Font font = new Font("", Font.PLAIN, 14);
		
		framed.setBounds(100, 100, 533, 950);
		framed.setLocationRelativeTo(null);
		
		ImageIcon back = new ImageIcon("./image/background.png");//원있는 배경
		JLabel frameimg = new JLabel(back);
		framed.setBounds(0, 0, 533, 950);
		framed.getContentPane().add(frameimg);
		
		ImageIcon back2 = new ImageIcon("./image/signupbackground.png");//원 없는 배경
		JLabel frameimg2 = new JLabel(back);
		framed.setBounds(0, 0, 533, 950);
		framed.getContentPane().add(frameimg2);
		
		
	}
	
	

}
