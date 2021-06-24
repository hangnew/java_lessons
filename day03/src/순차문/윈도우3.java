package 순차문;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;

public class 윈도우3 {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;

	public static void main(String[] args) {
		
		JFrame f = new JFrame();		// 새로운 JFrame f 생성
		f.getContentPane().setBackground(new Color(0, 204, 204));
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("나의 일기장");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 80));
		lblNewLabel.setBounds(54, 6, 374, 149);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("오늘의 일기 작성을 시작합니다.");
		lblNewLabel_1.setBounds(163, 167, 159, 16);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("번호");
		lblNewLabel_1_1.setBounds(39, 210, 22, 16);
		f.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("날짜");
		lblNewLabel_1_1_1.setBounds(39, 238, 22, 16);
		f.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("제목");
		lblNewLabel_1_1_2.setBounds(39, 266, 22, 16);
		f.getContentPane().add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("내용");
		lblNewLabel_1_1_3.setBounds(39, 295, 22, 16);
		f.getContentPane().add(lblNewLabel_1_1_3);
		
		textField = new JTextField();
		textField.setBounds(73, 205, 355, 26);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(73, 233, 355, 26);
		f.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(73, 261, 355, 26);
		f.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(73, 290, 355, 97);
		f.getContentPane().add(textField_3);
		
		JButton btnNewButton = new JButton("일기저장");
		btnNewButton.setBackground(new Color(255, 51, 102));
		btnNewButton.setBounds(54, 412, 117, 29);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("낙서장");
		btnNewButton_1.setBounds(183, 412, 117, 29);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("끝내기");
		btnNewButton_2.setBounds(311, 412, 117, 29);
		f.getContentPane().add(btnNewButton_2);
		//set Visible 전에 입력된 값은 적용되지 않는다. 
		f.setVisible(true);			// true:표시 false:표시하지않음
	}

}
