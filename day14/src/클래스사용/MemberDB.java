package 클래스사용;

import java.sql.DriverManager;

public class MemberDB {

//	DB작업
//	1. (DBMS) DB생성, 테이블 생성
//	2. 데이터 조작 (Create Read Update Delete)

	String ip = "localhost"; // 127.0.0.1
	String port = "3306";
	String user = "root";
	String pass = "cnzk0531";
	String table = "member";

	public void login(String id, String pw) {
//		회원가입시 사용한 id가 apple, pw가 1111
		if (id.equals("apple") && pw.equals("1111")) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
	}

	public void create(String id, String pw, String name, String tel) throws Exception {
//		DB와 연결하기
//		1) 연결할 mySQL server의 정보가 필요하다 (IP & port)
//		2) server의 승인을 받아야 한다 (ID & Password)

		System.out.println(ip + port + "에 연결되었습니다.");
		System.out.println("회원가입 처리");
		System.out.println("도착한 id는 " + id);
		System.out.println("도착한 pw는 " + pw);
		System.out.println("도착한 name는 " + name);
		System.out.println("도착한 tel는 " + tel);

//		Java-mySQL의 연결 순서
//		Java DB Connectivity
//		1) connector 설정
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("1. 커넥터 설정 성공");

//		2) mysql server의 db와 연결 - 승인
		String url = "jdbc:mysql://" + ip + ":" + port + "/shoes";
		DriverManager.getConnection(url, user, pass);
		System.out.println("2. mySQL 서버 승인/연결 성공!");

//		3) sql을 만들자
//		4) sql을 mysql server에 전송
	}

	public void read(String id) {
		System.out.println("회원정보 검색 처리");

	}

	public void update() {
		System.out.println("회원정보 수정 처리");

	}

	public void delete(String id) {
		System.out.println("회원정보 삭제 처리");
		System.out.println(id + "님의 탈퇴가 완료되었습니다.");

	}

}
