package frame_pro;

import java.awt.*;

public class FrameTest05 {

	public static void main(String[] args) {
		
		MyFrame fr = new MyFrame();
		fr.setBackground(Color.yellow);
		fr.setTitle("다섯번째 사용자 프레임");
		
		fr.addWindowListener(new MyEventListener());
	}

}
