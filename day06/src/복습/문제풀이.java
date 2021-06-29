package 복습;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

public class 문제풀이 {

	public static void main(String[] args) {
		JFrame f = new JFrame("버튼 문제");
		f.setSize(500, 400);
		f.getContentPane().setLayout(null);

		ImageIcon icon1 = new ImageIcon("button1.png");
		ImageIcon icon2 = new ImageIcon("button2.png");
		ImageIcon icon3 = new ImageIcon("button3.jpeg");
		ImageIcon icon4 = new ImageIcon("button4.png");

		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String times = JOptionPane.showInputDialog(f, "몇번 울리실래요?");
				int times2 = Integer.parseInt(times);
				
				for (int i = 0; i < times2; i++) {
					JOptionPane.showMessageDialog(f, "빵!");
				}
			}
		});
		b1.setBounds(20, 30, 140, 140);
		f.getContentPane().add(b1);
		b1.setIcon(icon1);

		JButton b2 = new JButton();
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random r = new Random();
				int num = r.nextInt(5);
				switch (num) {
				case 1:
					JOptionPane.showMessageDialog(f, "짜장면을 드시오.");
					break;
				case 2:
					JOptionPane.showMessageDialog(f, "우동을 드시오.");
					break;
				case 3:
					JOptionPane.showMessageDialog(f, "파스타를 드시오.");
					break;
				case 4:
					JOptionPane.showMessageDialog(f, "김밥 드시오.");
					break;
				default:
					JOptionPane.showMessageDialog(f, "비빔밥을 드시오.");
					break;
				}
			}
		});
		b2.setBounds(172, 30, 140, 140);
		f.getContentPane().add(b2);
		b2.setIcon(icon2);

		JButton b3 = new JButton();
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String year = JOptionPane.showInputDialog(f, "언제 태어나셨나요? (예:1990)");
				int animal = Integer.parseInt(year) % 12;
				switch (animal) {
				case 0:
					JOptionPane.showMessageDialog(f, "원숭이띠에요");
					break;
				case 1:
					JOptionPane.showMessageDialog(f, "닭띠에요");
					break;
				case 2:
					JOptionPane.showMessageDialog(f, "개띠에요");
					break;
				case 3:
					JOptionPane.showMessageDialog(f, "돼지띠에요");
					break;
				case 4:
					JOptionPane.showMessageDialog(f, "쥐띠에요");
					break;
				case 5:
					JOptionPane.showMessageDialog(f, "소띠에요");
					break;
				case 6:
					JOptionPane.showMessageDialog(f, "호랑이띠에요");
					break;
				case 7:
					JOptionPane.showMessageDialog(f, "토끼띠에요");
					break;
				case 8:
					JOptionPane.showMessageDialog(f, "용띠에요");
					break;
				case 9:
					JOptionPane.showMessageDialog(f, "뱀띠에요");
					break;
				case 10:
					JOptionPane.showMessageDialog(f, "말띠에요");
					break;
				default:
					JOptionPane.showMessageDialog(f, "양띠에요");
					break;
				}
			}
		});
		b3.setBounds(324, 30, 140, 140);
		f.getContentPane().add(b3);
		b3.setIcon(icon3);

		JButton b4 = new JButton();
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = JOptionPane.showInputDialog(f, "몇 번째 자음이 궁금한가요?");
				int num2 = Integer.parseInt(num) - 1;

				String kor = "가나다라마바사아자차카타파하";

				if (num2 > 0 && num2 < 15) {
					char kor2 = kor.charAt(num2);
					JOptionPane.showMessageDialog(f, num + "번째 자음: " + kor2);
				} else {
					JOptionPane.showMessageDialog(f, "1~14 사이의 숫자를 입력하세요.");
				}
			}
		});
		b4.setBounds(108, 182, 140, 140);
		f.getContentPane().add(b4);
		b4.setIcon(icon4);

		JButton b5 = new JButton();
		b5.setBounds(260, 182, 140, 140);
		f.getContentPane().add(b5);

		JLabel lblNewLabel = new JLabel("랜덤 점심 메뉴");
		lblNewLabel.setBounds(206, 16, 74, 16);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("차는 어떻게 울까요");
		lblNewLabel_1.setBounds(42, 16, 125, 16);
		f.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("당신은 무슨 띠?");
		lblNewLabel_2.setBounds(356, 16, 93, 16);
		f.getContentPane().add(lblNewLabel_2);

		f.setVisible(true);
	}

}
