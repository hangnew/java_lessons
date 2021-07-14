package db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BbsDAO {

//	java에서 db처리할 때 DML 중심으로 클래스를 만든다
//	db연결할 때는 db를 단위로 연결한다
//	db연결하여 데이터 처리를 하는 클래스를 만들 때는 table 단위로 만든다 (table = entity, 개체)
//	create (insert ~ into values)

	public int create(String id, String pw, String name, String tel) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("1. connector 연결 성공");

		String url = "jdbc:mysql://localhost:3306/book";
		String username = "root";
		String password = "cnzk0531";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. book db연결 성공");

		String sql = "insert into member values (?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3. sql문 생성 성공");

		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 성공");
		System.out.println("SQL문 수행 개수: " + result + "개");
		return result;
	}

	public int update(String id, String tel) throws Exception {

		// java와 db 연결하는 프로그램 : JDBC
		// 1. jdbc connector 설정
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("1. connector 연결 성공");

		// 2. java에서 db로 연결 : { ip, port, db명, id, pw } 5가지 필요
		// url = (ip, port, db명)
		String url = "jdbc:mysql://localhost:3306/book";
		String username = "root";
		String password = "cnzk0531";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. book db연결 성공");

		// 3. SQL문 작성
		String sql = "update member set tel = ? where id = ?";
//		PreparedStatement : sql을 나타내는 부품
//		2단계에서 획득한 Connection 부품이 return해준다
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, tel);
		ps.setString(2, id);
		System.out.println("3. sql문 생성 성공");

		// 4. SQL문을 mySQL로 전송한다
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 성공");
		System.out.println(result);
		return result;
	}

	public int delete(String id) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("1. connector 연결 성공");

		String url = "jdbc:mysql://localhost:3306/book";
		String username = "root";
		String password = "cnzk0531";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. book db연결 성공");

		String sql = "delete from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. sql문 생성 성공");

		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 성공");
		System.out.println(result);
		return result;
	}

} // class
