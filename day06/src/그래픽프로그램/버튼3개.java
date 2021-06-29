package 그래픽프로그램;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class 버튼3개 {

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 버튼 3개");
		f.setSize(500, 500);
		f.getContentPane().setLayout(null); // layout을 지정하지 않으면 원하는 위치에 넣을 수 있다

		JButton btnNewButton = new JButton("별 10개");
		btnNewButton.setBackground(new Color(204, 0, 0));
		btnNewButton.setOpaque(true);
		btnNewButton.setBorderPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 10; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
		});
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnNewButton.setBounds(123, 51, 250, 84);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("커피* 5");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 5; i++) {
					System.out.print("커피*");
				}
				System.out.println();
			}
		});
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnNewButton_1.setBounds(123, 147, 250, 84);
		f.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("커피*우유 3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 3; i++) {
					System.out.println("커피*우유");
				}
			}
		});
		btnNewButton_2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnNewButton_2.setBounds(123, 243, 250, 84);
		f.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_2_1 = new JButton("1:짱!");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 1; i < 4; i++) {
					System.out.println(i + " : 짱!");
				}
			}
		});
		btnNewButton_2_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnNewButton_2_1.setBounds(123, 339, 250, 84);
		f.getContentPane().add(btnNewButton_2_1);

		f.setVisible(true);
	}
}
