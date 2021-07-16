package db연결;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MemberUI {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lbl1 = new JLabel("아이디");
		lbl1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lbl1.setBounds(59, 52, 79, 31);
		f.getContentPane().add(lbl1);
		
		JLabel lbl2 = new JLabel("패스워드");
		lbl2.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lbl2.setBounds(59, 115, 100, 31);
		f.getContentPane().add(lbl2);
		
		JLabel lbl3 = new JLabel("이름");
		lbl3.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lbl3.setBounds(59, 175, 79, 31);
		f.getContentPane().add(lbl3);
		
		JLabel lbl4 = new JLabel("전화번호");
		lbl4.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lbl4.setBounds(59, 236, 100, 36);
		f.getContentPane().add(lbl4);
		
		t1 = new JTextField();
		t1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		t1.setBounds(190, 51, 223, 33);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		t2.setColumns(10);
		t2.setBounds(190, 115, 223, 33);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		t3.setColumns(10);
		t3.setBounds(190, 175, 223, 33);
		f.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		t4.setColumns(10);
		t4.setBounds(190, 236, 223, 33);
		f.getContentPane().add(t4);
		
		JButton btn1 = new JButton("가입");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// t1 ~ t4에 입력된 값을 가지고 와야 한다
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				MemberDAO db = new MemberDAO(); 
				// member 테이블에 저장하려고 한다 :
				// 우리가 원하는 기능을 가진 메서드를 가지고 있는 부품을 찾아야 한다
				// 그 부품을 램에 가져다 놓는다
				try {
					int result = db.create(id, pw, name, tel); // result를 return해준다
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "회원가입 성공");
					} else {
						JOptionPane.showMessageDialog(f, "회원가입 실패");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				// 입력한 것을 지워버리자
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				
			} // actionListener
		});
		btn1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		btn1.setBounds(42, 361, 117, 51);
		f.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("탈퇴");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//id를 입력받아야 함
				String id = JOptionPane.showInputDialog(f, "탈퇴할 id입력");
				//db 처리
				MemberDAO db = new MemberDAO();
				try {
					int result = db.delete(id);
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "탈퇴 성공");
					} else {
						JOptionPane.showMessageDialog(f, "없는 id입니다");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btn2.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		btn2.setBounds(182, 361, 117, 51);
		f.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("수정");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//id를 입력받아야 함
				String id = JOptionPane.showInputDialog(f, "연락처 수정할 id입력");
				String tel = JOptionPane.showInputDialog(f, "새 연락처 입력");
				//db처리
				MemberDAO db = new MemberDAO();
				try {
					int result = db.update(id, tel);
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "수정 성공");
					} else {
					JOptionPane.showMessageDialog(f, "없는 id입니다.");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btn3.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		btn3.setBounds(329, 361, 117, 51);
		f.getContentPane().add(btn3);
		
		f.setVisible(true);
		
	} // main
} // class
