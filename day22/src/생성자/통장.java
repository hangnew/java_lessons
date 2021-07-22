package 생성자;

public class 통장 {
	// 멤버 변수
	String name;
	String ssn;
	int money;
	
	// 기본 생성자
//	public 통장() {
//	다른 생성자가 존재하지 않을 때 자동 생성된다.
//	}
	
	public 통장(String name, String ssn, int money) {
		this.name = name;
		this.ssn = ssn;
		this.money = money;
	}

//	오버라이드 : 이미 존재하는 메서드를 똑같은 형태로 다시 한 번 정의해주면 기존 메서드를 덮어 씌운다.
//	@ : Annotation, 표시
	@Override
	public String toString() {
		return "통장 [name=" + name + ", ssn=" + ssn + ", money=" + money + "]";
	}

	// 멤버 메서드
	public void deposit() {
		System.out.println("deposit");
	}
} // class
