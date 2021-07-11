package 문제풀이;

public class BbsDB {

	public void create(String num, String writer, String title, String contents) {
		System.out.println(num + "번 글");
		System.out.println("제목: " + title);
		System.out.println("작성자: " + writer);
		System.out.println("내용: " + contents);

	}

	public void delete(String num) {
		System.out.println(num + "번 게시글이 삭제되었습니다.");
	}

}
