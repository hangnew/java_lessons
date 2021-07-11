package 문제풀이;

import javax.swing.JOptionPane;

public class 게시물등록 {

	public static void main(String[] args) {
		
		BbsDB db = new BbsDB();
		String num = JOptionPane.showInputDialog("게시글 번호를 입력하세요.");
		String writer = JOptionPane.showInputDialog("작성자를 입력하세요.");
		String title = JOptionPane.showInputDialog("제목을 입력하세요.");
		String contents = JOptionPane.showInputDialog("내용을 입력하세요.");
		
		db.create(num, writer, title, contents);
		
	}

}
