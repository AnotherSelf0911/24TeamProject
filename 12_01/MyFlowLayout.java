package layout;

import java.awt.*;
import java.awt.event.*;

public class MyFlowLayout {
	Frame f = new Frame();
	Button jb1 = new Button("버튼 1");
	Button jb2 = new Button("버튼 2");
	Button jb3 = new Button("버튼 3");
	Button jb4 = new Button("버튼 4");
	Button jb5 = new Button("버튼 5");
	Button jb6 = new Button("버튼 6");
	
	// 생성자
	public MyFlowLayout() {
		f.setLayout(new FlowLayout());	// Frame을 FlowLayout으로 세팅, 왼쪽 정렬이 기본
		f.add(jb1);
		f.add(jb2);
		f.add(jb3);
		f.add(jb4);
		f.add(jb5);
		f.add(jb6);
		
		f.setSize(400, 300);
		f.setVisible(true);
		
		// 창 닫기
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);	// 종료
			}
		});
	}// 생성자
	
	public static void main(String[] args) {
		new MyFlowLayout();
	}
	
}
