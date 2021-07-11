package 프로젝트정리;

public class 결제테이블연결 {

//	db 작업하는 class는 테이블 당 하나씩 만들어야 한다
	
	String ip = "localhost";
	String port = "3306";
	String id = "root";
	String pw = "1234";
	String table = "payment";

	public void create() {
		System.out.println("결제하기 버튼 누르면 payment table에 record");
//		String sql = "insert into payment values ( 'O', 'O', 'O', 'O' ... )";
	}

	public void read() {
		System.out.println("결제완료 페이지에서 payment table 검색해서 출력");
//		String sql = "select * from payment where id = 'OOO'";
	}

}
