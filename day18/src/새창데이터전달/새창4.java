package 새창데이터전달;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 새창4 {
	
//	결정 누르면
//	새창4 open4() 완성
//	30도가 넘으면 폭염
//	30도가 넘지 않으면 견딜만해요
	
	public void open4(int temp) {
		String m = "";
		if (temp >= 30) {
			m = "폭염";
		} else {
			m = "견딜만해요.";
		} // if
		JFrame f = new JFrame("새창4");
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		f.setSize(200, 70);
		JButton b1 = new JButton(m);
		f.add(b1);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(b1, "창닫습니다.");
				f.dispose();
			}
		}); // action
		f.setVisible(true);
	}

}
