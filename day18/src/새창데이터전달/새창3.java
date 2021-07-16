package 새창데이터전달;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 새창3 {

//	로그인 처리를 누르면
//	새창3 open3() 완성
//	id : root
//	pw : pass

	public void open3(String id, String pw) {
		String m = "";
		if (id.equals("root") && pw.equals("pass")) {
			m = "로그인 성공";
		} else {
			m = "로그인 실패";
		} // if
		JFrame f = new JFrame("새창3");
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
