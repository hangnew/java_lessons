package 그래픽프로그램;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 버튼5개 {

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 버튼 5개"); // ()괄호 안에 window창의 제목
		// 기존에 존재하던 Frame에 기능을 추가해 J를 추가했다 (이름이 JFrame인 이유)
		// 컨테이너 container (window 역할)
		f.setSize(500, 500);
		
		JButton btnNewButton = new JButton("북쪽");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "북쪽입니다");
			}
		});
		btnNewButton.setBackground(new Color(255, 153, 0));
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("서쪽");
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("중앙");
		btnNewButton_2.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		f.getContentPane().add(btnNewButton_2, BorderLayout.CENTER);
		
		JButton btnNewButton_3 = new JButton("동쪽");
		btnNewButton_3.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		f.getContentPane().add(btnNewButton_3, BorderLayout.EAST);
		
		JButton btnNewButton_4 = new JButton("남쪽");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "남쪽입니다");
			}
		});
		btnNewButton_4.setBackground(new Color(255, 153, 0));
		btnNewButton_4.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		f.getContentPane().add(btnNewButton_4, BorderLayout.SOUTH);
		f.setVisible(true);
		// set : 설정 명령어 - return이 없다 - void
		// get : return 존재
	}
}
