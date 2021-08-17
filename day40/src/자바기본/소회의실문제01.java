package 자바기본;

import java.util.Scanner;

public class 소회의실문제01 {

	public static void main(String[] args) {
		// 문제 : 사용자에게 숫자를 입력 받아 그 수가 소수인지 아닌지를 알려주세요.
		// 스캐너, boolean, for, if 사용
		
		// 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		// 사용자에게 숫자 입력받기
		System.out.print("소수인지 궁금한 숫자를 입력하세요>> ");
		int number = sc.nextInt();
		// 소수인지 아닌지 판단할 flag 선언
		boolean flag = true;
		// 2부터 입력받은 숫자만큼 1씩 증가하며 나눠본다.
		for (int i = 2; i < number; i++) {
			// 나머지가 0이라면 소수가 아니므로 flag의 값이 false가 되고 그 즉시 for문 종료
			if (number % i == 0) {
				flag = false;
				break;
			}
		}
		// 결과를 알려준다.
		if (flag && number > 1) {
			System.out.println(number + ": 소수입니다.");
		} else {
			System.out.println(number + ": 소수가 아닙니다.");
		}
		// 입력 스트림 닫기
		sc.close();
	}
}
