package 생성자;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 윈도우화면 {

	public static void main(String[] args) {
		JFrame f = new JFrame("생성자 테스트");
		f.setSize(300, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton b = new JButton("Button");
		f.add(b);
		JButton b2 = new JButton("Button2");
		f.add(b2);
		
		Font font = new Font("Courier New", Font.BOLD, 50);
		b.setFont(font);
		b2.setFont(font);
		
//		b.setFont(new Font("Courier New", Font.BOLD, 20));
		
		f.setVisible(true);
	}

}
