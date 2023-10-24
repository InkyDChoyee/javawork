package calculator;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener{
	// 필드
	String[] operator = {"+", "-", "X", "÷"};
	JComboBox<String> comboBox;
	JLabel label;
	JButton button;


	// 생성자
	public Calculator() {
		// 윈도우
		this.setTitle("사칙연산 프로그램");
		this.setSize(300, 120);
		this.setLocation(200, 100);

		// 패널 2개 생성 - BorderLayout
		JPanel pane1 = new JPanel();
		JPanel pane2 = new JPanel();

		this.add(pane1, BorderLayout.NORTH);
		this.add(pane2, BorderLayout.CENTER);

		// 컴포넌트 - FlowLayout
		pane1.setLayout(new FlowLayout());
		JTextField text1 = new JTextField(5);
		// 콤보박스
		comboBox = new JComboBox<>(operator);

		JTextField text2 = new JTextField(5);

		// 레이블
		label = new JLabel("=");
		JTextField text3 = new JTextField(5);

		// 버튼객체
		pane2.setLayout(new FlowLayout());
		JButton calcBtn = new JButton("계산");
		JButton resetBtn = new JButton("취소");

		pane1.add(text1);
		pane1.add(comboBox);
		pane1.add(text2);
		pane1.add(label);
		pane1.add(text3);

		pane2.add(calcBtn);
		pane2.add(resetBtn);

		// 이벤트
		ActionListener listener1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String op = (String)comboBox.getSelectedItem();	
				
				int num1 = Integer.parseInt(text1.getText());
				int num2 = Integer.parseInt(text2.getText());
				
				if(op.equals("+")) {
					int sum = num1 + num2;
					text3.setText(String.valueOf(sum));
				}else if(op.equals("-")) {
					int sum = num1 - num2;
					text3.setText(String.valueOf(sum));
				}else if(op.equals("X")) {
					int sum = num1 * num2;
					text3.setText(String.valueOf(sum));
				}else if(op.equals("÷")) {
					double sum = (double)(num1 / num2);
					text3.setText(String.valueOf(sum));
				}
				
				// switch문
//				switch(op) {
//				case "+" : 
//					int result = num1 + num2;
//					text3.setText(String.valueOf(result)); break;
//				case "-" : 
//					result = num1 - num2;
//					text3.setText(String.valueOf(result)); break;
//				case "X" : 
//					result = num1 * num2;
//					text3.setText(String.valueOf(result)); break;
//				case "÷" : 
//					double result2 = (double)(num1 / num2);
//					text3.setText(String.valueOf(result2)); break;
//				}
			}
		};
		calcBtn.addActionListener(listener1);

		ActionListener listener2 = new ActionListener() {
			// 취소 버튼 눌렀을 대 입력 초기화 구현
			@Override
			public void actionPerformed(ActionEvent e) {
				text1.setText("");
				text2.setText("");
				text3.setText("");
			}
		};
		resetBtn.addActionListener(listener2);

		// 디스플레이
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}




	@Override
	public void actionPerformed(ActionEvent e) {

	}
}
