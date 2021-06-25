package 문제풀이;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 계산기 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {

		JFrame f = new JFrame(); // 새로운 frame 생성
		f.setSize(400, 250); // frame 사이즈 설정
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel_1_1 = new JLabel("숫자 1");
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(30, 31, 114, 25);
		f.getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("숫자 2");
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

		JButton btnNewButton_1 = new JButton("더하기");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				JOptionPane.showMessageDialog(f, i1 + i2);
			}
		});
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnNewButton_1.setBounds(30, 111, 160, 36);
		f.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("빼기");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				JOptionPane.showMessageDialog(f, i1 - i2);
			}
		});
		btnNewButton_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnNewButton_1_1.setBounds(209, 111, 160, 36);
		f.getContentPane().add(btnNewButton_1_1);

		JButton btnNewButton_1_2 = new JButton("곱하기");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				JOptionPane.showMessageDialog(f, i1 * i2);
			}
		});
		btnNewButton_1_2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnNewButton_1_2.setBounds(30, 159, 160, 36);
		f.getContentPane().add(btnNewButton_1_2);

		JButton btnNewButton_1_1_1 = new JButton("나누기");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				JOptionPane.showMessageDialog(f, "몫: "+(i1/i2)+", 나머지: "+(i1%i2));
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnNewButton_1_1_1.setBounds(209, 159, 160, 36);
		f.getContentPane().add(btnNewButton_1_1_1);

		f.setVisible(true); // frame 표시하기 true
	}
}
