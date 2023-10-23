package layouts;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoginWindow {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("레이아웃 예제");
		frame.setSize(300, 250);   // 300px너비, 200px높이
		frame.setLocation(200, 100);   // 200x좌표, 100y좌표
		frame.setLayout(null);
		
		JLabel labelLogin = new JLabel("아이디");
		labelLogin.setSize(80, 30);
		labelLogin.setLocation(30, 30);
		
		JLabel labelPassword = new JLabel("비밀번호");
		labelPassword.setSize(80, 30);
		labelPassword.setLocation(30, 60);
		
		JTextField textLogin = new JTextField();
		textLogin.setSize(120, 30);
		textLogin.setLocation(120, 30);
		
		JTextField textPassword = new JTextField();
		textPassword.setSize(120, 30);
		textPassword.setLocation(120, 60);

		JButton button = new JButton("로그인");
		button.setSize(80, 40);
		button.setLocation(100, 130);
		
		frame.add(textLogin);
		frame.add(textPassword);
		frame.add(labelLogin);  
		frame.add(labelPassword); 
		frame.add(button);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		
		
	}

}
