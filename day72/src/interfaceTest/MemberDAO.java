package interfaceTest;

public class MemberDAO implements MemberDAOInterface {

	@Override
	public int insert(String id, String pw, String name, String tel) {
		return 1;
	}
	
	@Override
	public int update(String id, String pw, String name, String tel) {
		return 1;
	}
	
	@Override
	public int delete(String id, String pw, String name, String tel) {
		return 1;
	}
	
	@Override
	public String select(String id, String pw, String name, String tel) {
		return "ok";
	}
	
}
