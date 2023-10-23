package compronents;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JButton1 {

	public static void main(String[] args) {
		// 프레임
		JFrame frame = new JFrame();
		
		frame.setTitle("레이아웃 예제");
		frame.setSize(300, 200);   // 300px너비, 200px높이
		frame.setLocation(200, 100);   // 200x좌표, 100y좌표
		
		// 버튼 객체
		JButton button1 = new JButton("북");
		JButton button2 = new JButton("남");
		JButton button3 = new JButton("서");
		JButton button4 = new JButton("동");
		JButton button5 = new JButton("중앙");
		
		// 프레임 추가, 배치
		frame.add(button1, BorderLayout.NORTH);  // 버튼을 프레임에 추가
		frame.add(button2, BorderLayout.SOUTH); 
		frame.add(button3, BorderLayout.WEST);  
		frame.add(button4, BorderLayout.EAST);  
		frame.add(button5, BorderLayout.CENTER); 
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
