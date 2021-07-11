package 클래스생성;

public class TV { // extends Object 생략

//	클래스를 만들 때 그 부품들이 가지는 특징을 선택해서 틀을 만들게 된다.
//	1) 성질(변수) : 채널, 볼륨, 전원
//	2) 동작(메서드) : 켜다, 끄다, 볼륨조절
	
//	전역 변수는 자동 초기화가 된다. ( <-> 지역 변수는 자동 초기화가 안 된다.)
	public int ch; 
	public int vol;
	public boolean onOff;
	
//	멤버 메서드 정의할 때 고려사항
//	1. 입력값이 있는가 
//	2. 반환값이 있는가
	public void tv켜다() {
		System.out.println("리모콘으로 on버튼을 누르다");
	} // tv켜다 메서드
	
	public void tv끄다() {
		System.out.println("리모콘으로 off버튼을 누르다");
	} // tv끄다 메서드
	
	public void 볼륨up하다() {
		System.out.println("볼륨을 1씩 up");
	} // 볼륨up하다 메서드
	
	
	
} // class
 