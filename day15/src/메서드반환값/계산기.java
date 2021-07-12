package 메서드반환값;

public class 계산기 {
//	성질 : 멤버 변수
//	동작 : 멤버 메서드
	
//	메서드 정의
//	여기서 int x, y 는 add { } 지역 변수
//	메서드 사용 (호출, call)
//	메서드 안에서 값을 전달할 목적으로 생성되는 변수 : 매개 변수
	public int add(int x, int y) {
		int result = x + y;
		System.out.println("두 수의 합은 " + result);
		return result;
	}
	
	
} // class
