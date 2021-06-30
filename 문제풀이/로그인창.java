package 문제풀이;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class 로그인창 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
	
		JFrame f = new JFrame("로그인 처리 화면");
		f.setSize(450,550);
		f.getContentPane().setLayout(null);
		

		
		
		JLabel lab1 = new JLabel("아이디:");
		lab1.setHorizontalAlignment(SwingConstants.LEFT);
		lab1.setFont(new Font("NanumSquare", Font.BOLD, 30));
		lab1.setBounds(40, 112, 99, 45);
		f.getContentPane().add(lab1);
		
		JLabel lab2 = new JLabel("패스워드:");
		lab2.setHorizontalAlignment(SwingConstants.LEFT);
		lab2.setFont(new Font("NanumSquare", Font.BOLD, 30));
		lab2.setBounds(40, 247, 117, 45);
		f.getContentPane().add(lab2);
		
		t1 = new JTextField();
		t1.setBounds(191, 112, 242, 37);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(191, 247, 242, 37);
		f.getContentPane().add(t2);
		
		
		JLabel result = new JLabel("결과 보이는곳");
		result.setForeground(Color.RED);
		result.setBounds(40, 468, 79, 16);
		f.getContentPane().add(result);
		
		JButton b1 = new JButton("로그인");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//버튼 누를 때마다 실행
				String s1 = t1.getText();
				String s2 = t2.getText();
			
				if (s1.equals("root") && s2.equals("pass")) {
					result.setText("로그인 성공");
				}else {
					result.setText("로그인 실패");
				}
			}
		});
		b1.setFont(new Font("NanumSquare", Font.BOLD, 25));
		b1.setBounds(40, 370, 154, 70);
		f.getContentPane().add(b1);
		
		JButton btnNewButton_1 = new JButton("지우기");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("NanumSquare", Font.BOLD, 25));
		btnNewButton_1.setBounds(266, 370, 154, 70);
		f.getContentPane().add(btnNewButton_1);
		
	
		f.setVisible(true);
	}
}
