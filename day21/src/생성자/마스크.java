package 생성자;

public class 마스크 {
//	속성 = 멤버 변수
//	멤버 변수는 자동 초기화
//	색, 가격
	String color; // 참조형 : null
	int price; // 기본형 : 0
	
//	생성자
//	객체 생성시 클래스와 동일한 이름의 메서드가 자동 호출된다.
//	객체 생성시 넣어주어야 하는 처음값을 넣어주기 위해서 사용한다.
	public 마스크(String c, int p) {
		color = c;
		price = p;
	}
	
//	동작 = 멤버 메서드
	public void cover() {
		System.out.println("마스크쓰다");
	}
	
	public String toString() { // 객체의 주소 대신 출력하고 싶은 값을 return시킬 때
		return color + " " + price;
	}
} // class