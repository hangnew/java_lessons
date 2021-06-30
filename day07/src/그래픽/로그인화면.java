package 그래픽;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 로그인화면 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {



		JFrame f = new JFrame("로그인");
		f.setSize(400, 300);
		f.getContentPane().setLayout(null);

		JLabel l1 = new JLabel("아이디");
		l1.setBounds(65, 55, 61, 16);
		f.getContentPane().add(l1);

		JLabel l2 = new JLabel("패스워드");
		l2.setBounds(65, 112, 61, 16);
		f.getContentPane().add(l2);

		JLabel l3 = new JLabel("");
		l3.setForeground(Color.RED);
		l3.setBounds(65, 233, 61, 16);
		f.getContentPane().add(l3);

		t1 = new JTextField();
		t1.setBounds(138, 50, 130, 26);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(138, 107, 130, 26);
		f.getContentPane().add(t2);

		JButton b1 = new JButton("로그인");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String pw = t2.getText();
				
				if (id.equals("root") && pw.equals("1111")) {
					l3.setText("로그인 성공");
				} else {
					l3.setText("로그인 실패");
				}
			}
		});
		b1.setBounds(36, 170, 117, 29);
		f.getContentPane().add(b1);

		JButton b2 = new JButton("지우기");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
			}
		});
		b2.setBounds(189, 170, 117, 29);
		f.getContentPane().add(b2);

		f.setVisible(true);
	}
}
