package 새창데이터전달;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {

		JFrame f = new JFrame("main창");
		f.setSize(350, 200);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Font font = new Font(null, Font.BOLD, 50);
		JButton b1 = new JButton("새창열기1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				새창1 w1 = new 새창1();
				w1.open1("너무 더워서");
//				f.setVisible(false);
			}
		});
		JButton b2 = new JButton("새창열기2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				새창2 w2 = new 새창2();
				w2.open2("너무 습해서");
//				f.setVisible(false);
			}
		});
		b1.setFont(font);
		b2.setFont(font);
		f.add(b1);
		f.add(b2);
		f.setVisible(true);

	}

}
