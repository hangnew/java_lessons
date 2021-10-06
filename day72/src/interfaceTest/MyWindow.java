package interfaceTest;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow {
	
	public static void main(String[] args) {
		JFrame f = new JFrame("My Window");
		f.setSize(300, 300);
		
		FlowLayout layout = new FlowLayout();
		f.setLayout(layout);
		
		JButton b1 = new JButton("push me");
		f.add(b1);
		b1.addActionListener(new ClickClass());
		
		JButton b2 = new JButton("touch me");
		f.add(b2);
		b2.addActionListener(new ClickClass2());
		
		f.setVisible(true);
	}
}
