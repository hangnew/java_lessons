package 상속;

public class SuperMan extends Man{
	// Man 클래스를 상속 받아
	// 멤버 변수 3개, 멤버 메서드 3개인 상태
	
	
	// 현재 생성자가 하나도 정의되어 있지 않으므로 기본 생성자가 만들어진 상태이다.
	
	
	boolean fly;
	
	public void space() {
		System.out.println("우주를 날아다니다.");
	}

	@Override
	public String toString() {
		return "SuperMan [fly=" + fly + ", power=" + power + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
