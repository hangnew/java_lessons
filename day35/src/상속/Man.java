package 상속;

public class Man extends Person{
	// Person 클래스를 상속받아서 
	// 이미 멤버 변수 2개, 멤버 메서드 2개를 가지고 태어났다.
	int power;
	
	
	// 현재 생성자가 하나도 정의되어 있지 않으므로 기본 생성자가 만들어진 상태이다.
	
	
	public void run() {
		System.out.println("빨리 달리다");
	}


	@Override
	public String toString() {
		return "Man [power=" + power + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	// Man 클래스는 총 멤버 변수 3개, 멤버 메서드 3개를 가지게 된다.
}
