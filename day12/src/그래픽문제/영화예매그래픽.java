package 그래픽문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 영화예매그래픽 {

	public static void main(String[] args) {

		JFrame f = new JFrame("영화예매 그래픽 버전");
		f.setSize(800, 800);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		int[] seat = new int[200]; // { 0, 0, 0, 0, 0 ..... 0 }

		for (int i = 0; i < 200; i++) {
			JButton b = new JButton(i + ""); // String.valueOf(0);
			b.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String s = e.getActionCommand();
					int index = Integer.parseInt(s);
					seat[index] = 1;
					JOptionPane.showMessageDialog(f, index + " 예약됨");
					// 버튼을 비활성화
					b.setEnabled(false);
					b.setBackground(Color.red);
					b.setOpaque(true);
//					b.setBorderPainted(false);
				}
			});
			f.add(b);
		}

		JButton b2 = new JButton("<<< 결제하기 >>>");
		Font font = new Font(null, Font.BOLD, 30);
		b2.setFont(font);
		b2.setBackground(Color.yellow);
		b2.setOpaque(true);
		b2.setBorderPainted(false);
//		결제하기 버튼을 누르면
//		1) 배열 안에 1이 몇 개인지 세어보기
//		2) 금액 10000원씩 계산 후에
//		3) 결제 금액 알려주세요
//		4) 몇 번 좌석을 예약했는지 출력해주세요
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int count = 0;
				final int MONEY = 10000;
				String book = "";
				for (int i = 0; i < seat.length; i++) {
					if (seat[i] == 1) {
						count++;
						book = book + i + "번 ";
					}
				} // for
				int payment = count * MONEY;
				JOptionPane.showMessageDialog(f, "결제 금액: " + payment + "원");
				JOptionPane.showMessageDialog(f, "예약된 자리: " + book);
			}// actionPerformed
		}); // ActionListener
		f.add(b2);

		f.setVisible(true);

	}

}
