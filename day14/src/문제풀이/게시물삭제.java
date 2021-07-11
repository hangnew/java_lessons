package 문제풀이;

import javax.swing.JOptionPane;

public class 게시물삭제 {

	public static void main(String[] args) {
		
		BbsDB db = new BbsDB();
		String num = JOptionPane.showInputDialog("삭제하고 싶은 게시글 번호를 입력하세요.");
		db.delete(num);
		
	}

}
