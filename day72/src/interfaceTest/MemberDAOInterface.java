package interfaceTest;

public interface MemberDAOInterface {

	int insert(String id, String pw, String name, String tel);

	int update(String id, String pw, String name, String tel);

	int delete(String id, String pw, String name, String tel);

	String select(String id, String pw, String name, String tel);

}