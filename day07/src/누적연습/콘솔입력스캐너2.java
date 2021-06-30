package 누적연습;

import java.util.Scanner;

public class 콘솔입력스캐너2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 1 입력 >> ");
		int n1 = sc.nextInt();
		System.out.print("숫자 2 입력 >> ");
		int n2 = sc.nextInt();

		if (n1 > n2) {
			System.out.println("앞 숫자가 크다.");
		} else {
			System.out.println("뒷 숫자가 크다.");
		}
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);

		System.out.print("당신이 좋아하는 과목은? (자바, c++, python 중) >> ");
		String subj1 = sc.next();
//		switch (subj1) {
//		case "자바":
//			System.out.println("JSP 점프@@");
//			break;
//		case "c++":
//			System.out.println("ASP 점프@@");
//			break;
//		case "python":
//			System.out.println("python으로 점프@@");
//			break;
//		default:
//			System.out.println("자바, c++, python 중 입력해주세요.");
//			break;
//		}

		if (subj1.equals("자바")) {
			System.out.println("JSP 점프@@");
		} else if (subj1.equals("c++")) {
			System.out.println("ASP 점프@@");
		} else if (subj1.equals("python")) {
			System.out.println("python으로 점프@@");
		} else {
			System.out.println("자바, c++, python 중 입력해주세요.");
		}

	} // main

}// class