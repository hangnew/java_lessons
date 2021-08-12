package 상속;

public class SuperManUser {

	public static void main(String[] args) {
		SuperMan sMan = new SuperMan();
		sMan.name = "클라크"; // Person의 멤버변수
		sMan.age = 1000; // Person의 멤버변수
		sMan.power = 3000; // Man의 멤버변수
		sMan.fly = true; // SuperMan의 멤버변수
		
		System.out.println(sMan);
		sMan.think(); // Person의 멤버 메서드
		sMan.tool(); // Person의 멤버 메서드
		sMan.run(); // Man의 멤버 메서드
		sMan.space(); // SuperMan의 멤버 메서드
	} // main

}
