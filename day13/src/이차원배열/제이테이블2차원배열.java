package 이차원배열;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 제이테이블2차원배열 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(300, 300);

//		테이블의 제목
		String[] title = { "컴퓨터", "영어", "수학", "체육" };
//		테이블의 내용
		String[][] contents = { { "100", "88", "99", "77" }, { "60", "87", "79", "78" }, { "90", "83", "89", "79" },
				{ "80", "86", "59", "80" } };
//		테이블에 삽입
		JTable table = new JTable(contents, title);
//		scroll패널 생성해서 table 얹기
		JScrollPane scroll = new JScrollPane(table);
//		jframe에 스크롤패널 얹기
		f.add(scroll);
		
		f.setVisible(true);
	}

}
