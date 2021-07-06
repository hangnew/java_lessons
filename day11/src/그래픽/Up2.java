package 그래픽;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Up2 {

	public void up2() {
		JFrame f = new JFrame("업프레임2");
		f.setSize(300, 300);
		JButton b = new JButton("나를 눌렀군");
		b.setBackground(Color.red);
		b.setOpaque(true);
		b.setBorderPainted(false);
		f.add(b);
		f.setVisible(true);
	}

}
