package interfaceTest;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyWindow3{
	
	JLabel l1;
	
	public MyWindow3() {
		JFrame f = new JFrame("My Window");
		f.setSize(300, 300);
		
		FlowLayout layout = new FlowLayout();
		f.setLayout(layout);
		
		JButton b1 = new JButton("push me");
		f.add(b1);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				l1.setText("b1 clicked");
			}
		});
		
		JButton b2 = new JButton("touch me");
		f.add(b2);
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				l1.setText("b2 clicked");
			}
		});
		
		JButton b3 = new JButton("click me");
		f.add(b3);
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				l1.setText("b3 clicked");
			}
		});
		
		l1 = new JLabel("result");
		l1.setFont(new Font("Maven Pro", Font.BOLD, 30));
		l1.setForeground(Color.ORANGE);
		f.add(l1);
		
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyWindow3();
	}

}
