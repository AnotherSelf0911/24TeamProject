package frame_pro;

import java.awt.event.WindowEvent;

public class WinClosingListener extends ListenerClass {
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("종료 버튼을 눌렀지만 종료는 안된다 이녀석아");
		
	}
	
}
