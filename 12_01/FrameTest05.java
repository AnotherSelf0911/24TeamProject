package frame_pro;

import java.awt.*;
import java.awt.event.*;

public class FrameTest05 {

	public static void main(String[] args) {
		
		MyFrame fr = new MyFrame();
		fr.setBackground(Color.yellow);
		fr.setTitle("다섯번째 사용자 프레임");
		
		// #1 fr.addWindowListener(new MyEventListener());
		// #2 fr.addWindowListener(new WinClosingListener());
		// #3 익명 내부 클래스로 바로 어댑터 생성
		fr.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("어댑터 생성하여 감지!!");
			}
		});
	}

}
