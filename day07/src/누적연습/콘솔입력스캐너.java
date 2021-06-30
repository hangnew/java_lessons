package 누적연습;

import java.util.Scanner;

public class 콘솔입력스캐너 {

	public static void main(String[] args) {

//		Scan , Scanner : 입력용
		Scanner sc = new Scanner(System.in); 
		System.out.print("당신의 이름을 입력하세요 >> ");
		String name = sc.next(); // String 입력 (단위 : 단어)
		System.out.println("당신의 이름은 " + name);
		
		System.out.print("당신의 소속을 입력하세요 >> ");
		String company = sc.next(); // String 입력 (단위 : 단어)
		System.out.println("당신의 소속은 " + company);
		
	} // main
} // class
