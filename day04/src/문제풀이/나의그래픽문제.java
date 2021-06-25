package 문제풀이;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의그래픽문제 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {

		JFrame f = new JFrame(); // 새로운 frame 생성
		f.setSize(400, 500); // frame 사이즈 설정
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("먹고 싶은 음식");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setBounds(30, 41, 114, 25);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("당신의 나이는");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(30, 174, 114, 25);
		f.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("국어 점수");
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(30, 318, 114, 25);
		f.getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("수학 점수");
		lblNewLabel_1_2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(30, 361, 114, 25);
		f.getContentPane().add(lblNewLabel_1_2);

		t1 = new JTextField();
		t1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		t1.setBounds(175, 36, 194, 36);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		t2.setColumns(10);
		t2.setBounds(175, 169, 194, 36);
		f.getContentPane().add(t2);

		t3 = new JTextField();
		t3.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		t3.setColumns(10);
		t3.setBounds(175, 313, 194, 36);
		f.getContentPane().add(t3);

		t4 = new JTextField();
		t4.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		t4.setColumns(10);
		t4.setBounds(175, 356, 194, 36);
		f.getContentPane().add(t4);

		JButton btnNewButton = new JButton("어디로 갈까?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // 버튼 click시 실행될 함수
				String s1 = t1.getText();
				if (s1.equals("아메리카노") || s1.equals("아이스 아메리카노") || s1.equals("홍차")) {
					JOptionPane.showMessageDialog(f, "카페 가세요.");
				} else {
					JOptionPane.showMessageDialog(f, "물이나 마셔요.");
				}
			}
		});
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnNewButton.setBounds(30, 78, 339, 36);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("나의 내년 나이는?");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s2 = t2.getText();
				int age = Integer.parseInt(s2);
				JOptionPane.showMessageDialog(f, (age + 1) + "살");
			}
		});
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnNewButton_1.setBounds(30, 211, 339, 36);
		f.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("두 과목 점수의 평균은?");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s3 = t3.getText(); // 국어점수 string
				String s4 = t4.getText(); // 수학점수 string
				int g1 = Integer.parseInt(s3); // 국어점수 int로 변환
				int g2 = Integer.parseInt(s4); // 수학점수 int로 변환
				double avg = (g1 + g2) / 2.0;
				JOptionPane.showMessageDialog(f, avg + "점");
			}
		});
		btnNewButton_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnNewButton_1_1.setBounds(30, 398, 339, 36);
		f.getContentPane().add(btnNewButton_1_1);

		f.setVisible(true); // frame 표시하기 true
	}
}


