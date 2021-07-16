package 새창데이터전달;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main2 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

	public static void main(String[] args) {

		JFrame f = new JFrame("main창");
		f.setSize(450, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		t1 = new JTextField();
		t1.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		t1.setBounds(93, 42, 249, 56);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		t2.setColumns(10);
		t2.setBounds(93, 119, 249, 56);
		f.getContentPane().add(t2);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(93, 24, 61, 16);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(93, 98, 61, 16);
		f.getContentPane().add(lblPassword);
		
		JLabel lblNewLabel_1 = new JLabel("오늘의 온도");
		lblNewLabel_1.setBounds(93, 290, 61, 16);
		f.getContentPane().add(lblNewLabel_1);
		
		t3 = new JTextField();
		t3.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		t3.setColumns(10);
		t3.setBounds(93, 307, 249, 56);
		f.getContentPane().add(t3);
		
		JButton b1 = new JButton("로그인처리");
		b1.setBounds(93, 199, 249, 68);
		JButton b2 = new JButton("결정");
		b2.setBounds(93, 375, 249, 68);
		
		b1.setFont(new Font("Dialog", Font.BOLD, 40));
		b2.setFont(new Font("Dialog", Font.BOLD, 40));
		f.getContentPane().setLayout(null);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				새창3 w3 = new 새창3();
				w3.open3(t1.getText(), t2.getText());
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				새창4 w4 = new 새창4();
				w4.open4(Integer.parseInt(t3.getText()));
			}
		});
		
		f.setVisible(true);

	}
}
