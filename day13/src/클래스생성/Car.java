package 클래스생성;

public class Car {
	
	// 성질 : 멤버 변수. 
	// 전역 변수 (global variables)
	
	// 색(color), 바퀴수(count)
	public String color; // 자동초기화 null
	public int count; // 자동초기화 0
	
	// 동작 : 멤버 메서드
	public void run() {
		// { } 안에 함수의 기능을 정의
		System.out.println("네 바퀴로 달리자");
	} // run
	
	public void up() {
		System.out.println("속도를 20씩 빨라진다");
	} // up
	
} // class
