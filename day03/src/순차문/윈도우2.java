package 순차문;	// Swing 작업

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 윈도우2 {
	private static JTextField textField;
	private static JTextField textField_1;

	public static void main(String[] args) {
		
		JFrame f = new JFrame();		// 새로운 JFrame f 생성
		f.setSize(500, 500);			// frame 사이즈 (width, height)
		f.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("버튼1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("저를 누르셨군요?");
				JOptionPane.showMessageDialog(f, "저를 누르셨군요.");				// 메세지창 출력 (위치, "메시지")
			}
		});
		btnNewButton.setForeground(Color.MAGENTA);
		btnNewButton.setFont(new Font("MuseumClassic", Font.PLAIN, 20));
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setBounds(171, 170, 145, 75);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("버튼2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("저도 누르셨군요?");
			}
		});
		btnNewButton_1.setForeground(Color.GREEN);
		btnNewButton_1.setBackground(Color.MAGENTA);
		btnNewButton_1.setBounds(171, 262, 145, 75);
		f.getContentPane().add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(171, 361, 145, 26);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(124, 366, 33, 16);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("패스워드");
		lblNewLabel_1.setBounds(113, 394, 44, 16);
		f.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(171, 389, 145, 26);
		f.getContentPane().add(textField_1);
		
		
		
		//set Visible 전에 입력된 값은 적용되지 않는다. 
		f.setVisible(true);			// true:표시 false:표시하지않음
	}
}
