package interfaceTest;

public class BbsDAO implements BbsDAOInterface {

	@Override
	public void create(int no, String title, String content) {
		System.out.println("bbs 테이블 jdbc 삽입 처리");
	}

	@Override
	public void delete(int no) {
		System.out.println("bbs 테이블 jdbc 삭제 처리");
	}

}
