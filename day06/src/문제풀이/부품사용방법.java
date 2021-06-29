package 문제풀이;

import java.util.Date;
import java.util.Scanner;

public class 부품사용방법 {

	public static void main(String[] args) {

//		망치 : 너무 자주 사용하여 RAM에 이미 들어가 있음
//		클래스 이름으로 바로 사용 가능 
//		Integer, Double, System, JOptionPane ...
//		부품의 기능이 선택의 기준이 된다 = 함수를 가지고 있는 부품을 선택하기

//		벽돌
//		Date name;				name이라는 이름의 Date(부품) 변수 생성 = 선언
//		name = new Date();		name 안에 새로운 Date를 RAM에 복사 = 대입

		Date date = new Date();

//		Scanner sc = new Scanner(System.in);
//		Scanner () 괄호 안에 입력 방법을 넣어줘야 한다 = 생성자 Constructor
//		System.in : 키보드로 입력

		int hour = date.getHours();
		System.out.println("현재 시각은 " + hour + "시");
		System.out.println(date.getMinutes()); // 변수로 미리 선언하지 않고 바로 출력값에 넣어도 된다

//		함수는 반환값이 있는 것이 있고, 없는 것도 있다.
//		반환 = return
//		반환이 없는 경우 = void (텅 비어있는)
//		반환이 존재하는 함수만 print가 가능하다

		int month = date.getMonth() + 1;
		
		String result = "해당 계절이 없습니다"; // 초기값을 집어 넣어도 된다
		if (month == 3 || month == 4 || month == 5) {
			result = "봄";
		} else if (month == 6 || month == 7 || month == 8) {
			result = "여름";
		} else if (month == 9 || month == 10 || month == 11) {
			result = "가을";
		} else {
			result = "겨울";
		}
		System.out.println(result);

		int day = date.getDay(); // 요일
		if (day == 0 || day == 6) {
			System.out.println("주말에는 놀아요");
			// if문에는 자체적으로 break가 걸린다
		} else {
			System.out.println("주중에는 달려요");
		}

		while (true) {
			System.out.println("달려요 달려요");
			System.out.println("또 달려요");
			System.out.println("마지막 달려요");
			break;
		}

		switch (month) { // 조건 : 연산 or 문법
		case 6: 
		case 7: 
		case 8: // month가 6, 7, 8인 경우에
				// case 6: case 7: case 8:        한줄에 써도 된다
			System.out.println("여름입니다.");
			break;
		default: // else와 같다
			System.out.println("여름이 아니야");
			break;
		}

		
		switch (month) {
		case 3: case 4: case 5:
			System.out.println("봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println("여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println("가을입니다.");
			break;
		default:
			System.out.println("겨울입니다");
			break;
		}
		
		switch (month) { // 실수는 switch case 에 넣을 수 없다
		case 2:
			System.out.println("28일");
			break;
		case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("31일");
		default:
			System.out.println("30일");
			break;
		}
		
	} // main

}/// class
