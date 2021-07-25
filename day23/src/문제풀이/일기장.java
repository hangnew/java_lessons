package 문제풀이;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 일기장 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

	public static void main(String[] args) {
		
		JFrame f = new JFrame("나의 일기장");
		f.setSize(400, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(null);
		
		JLabel l1 = new JLabel("오늘의 날짜");
		l1.setBounds(20, 29, 61, 16);
		f.getContentPane().add(l1);
		
		JLabel l2 = new JLabel("오늘의 제목");
		l2.setBounds(20, 57, 61, 16);
		f.getContentPane().add(l2);
		
		JLabel l3 = new JLabel("오늘의 내용");
		l3.setBounds(20, 85, 61, 16);
		f.getContentPane().add(l3);
		
		t1 = new JTextField();
		t1.setBounds(93, 24, 283, 26);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(93, 52, 283, 26);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(93, 80, 283, 241);
		f.getContentPane().add(t3);
		
		JButton b1 = new JButton("파일에 일기 저장");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String date = t1.getText();
					String title = t2.getText();
					String content = t3.getText();
					FileWriter file = new FileWriter(date + ".txt");
					file.write("날짜: " + date + "\n");
					file.write("제목: " + title + "\n");
					file.write("내용: " + content + "\n");
					file.close();
					JOptionPane.showMessageDialog(f, "일기 저장 완료");
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(f, "일기 저장 실패");
				}
				
			} // actionPerformed
		});
		b1.setBounds(135, 333, 117, 29);
		f.getContentPane().add(b1);
		
		f.setVisible(true);
		
	}
}
