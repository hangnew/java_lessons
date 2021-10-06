package interfaceTest;

public interface BbsDAOInterface {

	// 입력값, 반환값, 메서드명 정의
	// 추상 메서드 (불완전한)
	public void create(int no, String title, String content);
	
	public void delete(int no);
	
}
