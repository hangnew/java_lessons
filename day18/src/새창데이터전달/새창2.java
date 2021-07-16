package 새창데이터전달;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 새창2 {

	public void open2(String m) {
		JFrame f = new JFrame("새창2 화면");
		f.setSize(800 , 1000);
		JButton b1 = new JButton(m + " 새창2 화면 닫기");
//		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "새창2를 닫습니다.");
//				System.exit(0);
				f.dispose();
			}
		});
		
		f.add(b1);
		f.setVisible(true);
	}
}
