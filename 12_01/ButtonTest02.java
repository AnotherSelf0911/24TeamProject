package layout;

import java.awt.*;
import java.awt.event.*;

public class ButtonTest02 {

	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setBounds(800, 100, 1000, 500);
		f.setLayout(new FlowLayout());
		
		Button btn1 = new Button("1");
		Button btn2 = new Button("2");
		Button btn3 = new Button("3");
		Button btn4 = new Button("4");
		
		btn1.setPreferredSize(new Dimension(200, 100));
		btn2.setPreferredSize(new Dimension(200, 100));
		btn3.setPreferredSize(new Dimension(200, 100));
		btn4.setPreferredSize(new Dimension(200, 100));
		
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		
		btn1.addActionListener(al);
		btn2.addActionListener(al);
		btn3.addActionListener(al);
		btn4.addActionListener(al);
		
		f.setVisible(true);
		
		
		// 창 닫기
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);	// 종료
			}
		});
	}// main
	
	static ActionListener al = new ActionListener() {
		  @Override
	      public void actionPerformed(ActionEvent e) {
	         
	         System.out.println(e.getActionCommand()); 
	         /*
	         System.out.println(e);
	         System.out.println(e.getID());
	         System.out.println(((Button)e.getSource()).getWidth());
	         */
	         // 버튼에 부착된 제목을 통해 어떤 버튼이 클릭 되어 있는지 구별
	         if(e.getActionCommand().equals("1")) {
	            System.out.println("1번 눌렀음");
	         }else if(e.getActionCommand().equals("2")) {
	            System.out.println("2번 눌렀음");
	         }else if(e.getActionCommand().equals("3")) {
	            System.out.println("3번 눌렀음");
	         }else if(e.getActionCommand().equals("4")) {
	            System.out.println("4번 눌렀음");
	         }
	         System.out.println("-------------------------------");
	      }
	 };

}
