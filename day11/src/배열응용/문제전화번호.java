package 배열응용;

import java.util.Scanner;

public class 문제전화번호 {

	public static void main(String[] args) {

//		전화번호 입력>> 011-245-1234
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호 입력>> ");
		String input = sc.next();

//		1) 양쪽 공백을 제거하시오
		String input2 = input.trim();

//		2) -을 기준으로 분리하세요 (String[])
		String[] input3 = input2.split("-"); // { "011", "245", "1234" }

//		3) 첫번째 문자열이 011이면 SK, 019면 LG, 나머지는 Apple
		if (input3[0].equals("011")) {
			System.out.println("SK");
		} else if (input3[0].equals("019")) {
			System.out.println("LG");
		} else {
			System.out.println("APPLE");
		}

//		4) 두번째 문자열의 길이가 4개 이상이면 최신폰, 아니면 올드폰
		if (input3[1].length() >= 4) {
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");
		}

//		5) 전체 전화번호의 길이가 10글자 이상이면 유효한 전화번호
//		   아니면 유효하지 않은 전화번호
		if (input2.length() >= 10) {
			System.out.println("유효한 전화번호");
		} else {
			System.out.println("유효하지 않은 전화번호");
		}
		
		sc.close();
	}// main

}// class
