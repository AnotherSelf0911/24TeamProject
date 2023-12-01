package frame_pro;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FrameTest02 {

	public static void main(String[] args) {
		
		/*
		// #1
		JFrame fr = new JFrame("두 번째");
		
		fr.setSize(400, 400); // 너비, 높이
		fr.setLocation(800, 100); // x좌표, y좌표
		
		// x버튼 눌렀을때 닫기
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		fr.setVisible(true);
		*/
		
		// #2
		
		Frame frame = new Frame("문장 입력기");
		
		frame.setBounds(800, 100, 250, 400);
		frame.setBackground(Color.black);
		
		// 폰트
		Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 18);
		
		// 북쪽
		// Panel : 컴포넌트 구조물을 하나로 묶음
		Panel pNorth = new Panel();
		pNorth.setBackground(Color.white);
		
		
		// 입력 상자 만들기
		
		TextField tf = new TextField(10); // 입력상자 길이
		Button btn = new Button("입력");
		
		btn.setEnabled(false);
		
		// Panel에 입력상자 넣기
		pNorth.add(tf);
		pNorth.add(btn);
		pNorth.setFont(font);
		
		// 중앙
		// TextArea(String text, int rows, int columns, 스크롤 종류);
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBackground(Color.white);
		ta.setFont(font);
		ta.setEditable(false);
		
		// 남쪽
		Panel pSouth = new Panel();
		pSouth.setFont(font);
		pSouth.setBackground(Color.gray);
		
		Button btnSave = new Button("저장");
		Button btnLoad = new Button("불러오기");
		Button btnClose = new Button("닫기");
		
		pSouth.add(btnSave);
		pSouth.add(btnLoad);
		pSouth.add(btnClose);
		
		// 컴포넌트에 배치
		frame.add(pNorth, BorderLayout.NORTH);
		frame.add(ta, BorderLayout.CENTER);
		frame.add(pSouth, BorderLayout.SOUTH);
		
		frame.setVisible(true);
		frame.setResizable(false); // 창의 크기 조절 불가
		
		// ================================================================
		
		
		// TextField에 값이 들어간 경우에만
		tf.addTextListener(new TextListener() {
			
			@Override
			public void textValueChanged(TextEvent e) {
				if(tf.getText().equals("")) {
					btn.setEnabled(false);
				}
				else {
					btn.setEnabled(true);
				}
				
			}
		});
		
		// key 이벤트
		tf.addKeyListener(new KeyAdapter() {
	         
	         @Override
	         public void keyTyped(KeyEvent e) {
	            
	            if(e.getKeyChar() == KeyEvent.VK_ENTER){
	               ta.append(tf.getText()+"\n");
	               
	               
	               tf.setText("");
	               tf.requestFocus();   
	            }
	         }
	     });
		
		//------------------Button이벤트(입력)--------------------
	      btn.addActionListener(new ActionListener() {   
	         @Override
	         public void actionPerformed(ActionEvent e) {
	            ta.append(tf.getText()+"\n");
	            
	            
	            tf.setText("");
	            tf.requestFocus();
	            
	         }
	      });
	      //------------------Button이벤트(닫기)--------------------
	      btnClose.addActionListener(new ActionListener() {
	         @Override
	         public void actionPerformed(ActionEvent e) {
	            System.exit(0);
	         }
	      });
	      
	      //------------------Button이벤트(저장)--------------------
	      btnSave.addActionListener(new ActionListener() {   
	         @Override
	         public void actionPerformed(ActionEvent e) {
	            String message=ta.getText();
	            
	            try {
	               
	               FileDialog fd=new FileDialog(frame, "저장",FileDialog.SAVE );
	               fd.setVisible(true);
	               
	               String path=fd.getDirectory()+fd.getFile();
	               
	               if(!message.equals("")) { //message에 데이터가 비워있지 않다면
	                  FileWriter fw=new FileWriter(path);
	                  BufferedWriter bw=new BufferedWriter(fw);            
	                  bw.write(message);
	                  if(fd.getFile() != null) {
	                     JOptionPane.showMessageDialog(frame, path+"\n 경로에 저장했습니다.");
	                  }
	                  bw.close();
	               }else { 
	                  JOptionPane.showMessageDialog(frame, "저장 할 내용이 없습니다.");
	               }
	               
	            } catch (IOException e1) {
	               e1.printStackTrace();
	            }
	         }
	      });
	      
	      
	      //파일불러오기
	      btnLoad.addActionListener(new ActionListener() {   
	         @Override
	            public void actionPerformed(ActionEvent e) {
	                FileDialog fileDialog = new FileDialog(frame, "파일 불러오기", FileDialog.LOAD);
	                fileDialog.setVisible(true);

	                String directory = fileDialog.getDirectory();
	                String fileName = fileDialog.getFile();

	                if (directory != null && fileName != null) {
	                    String filePath = directory + fileName;
	                    try {
	                        StringBuilder fileContent = new StringBuilder();
	                        BufferedReader br = new BufferedReader(new FileReader(filePath));
	                        String line;
	                        while ((line = br.readLine()) != null) {
	                            fileContent.append(line).append("\n");
	                        }
	                        br.close();

	                        ta.setText(fileContent.toString());
	                    } catch (IOException ex) {
	                        ex.printStackTrace();
	                        JOptionPane.showMessageDialog(frame, "파일을 불러오는 도중 오류가 발생했습니다.");
	                    }
	                }
	            }
	        });

	      
	      
	      //종료
	      frame.addWindowListener(new WindowAdapter() {
	         @Override
	         public void windowClosing(WindowEvent e) {
	            System.exit(0);
	         }
	      });


	}

}
