package layout;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonTest01 {

	public static void main(String[] args) {
		
		Frame f = new Frame("버튼 테스트");
		f.setBounds(200, 200, 400, 400);
		f.setLayout(null); // 자동배치 사용 안함
		
		Button btnOk = new Button("확인");
		btnOk.setBounds(70, 90, 100, 50);
		btnOk.setBackground(new Color(255, 0, 0));	// 버튼 색상
		
		Button btnClose = new Button("닫기");
		btnClose.setBounds(btnOk.getBounds());	// btnOk와 같은 사이즈 버튼
		btnClose.setLocation(btnOk.getX() + btnOk.getWidth() + 60, btnOk.getY());
		btnClose.setBackground(new Color(0, 255, 0));
		
		f.add(btnOk);
		f.add(btnClose);
		
		f.setVisible(true);
		
		// 창 닫기
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);	// 종료
			}
		});
	}

}
