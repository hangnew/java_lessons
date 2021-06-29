package 그래픽프로그램;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 버튼3개2 {

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 버튼 3개");
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JButton b = new JButton("");
		b.setBounds(26, 20, 450, 215); // (x-axis, y-axis, width, height)
		f.getContentPane().add(b);
		
		JLabel m = new JLabel("");
		m.setBounds(26, 250, 450, 215);
		f.getContentPane().add(m);
		
		// image 파일을 ImageIcon을 이용해 가져오기
		ImageIcon car1 = new ImageIcon("car1.png");
		ImageIcon car2 = new ImageIcon("car2.png");
		
		// setIcon으로 위에서 만든 Icon 삽입
		b.setIcon(car1);
		m.setIcon(car2);
		
		f.setVisible(true);
	}
}
