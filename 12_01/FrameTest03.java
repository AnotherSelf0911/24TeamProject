package frame_pro;

import java.awt.*;

public class FrameTest03 {

	public static void main(String[] args) {
		
		// 프레임 화면을 항상 화면 중앙에 위치
		Frame fr = new Frame("세번째");
		fr.setSize(400, 400);
		
		// 1. Toolkit을 통해 모니터 해상도 얻어오기
		Toolkit tk = Toolkit.getDefaultToolkit();
		
		// 2. Dimension을 통해 너비와 높이 구하기
		Dimension di = tk.getScreenSize();
		int monitorW = di.width;
		int monitorH = di.height;
		
		// 3. 프레임 좌우 크기 빼주기
		int x = monitorW / 2 - fr.getWidth() / 2;
		int y = monitorH / 2 - fr.getHeight() / 2;
		
		fr.setLocation(x, y);
		fr.setVisible(true);
		
		
	}

}
