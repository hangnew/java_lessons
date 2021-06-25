package 문제풀이;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 로그인 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {

		JFrame f = new JFrame(); // 새로운 frame 생성
		f.setSize(400, 200); // frame 사이즈 설정
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel_1_1 = new JLabel("아이디");
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(30, 31, 114, 25);
		f.getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("패스워드");
		lblNewLabel_1_2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(30, 74, 114, 25);
		f.getContentPane().add(lblNewLabel_1_2);

		t1 = new JTextField();
		t1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		t1.setColumns(10);
		t1.setBounds(175, 26, 194, 36);
		f.getContentPane().add(t1);

		t2 = new JTextField();
		t2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		t2.setColumns(10);
		t2.setBounds(175, 69, 194, 36);
		f.getContentPane().add(t2);

		JButton btnNewButton_1 = new JButton("로그인");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id2 = t1.getText();
				String pw2 = t2.getText();
			}
		});
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnNewButton_1.setBounds(30, 120, 160, 36);
		f.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("지우기");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnNewButton_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnNewButton_1_1.setBounds(209, 120, 160, 36);
		f.getContentPane().add(btnNewButton_1_1);

		f.setVisible(true); // frame 표시하기 true
	}
}
