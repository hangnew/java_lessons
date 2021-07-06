package 배열응용;

import java.util.Scanner;

public class 스트링을배열로 {

	public static void main(String[] args) {

		String s = "감자,고구마,양파";
		String[] s2 = s.split(","); // { "감자", "고구마", "양파" }
		System.out.println(s2[0]);
		System.out.println(s2[1]);
		System.out.println(s2[2]);
		System.out.println(s2.length);
		System.out.println(s2[0].equals(s2[1]));

//		일,월,화 날씨를 순서대로 스캐너로 입력해보세요 (흐림,맑음,흐림)
//		흐림이 몇 개인지, 맑음이 몇 개인지 세어보세요
//		1. Sc.next()로 받아서
//		2. 스트링을 끊어서 배열로 변환해서 넣으세요
//		3. count 해보세요

		Scanner sc = new Scanner(System.in);
		System.out.print("일,월,화 날씨를 순서대로 입력해주세요.(공백없이)>> ");
		String weather1 = sc.next(); // "흐림,맑음,흐림" 입력 받아서 String 변수 weather1에 넣기
		String[] weather2 = weather1.split(","); // weather1을 ","기준으로 끊어서 새로운 String배열 weather2에 넣기
		int countC = 0; // 흐림 카운트
		int countS = 0; // 맑음 카운트
		for (int i = 0; i < weather2.length; i++) {
			if (weather2[i].equals("흐림")) { // weather2속 값이 "맑음"일 때
				countC++; // 맑음 카운트 + 1
			} else { // weather2속 값이 "맑음"이 아닐 때 (="흐림"일 때)
				countS++; // 흐림 카운트 + 1
			}
		} // for
		System.out.println("흐림: " + countC + "번");
		System.out.println("맑음: " + countS + "번");
		sc.close();
	}// main

}// class
